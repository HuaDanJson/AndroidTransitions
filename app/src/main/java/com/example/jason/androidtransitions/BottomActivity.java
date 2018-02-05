package com.example.jason.androidtransitions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BottomActivity extends AppCompatActivity {

    @BindView(R.id.iv_back_bottom_activity) ImageView ivBackBottomActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.iv_back_bottom_activity)
    public void onBackClicked() {
        finish();
        overridePendingTransition(R.anim.out, R.anim.out_from_middle_to_bottom);
    }
}
