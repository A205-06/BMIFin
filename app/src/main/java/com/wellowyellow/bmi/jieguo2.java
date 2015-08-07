package com.wellowyellow.bmi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

/**
 * Created by Administrator on 2015/8/4.
 */
public class jieguo2 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jieguo2);

        Intent intent=getIntent();
        double  BMI=intent.getDoubleExtra("EXTRA", 0);
        TextView textView=(TextView)findViewById(R.id.result112);
        DecimalFormat nf = new DecimalFormat("0.00");
        textView.setText(nf.format(BMI) + "");
    }

    public void jumptozhuye(View view){
        Intent intent=new Intent(jieguo2.this,zhuye.class);
        startActivity(intent);
        jieguo2.this.finish();
    }
    public void jumptoxiangxixinxi(View view){
        Intent intent=new Intent(jieguo2.this,xiangxixinxi.class);
        startActivity(intent);
        jieguo2.this.finish();
    }
    public void jumptotuichu(View view){
        Intent intent=new Intent(jieguo2.this,tuichu.class);
        startActivity(intent);
        jieguo2.this.finish();
    }
}
