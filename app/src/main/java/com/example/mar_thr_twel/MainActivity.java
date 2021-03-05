package com.example.mar_thr_twel;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    // 멤버 변수 선언 -------------------------------
    // ---------------------------------------------
    // Debug ---------------------------------------
    private final static String TAG = "TEST APP";   // Log 출력 시 구분

    // UI ---------------------------------------
    private LinearLayout        colorChnBack;
    private TextView            titleTXT;

    // Contorl ---------------------------------------
    int originCol;
    private Random              r = new Random();
    private int                 min=0;
    private int                 max=255;

    // ---------------------------------------------
    // 멤버 메서드
    // ---------------------------------------------
    // AppCompatActivity's method ------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 사용자에게 보여지는 화면 설정
        setContentView(R.layout.padding_margin);
        colorChnBack = (LinearLayout)findViewById(R.id.colorChn);
        colorChnBack.setBackgroundColor(Color.rgb(255, 0, 255));
        //originCol = (ColorDrawable)colorChnBack.getBackground().getColorFilter()

        titleTXT = findViewById(R.id.titleTxt);
    }

    public void clickBtn1(View v) {
        colorChnBack = findViewById(R.id.colorChn);
        //colorChnBack.setBackgroundColor(Color.rgb(r.nextInt(((max-min)+1)+min), r.nextInt(((max-min)+1)+min), r.nextInt(((max-min)+1)+min)));
        colorChnBack.setBackgroundColor(Color.rgb(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
    }

    public void clickBtn2(View v) {
        colorChnBack = findViewById(R.id.colorChn);
        colorChnBack.setBackgroundColor(Color.BLUE);
    }

    // cancel 누르면 안 보이게, ok 누르면 보이게
    public void clickFunc(View v) {
        int id = v.getId();
        if(v.getId() == R.id.canBtn) {
            Toast.makeText(MainActivity.this, "CANCEL", Toast.LENGTH_LONG).show();
            titleTXT.setVisibility(View.INVISIBLE);
        } else if(v.getId() == R.id.okBtn) {
            colorChnBack.setBackgroundColor(Color.rgb(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
            titleTXT.setVisibility(View.VISIBLE);
        } else if(v.getId() == R.id.titleTxt) {
            Log.i(TAG, "title Click");
        }
    }
}