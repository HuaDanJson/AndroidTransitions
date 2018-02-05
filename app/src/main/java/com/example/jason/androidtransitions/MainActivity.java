package com.example.jason.androidtransitions;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn1_main_activity) Button btn1MainActivity;
    @BindView(R.id.btn2_main_activity) Button btn2MainActivity;
    @BindView(R.id.btn3_main_activity) Button btn3MainActivity;
    @BindView(R.id.btn4_main_activity) Button btn4MainActivity;
    @BindView(R.id.btn5_main_activity) Button btn5MainActivity;
    @BindView(R.id.btn6_main_activity) Button btn6MainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn1_main_activity)
    public void onAppFromTopClicked() {
        startActivity(new Intent(this, TopActivity.class));
        overridePendingTransition(R.anim.enter_from_top, R.anim.out);
    }

    @OnClick(R.id.btn2_main_activity)
    public void onAppFromBottomClicked() {
        startActivity(new Intent(this, BottomActivity.class));
        overridePendingTransition(R.anim.enter_from_bottom, R.anim.out);

    }

    @OnClick(R.id.btn3_main_activity)
    public void onAppFromLeftClicked() {
        startActivity(new Intent(this, LeftActivity.class));
        overridePendingTransition(R.anim.enter_from_left, R.anim.out);

    }

    @OnClick(R.id.btn4_main_activity)
    public void onAppFromRightClicked() {
        startActivity(new Intent(this, RightActivity.class));
        overridePendingTransition(R.anim.enter_from_right, R.anim.out);

    }

    @OnClick(R.id.btn5_main_activity)
    public void onAppDefaultClicked() {
        startActivity(new Intent(this, DefaultActivity.class));

    }

    @OnClick(R.id.btn6_main_activity)
    public void onAppimulatetClicked() {
        startActivity(new Intent(this, DefaultActivity.class));
        overridePendingTransition(R.anim.enter_default_second_activity, R.anim.out_default_main_activity);
    }
}
