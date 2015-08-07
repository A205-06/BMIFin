package com.wellowyellow.bmi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Administrator on 2015/8/4.
 */
public class xiangxixinxi extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xiangxixinxi);
    }

    public void jumptotuichu(View view) {
        Intent intent = new Intent(xiangxixinxi.this, tuichu.class);
        startActivity(intent);
        xiangxixinxi.this.finish();
    }

    public void jumptozhuye(View view) {
        Intent intent = new Intent(xiangxixinxi.this, zhuye.class);
        startActivity(intent);
        xiangxixinxi.this.finish();
    }
}
