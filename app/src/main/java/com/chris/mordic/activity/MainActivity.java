package com.chris.mordic.activity;

import android.app.Activity;
import android.os.Bundle;

import com.chris.mordic.R;

/**
 * Email: soymantag@163.coom
 */
public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    private void initView() {
        setContentView(R.layout.activity_main);
    }
}
