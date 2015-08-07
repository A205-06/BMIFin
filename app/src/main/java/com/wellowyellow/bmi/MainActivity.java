package com.wellowyellow.bmi;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;

import java.io.IOException;

public class MainActivity extends Activity {
    Handler handler = new Handler() {
        @Override
        public void handleMessage(android.os.Message msg) {
            switch (msg.what) {
                case 1:
                    Intent intent = new Intent(MainActivity.this, zhuye.class);
                    startActivity(intent);
                    MainActivity.this.finish();
                    break;
                default:
                    break;
            }
        }
    };
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
           handler.sendEmptyMessageDelayed(1, 3000);
            playLocalFile();
        }
    private MediaPlayer mMediaPlayer;
    private void playLocalFile(){
        //播放res目录下raw文件的fengling音乐
        mMediaPlayer= MediaPlayer.create(this, R.raw.fengling);
        try {
            mMediaPlayer.prepare();
        }
        catch (IllegalStateException e){}
        catch (IOException e){}
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
            public void onCompletion(MediaPlayer mp){

            }
        });
    }





        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }

        //监听按钮点击事件,从欢迎页跳到主页
       /* public void jump(View view) {
            Intent intent = new Intent(MainActivity.this, zhuye.class);
            startActivity(intent);
        }
*/
    }

