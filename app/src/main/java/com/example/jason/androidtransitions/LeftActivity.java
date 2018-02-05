package com.example.jason.androidtransitions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LeftActivity extends AppCompatActivity {

    @BindView(R.id.iv_back_left_activity) ImageView ivBackLeftActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_left);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.iv_back_left_activity)
    public void onBackClicked() {
        finish();
        overridePendingTransition(R.anim.out, R.anim.out_from_middle_to_left);
    }
}
