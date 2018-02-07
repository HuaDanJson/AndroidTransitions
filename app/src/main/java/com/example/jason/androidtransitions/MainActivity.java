package com.example.jason.androidtransitions;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

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
    @BindView(R.id.btn7_main_activity) Button btn7MainActivity;
    @BindView(R.id.btn8_main_activity) Button btn8MainActivity;
    @BindView(R.id.btn9_main_activity) Button btn9MainActivity;
    @BindView(R.id.btn10_main_activity) Button btn10MainActivity;
    @BindView(R.id.iv_main_activity) ImageView ivMainActivity;

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

    @OnClick(R.id.btn7_main_activity)
    public void onAppFragmentClicked() {
        startActivity(new Intent(this, FragmentManagerActivity.class));
    }

    @OnClick(R.id.btn8_main_activity)
    public void onAppwoAnimationClicked() {
        startActivity(new Intent(this, TwoAnimationActivity.class));
        overridePendingTransition(R.anim.enter_from_right_two_animation, R.anim.out_default_main_activity);
    }

    @OnClick(R.id.btn9_main_activity)
    public void onAppearDialogClicked() {
        final View view = LayoutInflater.from(this).inflate(R.layout.custom_dialog, null);
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(view);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogSlideFromTopToMiddleAnimation;
        dialog.show();
        view.findViewById(R.id.llChangeAvatarPhoto).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        view.findViewById(R.id.llChangeAvatarCamera).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        view.findViewById(R.id.llChangeAvatarCancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }

    @OnClick(R.id.btn10_main_activity)
    public void onAppearImageAnimationClicked() {

        ivMainActivity.setVisibility(View.VISIBLE);
        Animation slideIn = AnimationUtils.loadAnimation(this, R.anim.dialog_enter_from_top);
        ivMainActivity.startAnimation(slideIn);
        slideIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                ivMainActivity.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

}
