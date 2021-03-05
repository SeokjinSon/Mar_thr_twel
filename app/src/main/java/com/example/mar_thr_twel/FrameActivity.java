package com.example.mar_thr_twel;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FrameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_frame);
    }

    // View는 상수 값(사라지게 하겠다는 값)
    public void clickFunc(View v) {
        v.setVisibility(View.GONE);
    }
}