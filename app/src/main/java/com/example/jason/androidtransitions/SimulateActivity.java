package com.example.jason.androidtransitions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SimulateActivity extends AppCompatActivity {

    @BindView(R.id.iv_back_simulate_activity) ImageView ivBackSimulateActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simulate);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.iv_back_simulate_activity)
    public void onBackClicked() {
        finish();
        overridePendingTransition(R.anim.enter_default_main_activity, R.anim.out_default_second_activity);
    }
}
