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
public class jieguo1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jieguo1);
        Intent intent=getIntent();
        double  BMI=intent.getDoubleExtra("EXTRA", 0);
        TextView textView=(TextView)findViewById(R.id.result111);

        DecimalFormat nf = new DecimalFormat("0.00");
        textView.setText(nf.format(BMI) + "");
    }
    public void jumptozhuye(View view){
        Intent intent=new Intent(jieguo1.this,zhuye.class);
        startActivity(intent);
       jieguo1.this.finish();
    }
    public void jumptoxiangxixinxi(View view){
        Intent intent=new Intent(jieguo1.this,xiangxixinxi.class);
        startActivity(intent);
        jieguo1.this.finish();
    }
    public void jumptotuichu(View view){
        Intent intent=new Intent(jieguo1.this,tuichu.class);
        startActivity(intent);
        jieguo1.this.finish();

    }
}
