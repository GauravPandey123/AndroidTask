package com.androidtask.activity;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.EditText;

import com.androidtask.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Gaurav on 24/10/17.
 */

public class SignUpActivity extends BaseActivity {


    @BindView(R.id.tb_title)
    Toolbar tbTitle;
    @BindView(R.id.input_name)
    EditText inputName;
    @BindView(R.id.input_layout_name)
    TextInputLayout inputLayoutName;
    @BindView(R.id.input_email)
    EditText inputEmail;
    @BindView(R.id.input_layout_email)
    TextInputLayout inputLayoutEmail;
    @BindView(R.id.input_password)
    EditText inputPassword;
    @BindView(R.id.input_layout_password)
    TextInputLayout inputLayoutPassword;
    @BindView(R.id.btn_signup)
    Button btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        ButterKnife.bind(this);
        setUpElement();
        setUpListeners();
    }


    //setUpListners
    private void setUpListeners() {
    }

    //setUpElement
    private void setUpElement() {
    }
}
