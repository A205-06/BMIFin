package com.wellowyellow.bmi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

/**
 * Created by Administrator on 2015/8/4.
 */
public class jieguo3 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jieguo3);  Intent intent=getIntent();
        double  BMI=intent.getDoubleExtra("EXTRA", 0);
        TextView textView=(TextView)findViewById(R.id.result113);

        DecimalFormat nf = new DecimalFormat("0.00");
        textView.setText(nf.format(BMI) + "");
    }



    public void jumptozhuye(View view){
        Intent intent=new Intent(jieguo3.this,zhuye.class);
        startActivity(intent);
        jieguo3.this.finish();
    }
    public void jumptoxiangxixinxi(View view){
        Intent intent=new Intent(jieguo3.this,xiangxixinxi.class);
        startActivity(intent);
        jieguo3.this.finish();
    }
    public void jumptotuichu(View view){
        Intent intent=new Intent(jieguo3.this,tuichu.class);
        startActivity(intent);
        jieguo3.this.finish();
    }
}
