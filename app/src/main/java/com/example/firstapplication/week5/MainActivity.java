package com.example.firstapplication.week5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firstapplication.R;

public class MainActivity extends AppCompatActivity {
    // Android 액티비티 생명주기에서 가장 먼저 호출되어 초기화 해주는 메서드
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // 액티비티 기본 설정
        setContentView(R.layout.activity_main_week5); // 5주차 레이아웃 사용
    }

    public void onClick(View view) {
    }
}
