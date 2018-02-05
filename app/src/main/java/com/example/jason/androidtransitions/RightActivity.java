package com.example.jason.androidtransitions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RightActivity extends AppCompatActivity {

    @BindView(R.id.iv_back_right_activity) ImageView ivBackRightActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.iv_back_right_activity)
    public void onBackClicked() {
        finish();
        overridePendingTransition(R.anim.out, R.anim.out_from_middle_to_right);
    }
}
