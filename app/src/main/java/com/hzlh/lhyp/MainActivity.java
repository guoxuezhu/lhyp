package com.hzlh.lhyp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private Socket socket;

    @BindView(R.id.tv_msg)
    TextView tv_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_send1)
    public void btn_send1() {
        tv_msg.setText("");
    }

    @OnClick(R.id.btn_send2)
    public void btn_send2() {
        //   SYM 0#   L1_Mute 1#   L1_UnMute 1#        L1_add1#   L1_sub1#
        sendMsg("L1_Mute 1#");
    }

    @OnClick(R.id.btn_send3)
    public void btn_send3() {
        sendMsg("L1_UnMute 1#");
    }

    @OnClick(R.id.btn_send4)
    public void btn_send4() {
        sendMsg("SYM 1#");
    }

    @OnClick(R.id.btn_send5)
    public void btn_send5() {
        sendMsg("SYM 0#");
    }

    @OnClick(R.id.btn_send6)
    public void btn_send6() {
        sendMsg("L1_add 1#");
    }

    @OnClick(R.id.btn_send7)
    public void btn_send7() {
        sendMsg("L1_sub 1#");
    }

    @OnClick(R.id.btn_send10)
    public void btn_send10() {
        sendMsg("Read_TotalTime#");
    }

    @OnClick(R.id.btn_send11)
    public void btn_send11() {
        sendMsg("ReadP#");
    }

    @OnClick(R.id.btn_send12)
    public void btn_send12() {
//        sendMsg("LOADP 1#");
    }

    @OnClick(R.id.btn_send13)
    public void btn_send13() { sendMsg("ReadL1 1#");
    }

    @OnClick(R.id.btn_send14)
    public void btn_send14() {sendMsg("SetL1 1:-20#");
    }

    @OnClick(R.id.btn_send15)
    public void btn_send15() {sendMsg("ReadL1 Mute#");
    }

    @OnClick(R.id.btn_send16)
    public void btn_send16() {sendMsg("ReadL2 Mute#");
    }

    @OnClick(R.id.btn_send17)
    public void btn_send17() {sendMsg("PSW_Reset#");
    }


    private void sendMsg(String data) {
        if (socket == null) {
            makeToast("请连接");
            return;
        }
        //   SYM 0#   L1_Mute 1#   L1_UnMute 1#        L1_add1#   L1_sub1#
        try {
            socket.getOutputStream().write(data.getBytes());
            socket.getOutputStream().flush();
            makeToast("发送数据成功");
        } catch (IOException e) {
            makeToast("发送数据IOException");
            e.printStackTrace();
        }
    }

    private void makeToast(final String msg) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
//                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
                tv_msg.setText(tv_msg.getText().toString() + "\n" + msg);
            }
        });
    }

    @OnClick(R.id.btn_connect)
    public void btn_connect() {
        new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    socket = new Socket("192.168.1.63", 1698);
                    makeToast("客户端连接成功");
                    timersend();
                    Log.i("==tcp===", "==========客户端连接成功===========" + socket.toString());
                    InputStream inputStream = socket.getInputStream();

                    byte[] buffer = new byte[1024];
                    int len = -1;
                    while ((len = inputStream.read(buffer)) != -1) {
                        String data = new String(buffer, 0, len);
                        Log.i("==tcp===", "收到服务器的数据-----------------------:" + data);
                        makeToast("收到服务器的数据:  " + data);
                    }
                    Log.i("==tcp===", "===========客户端断开连接");
                    makeToast("客户端断开连接");
                    inputStream.close();
                } catch (IOException e) {
                    Log.i("============", "==========eeeeeeeeee===========");
                    makeToast("客户端连接IOException");
                    e.printStackTrace();
                }


            }
        }.start();
    }

    private void timersend() {
        new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    makeToast("发送心跳数据包");
                    while (true) {
                        Thread.sleep(1000);
                        socket.getOutputStream().write("Rffhgfg".getBytes());
                        socket.getOutputStream().flush();
                    }
                } catch (InterruptedException e) {
                    Log.i("============", "=====发送心跳数据包=====InterruptedException===========");
                    makeToast("发送心跳数据包 InterruptedException");
                    e.printStackTrace();
                } catch (IOException e) {
                    Log.i("============", "=====发送心跳数据包=====IOException===========");
                    makeToast("发送心跳数据包 IOException");
                    e.printStackTrace();
                }
            }
        }.start();

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (socket != null) {
            try {
                socket.getInputStream().close();
                socket.getOutputStream().close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
