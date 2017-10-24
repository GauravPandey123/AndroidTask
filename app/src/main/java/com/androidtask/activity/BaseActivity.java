package com.androidtask.activity;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.androidtask.R;

/**
 * Created by Gaurav on 24/10/17.
 */

public class BaseActivity extends AppCompatActivity {
    protected Context mContext;
    private ProgressDialog mProgressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayoutId());
        mContext = this;
    }

    private int setLayoutId() {
        return R.layout.activity_main;
    }


}
