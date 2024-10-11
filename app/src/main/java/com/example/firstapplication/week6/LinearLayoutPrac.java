package com.example.firstapplication.week6;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class LinearLayoutPrac extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // XML 레이아웃 파일을 사용하지 않음 (주석 처리된 코드)
        // setContentView(R.layout.activity_main_week5_layoutprac);

        // XML 파일을 사용하지 않고, 코드로 화면 구성
        LinearLayout linearLayout = new LinearLayout(this);

        // LinearLayout의 방향을 세로로 설정
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        // LinearLayout 배경색을 빨간색으로 설정
        linearLayout.setBackgroundColor(Color.RED);

        // LayoutParams를 설정하여, 레이아웃이 화면을 가득 채우도록 설정
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );

        // 생성한 LinearLayout을 화면에 설정
        setContentView(linearLayout, params);

        // 새로운 버튼 객체 생성
        Button b = new Button(this);

        // 버튼의 텍스트 설정
        b.setText("버튼");

        // 버튼을 LinearLayout에 추가
        linearLayout.addView(b);
    }
}
