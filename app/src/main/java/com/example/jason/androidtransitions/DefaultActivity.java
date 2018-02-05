package com.example.jason.androidtransitions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DefaultActivity extends AppCompatActivity {

    @BindView(R.id.iv_back_default_activity) ImageView ivBackDefaultActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.iv_back_default_activity)
    public void onBackClicked() {
        finish();
    }
}
