package com.hzlh.lhyp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private Socket socket;

    @BindView(R.id.et_yinpin_ip)
    EditText et_yinpin_ip;


    @BindView(R.id.seekBar_1)
    SeekBar seekBar_1;
    @BindView(R.id.seekBar_2)
    SeekBar seekBar_2;
    @BindView(R.id.seekBar_3)
    SeekBar seekBar_3;
    @BindView(R.id.seekBar_4)
    SeekBar seekBar_4;
    @BindView(R.id.seekBar_5)
    SeekBar seekBar_5;
    @BindView(R.id.seekBar_6)
    SeekBar seekBar_6;
    @BindView(R.id.seekBar_7)
    SeekBar seekBar_7;
    @BindView(R.id.seekBar_8)
    SeekBar seekBar_8;
    @BindView(R.id.seekBar_9)
    SeekBar seekBar_9;
    @BindView(R.id.seekBar_10)
    SeekBar seekBar_10;
    @BindView(R.id.seekBar_11)
    SeekBar seekBar_11;
    @BindView(R.id.seekBar_12)
    SeekBar seekBar_12;
    @BindView(R.id.seekBar_13)
    SeekBar seekBar_13;
    @BindView(R.id.seekBar_14)
    SeekBar seekBar_14;
    @BindView(R.id.seekBar_15)
    SeekBar seekBar_15;
    @BindView(R.id.seekBar_16)
    SeekBar seekBar_16;

    @BindView(R.id.tv_yl_1)
    TextView tv_yl_1;
    @BindView(R.id.tv_yl_2)
    TextView tv_yl_2;
    @BindView(R.id.tv_yl_3)
    TextView tv_yl_3;
    @BindView(R.id.tv_yl_4)
    TextView tv_yl_4;
    @BindView(R.id.tv_yl_5)
    TextView tv_yl_5;
    @BindView(R.id.tv_yl_6)
    TextView tv_yl_6;
    @BindView(R.id.tv_yl_7)
    TextView tv_yl_7;
    @BindView(R.id.tv_yl_8)
    TextView tv_yl_8;
    @BindView(R.id.tv_yl_9)
    TextView tv_yl_9;
    @BindView(R.id.tv_yl_10)
    TextView tv_yl_10;
    @BindView(R.id.tv_yl_11)
    TextView tv_yl_11;
    @BindView(R.id.tv_yl_12)
    TextView tv_yl_12;
    @BindView(R.id.tv_yl_13)
    TextView tv_yl_13;
    @BindView(R.id.tv_yl_14)
    TextView tv_yl_14;
    @BindView(R.id.tv_yl_15)
    TextView tv_yl_15;
    @BindView(R.id.tv_yl_16)
    TextView tv_yl_16;

    @BindView(R.id.checkBox_1)
    CheckBox checkBox_1;
    @BindView(R.id.checkBox_2)
    CheckBox checkBox_2;
    @BindView(R.id.checkBox_3)
    CheckBox checkBox_3;
    @BindView(R.id.checkBox_4)
    CheckBox checkBox_4;
    @BindView(R.id.checkBox_5)
    CheckBox checkBox_5;
    @BindView(R.id.checkBox_6)
    CheckBox checkBox_6;
    @BindView(R.id.checkBox_7)
    CheckBox checkBox_7;
    @BindView(R.id.checkBox_8)
    CheckBox checkBox_8;
    @BindView(R.id.checkBox_9)
    CheckBox checkBox_9;
    @BindView(R.id.checkBox_10)
    CheckBox checkBox_10;
    @BindView(R.id.checkBox_11)
    CheckBox checkBox_11;
    @BindView(R.id.checkBox_12)
    CheckBox checkBox_12;
    @BindView(R.id.checkBox_13)
    CheckBox checkBox_13;
    @BindView(R.id.checkBox_14)
    CheckBox checkBox_14;
    @BindView(R.id.checkBox_15)
    CheckBox checkBox_15;
    @BindView(R.id.checkBox_16)
    CheckBox checkBox_16;
    private int timernumer;
    private Timer timer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        seekBar_1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tv_yl_1.setText(i + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                setSendMsg(1, seekBar.getProgress());
            }
        });
        seekBar_2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tv_yl_2.setText(i + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                setSendMsg(2, seekBar.getProgress());
            }
        });
        seekBar_3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tv_yl_3.setText(i + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                setSendMsg(3, seekBar.getProgress());
            }
        });
        seekBar_4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tv_yl_4.setText(i + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                setSendMsg(4, seekBar.getProgress());
            }
        });
        seekBar_5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tv_yl_5.setText(i + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                setSendMsg(5, seekBar.getProgress());
            }
        });
        seekBar_6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tv_yl_6.setText(i + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                setSendMsg(6, seekBar.getProgress());
            }
        });
        seekBar_7.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tv_yl_7.setText(i + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                setSendMsg(7, seekBar.getProgress());
            }
        });
        seekBar_8.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tv_yl_8.setText(i + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                setSendMsg(8, seekBar.getProgress());
            }
        });
        seekBar_9.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tv_yl_9.setText(i + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                setSendMsg(9, seekBar.getProgress());
            }
        });
        seekBar_10.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tv_yl_10.setText(i + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                setSendMsg(10, seekBar.getProgress());
            }
        });
        seekBar_11.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tv_yl_11.setText(i + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                setSendMsg(11, seekBar.getProgress());
            }
        });
        seekBar_12.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tv_yl_12.setText(i + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                setSendMsg(12, seekBar.getProgress());
            }
        });
        seekBar_13.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tv_yl_13.setText(i + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                setSendMsg(13, seekBar.getProgress());
            }
        });
        seekBar_14.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tv_yl_14.setText(i + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                setSendMsg(14, seekBar.getProgress());
            }
        });
        seekBar_15.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tv_yl_15.setText(i + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                setSendMsg(15, seekBar.getProgress());
            }
        });
        seekBar_16.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tv_yl_16.setText(i + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                setSendMsg(16, seekBar.getProgress());
            }
        });

    }

    private void setSendMsg(int numer, int posion) {
        Log.i("=====", "======通道=====" + numer + "======大小=====" + posion);
        sendMsg("SetL1 " + numer + ":" + (posion - 71) + "#");
    }


    @OnClick(R.id.btn_connect)
    public void btn_connect() {
        new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    socket = new Socket(et_yinpin_ip.getText().toString(), 1698);
//                    makeToast("客户端连接成功");
                    timersend();
                    Log.i("==tcp===", "==========客户端连接成功===========" + socket.toString());
                    InputStream inputStream = socket.getInputStream();

                    byte[] buffer = new byte[1024];
                    int len = -1;
                    while ((len = inputStream.read(buffer)) != -1) {
                        String data = new String(buffer, 0, len);
                        Log.i("==tcp===", "收到服务器的数据-----------------------:" + data);
//                        makeToast("收到服务器的数据:  " + data);
                        if (data.substring(0, 8).equals("PreLevel")) {
                            // PreLevel 9:0.0dB    PreLevel 11:0.0dB  PreLevel 1:-70.0dB
                            int tdnum = Integer.valueOf(data.substring(data.indexOf(" ") + 1, data.indexOf(":")));
                            int fbdb = Integer.valueOf(data.substring(data.indexOf(":") + 1, data.indexOf(".")));
                            Log.i("==tcp===", "收到服务器的数据======111======" + tdnum);
                            Log.i("==tcp===", "收到服务器的数据======222======" + fbdb);

                            if (tdnum == 1) {
                                seekBar_1.setProgress(fbdb + 71);
                            } else if (tdnum == 2) {
                                seekBar_2.setProgress(fbdb + 71);
                            } else if (tdnum == 3) {
                                seekBar_3.setProgress(fbdb + 71);
                            } else if (tdnum == 4) {
                                seekBar_4.setProgress(fbdb + 71);
                            } else if (tdnum == 5) {
                                seekBar_5.setProgress(fbdb + 71);
                            } else if (tdnum == 6) {
                                seekBar_6.setProgress(fbdb + 71);
                            } else if (tdnum == 7) {
                                seekBar_7.setProgress(fbdb + 71);
                            } else if (tdnum == 8) {
                                seekBar_8.setProgress(fbdb + 71);
                            } else if (tdnum == 9) {
                                seekBar_9.setProgress(fbdb + 71);
                            } else if (tdnum == 10) {
                                seekBar_10.setProgress(fbdb + 71);
                            } else if (tdnum == 11) {
                                seekBar_11.setProgress(fbdb + 71);
                            } else if (tdnum == 12) {
                                seekBar_12.setProgress(fbdb + 71);
                            } else if (tdnum == 13) {
                                seekBar_13.setProgress(fbdb + 71);
                            } else if (tdnum == 14) {
                                seekBar_14.setProgress(fbdb + 71);
                            } else if (tdnum == 15) {
                                seekBar_15.setProgress(fbdb + 71);
                            } else if (tdnum == 16) {
                                seekBar_16.setProgress(fbdb + 71);
                            }

                        }
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
        timernumer = 1;
        if (timer == null) {
            timer = new Timer();
        }
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    if (timernumer < 17) {
                        String data = "ReadL1 " + timernumer + "#";
                        Log.i("============", "=====发送心跳数据包=====" + data);
                        socket.getOutputStream().write(data.getBytes());
                        socket.getOutputStream().flush();
                        if (timernumer == 16) {
                            timernumer = 1;
                        } else {
                            timernumer++;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    Log.i("============", "=====发送心跳数据包=====IOException===========");
                }
            }
        }, 1000, 1000);
    }


    @OnClick(R.id.checkBox_1)
    public void checkBox_1() {
        if (checkBox_1.isChecked()) {
            sendMsg("L1_Mute 1#");
        } else {
            sendMsg("L1_UnMute 1#");
        }
    }

    @OnClick(R.id.checkBox_2)
    public void checkBox_2() {
        if (checkBox_2.isChecked()) {
            sendMsg("L1_Mute 2#");
        } else {
            sendMsg("L1_UnMute 2#");
        }
    }

    @OnClick(R.id.checkBox_3)
    public void checkBox_3() {
        if (checkBox_3.isChecked()) {
            sendMsg("L1_Mute 3#");
        } else {
            sendMsg("L1_UnMute 3#");
        }
    }

    @OnClick(R.id.checkBox_4)
    public void checkBox_4() {
        if (checkBox_4.isChecked()) {
            sendMsg("L1_Mute 4#");
        } else {
            sendMsg("L1_UnMute 4#");
        }
    }

    @OnClick(R.id.checkBox_5)
    public void checkBox_5() {
        if (checkBox_5.isChecked()) {
            sendMsg("L1_Mute 5#");
        } else {
            sendMsg("L1_UnMute 5#");
        }
    }

    @OnClick(R.id.checkBox_6)
    public void checkBox_6() {
        if (checkBox_6.isChecked()) {
            sendMsg("L1_Mute 6#");
        } else {
            sendMsg("L1_UnMute 6#");
        }
    }

    @OnClick(R.id.checkBox_7)
    public void checkBox_7() {
        if (checkBox_7.isChecked()) {
            sendMsg("L1_Mute 7#");
        } else {
            sendMsg("L1_UnMute 7#");
        }
    }

    @OnClick(R.id.checkBox_8)
    public void checkBox_8() {
        if (checkBox_8.isChecked()) {
            sendMsg("L1_Mute 8#");
        } else {
            sendMsg("L1_UnMute 8#");
        }
    }

    @OnClick(R.id.checkBox_9)
    public void checkBox_9() {
        if (checkBox_9.isChecked()) {
            sendMsg("L1_Mute 9#");
        } else {
            sendMsg("L1_UnMute 9#");
        }
    }

    @OnClick(R.id.checkBox_10)
    public void checkBox_10() {
        if (checkBox_10.isChecked()) {
            sendMsg("L1_Mute 10#");
        } else {
            sendMsg("L1_UnMute 10#");
        }
    }

    @OnClick(R.id.checkBox_11)
    public void checkBox_11() {
        if (checkBox_11.isChecked()) {
            sendMsg("L1_Mute 11#");
        } else {
            sendMsg("L1_UnMute 11#");
        }
    }

    @OnClick(R.id.checkBox_12)
    public void checkBox_12() {
        if (checkBox_12.isChecked()) {
            sendMsg("L1_Mute 12#");
        } else {
            sendMsg("L1_UnMute 12#");
        }
    }

    @OnClick(R.id.checkBox_13)
    public void checkBox_13() {
        if (checkBox_13.isChecked()) {
            sendMsg("L1_Mute 13#");
        } else {
            sendMsg("L1_UnMute 13#");
        }
    }

    @OnClick(R.id.checkBox_14)
    public void checkBox_14() {
        if (checkBox_14.isChecked()) {
            sendMsg("L1_Mute 14#");
        } else {
            sendMsg("L1_UnMute 14#");
        }
    }

    @OnClick(R.id.checkBox_15)
    public void checkBox_15() {
        if (checkBox_15.isChecked()) {
            sendMsg("L1_Mute 15#");
        } else {
            sendMsg("L1_UnMute 15#");
        }
    }

    @OnClick(R.id.checkBox_16)
    public void checkBox_16() {
        if (checkBox_16.isChecked()) {
            sendMsg("L1_Mute 16#");
        } else {
            sendMsg("L1_UnMute 16#");
        }
    }


    @OnClick(R.id.btn_send1)
    public void btn_send1() {
//        tv_msg.setText("");
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
    public void btn_send13() {
        sendMsg("ReadL1 1#");
    }

    @OnClick(R.id.btn_send14)
    public void btn_send14() {
        sendMsg("SetL1 1:-20#");
    }

    @OnClick(R.id.btn_send15)
    public void btn_send15() {
        sendMsg("ReadL1 Mute#");
    }

    @OnClick(R.id.btn_send16)
    public void btn_send16() {
        sendMsg("ReadL2 Mute#");
    }

    @OnClick(R.id.btn_send17)
    public void btn_send17() {
        sendMsg("PSW_Reset#");
    }


    private void sendMsg(String data) {
        Log.i("=====", "======data=====" + data);
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
//                tv_msg.setText(tv_msg.getText().toString() + "\n" + msg);
            }
        });
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
        if (timer != null) {
            timer.cancel();
        }
    }
}
