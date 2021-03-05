package com.example.mar_thr_twel;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class RelativeActivity extends AppCompatActivity {
    // -------------------------------------------------
    // Member Variable
    // -------------------------------------------------
    private final static String TAG = "TEST APP";   // Log 출력 시 구분
    // -------------------------------------------------
    // Member Method - Override Method
    // -------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "안녕하세요1");
        super.onCreate(savedInstanceState);
        // contentView 설정
        Log.i(TAG, "안녕하세요2");
        setContentView(R.layout.profile);
        Log.i(TAG, "안녕하세요3");

    }
}