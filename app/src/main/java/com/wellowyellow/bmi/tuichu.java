package com.wellowyellow.bmi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Administrator on 2015/8/4.
 */
public class tuichu extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuichu);
    }
    public void jumptoqueding(View view){
       tuichu.this.finish();
    }
    //取消退出，返回主页
    public void jumptozhuye(View view){
        Intent intent=new Intent(tuichu.this,zhuye.class);
        startActivity(intent);
      tuichu.this.finish();

    }
}
