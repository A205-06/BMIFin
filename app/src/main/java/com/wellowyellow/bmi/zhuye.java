package com.wellowyellow.bmi;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Administrator on 2015/8/4.
 */
public class zhuye extends Activity {
    protected static final double NULL = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhuye);
        Button button = (Button) findViewById(R.id.btn4);
        button.setOnClickListener(calcBMI);
    }

    public View.OnClickListener calcBMI = new View.OnClickListener() {


        public void onClick(View v) {
            EditText fieldHeight = (EditText) findViewById(R.id.textView1);
            EditText fieldWeight = (EditText) findViewById(R.id.textView2);
            double height = Double.parseDouble(fieldHeight.getText().toString()) / 100;
            double weight = Double.parseDouble(fieldWeight.getText().toString());
            double BMI = weight / (height * height);

            if (BMI < 16) {
                Intent intent = new Intent(zhuye.this, jieguo1.class);
                double BMI1=BMI;
                intent.putExtra("EXTRA",BMI1);
                startActivity(intent);
                TextView show = (TextView) findViewById(( R.id.result111));
                zhuye.this.finish();

            } else if (BMI > 16 && BMI < 18.5) {
                Intent intent = new Intent(zhuye.this, jieguo2.class);
                double BMI1=BMI;
                intent.putExtra("EXTRA",BMI1);
                startActivity(intent);
                TextView show = (TextView) findViewById(R.id.result112);
                zhuye.this.finish();


            } else if (BMI > 18.5 && BMI < 25) {
                Intent intent = new Intent(zhuye.this, jieguo3.class);
                double BMI1=BMI;
                intent.putExtra("EXTRA",BMI1);
                startActivity(intent);
                TextView show = (TextView) findViewById(R.id.result113);
                zhuye.this.finish();


            } else if (BMI > 25 && BMI < 30) {
                Intent intent = new Intent(zhuye.this, jieguo4.class);
                double BMI1=BMI;
                intent.putExtra("EXTRA",BMI1);
                startActivity(intent);
                TextView show = (TextView) findViewById(R.id.result114);
                zhuye.this.finish();


            } else if (BMI > 30 && BMI < 35) {
                Intent intent = new Intent(zhuye.this, jieguo5.class);
                double BMI1=BMI;
                intent.putExtra("EXTRA",BMI1);
                startActivity(intent);
                TextView show = (TextView) findViewById(R.id.result115);
                zhuye.this.finish();


            } else if (BMI > 35 && BMI < 40) {
                Intent intent = new Intent(zhuye.this, jieguo6.class);
                double BMI1=BMI;
                intent.putExtra("EXTRA",BMI1);
                startActivity(intent);
                TextView show = (TextView) findViewById(R.id.result116);
                zhuye.this.finish();


            } else if (BMI > 40) {
                Intent intent = new Intent(zhuye.this, jieguo7.class);
                double BMI1=BMI;
                intent.putExtra("EXTRA",BMI1);
                startActivity(intent);
                TextView show = (TextView) findViewById(R.id.result117);
                zhuye.this.finish();


            }
        }

    };
    public void jumptoxiangxixinxi(View view) {
        Intent intent = new Intent(zhuye.this, xiangxixinxi.class);
        startActivity(intent);
        zhuye.this.finish();
    }

    public void jumptotuichu(View view) {
        Intent intent = new Intent(zhuye.this, tuichu.class);
        startActivity(intent);
        zhuye.this.finish();
    }

}


