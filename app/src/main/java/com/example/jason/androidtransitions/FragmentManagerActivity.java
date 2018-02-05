package com.example.jason.androidtransitions;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.example.jason.androidtransitions.Fragment.Fragment1;
import com.example.jason.androidtransitions.Fragment.Fragment2;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FragmentManagerActivity extends AppCompatActivity {

    @BindView(R.id.btn_switch_fragment1) Button ivSwitchFragment1;
    @BindView(R.id.btn_switch_bar_fragment2) Button ivSwitchBarFragment2;
    @BindView(R.id.ll_switch_bar) LinearLayout llSwitchBar;
    @BindView(R.id.fl_fragment_manager_activity) FrameLayout flFragmentManagerActivity;

    private FragmentManager fragmentManager = getSupportFragmentManager();
    private Fragment1 fragment1;
    private Fragment2 fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_manager);
        ButterKnife.bind(this);
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        initOneP();
    }

    @OnClick(R.id.btn_switch_fragment1)
    public void onOnePClick(View view) {
        initOneP();
    }

    @OnClick(R.id.btn_switch_bar_fragment2)
    public void onTwoPClick(View view) {
        initTwoP();
    }

    public void initOneP() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //设置自定义过场动画
        fragmentTransaction.setCustomAnimations(
                R.anim.enter_fragment_from_right,
                R.anim.out_fragment_default,
                R.anim.enter_fragment_from_right,
                R.anim.out_fragment_default);

        fragmentTransaction.replace(R.id.fl_fragment_manager_activity, fragment1);
        fragmentTransaction.commit();
    }

    public void initTwoP() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //设置自定义过场动画
        fragmentTransaction.setCustomAnimations(
                R.anim.enter_fragment_from_left,
                R.anim.out_fragment_default,
                R.anim.enter_fragment_from_left,
                R.anim.out_fragment_default);

        fragmentTransaction.replace(R.id.fl_fragment_manager_activity, fragment2);
        fragmentTransaction.commit();
    }


}
