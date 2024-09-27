package com.example.firstapplication.week3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firstapplication.R;

public class Toast extends AppCompatActivity {
    // Android 액티비티 생명주기에서 가장 먼저 호출되어 초기화 해주는 메서드
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // 액티비티 기본 설정 및 상태 복원 작업 처리
        setContentView(R.layout.activity_main_week3); // xml 레이아웃 파일을 액티비티에 연결하여 화면 구성 정의

        Button b = (Button) findViewById((R.id.button3));

        // 자바로 이벤트 리스너 구현
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView) findViewById(R.id.myText1);
                textView.setText("Change!!!!!!");
            }
        });
    }

    // 버튼을 클릭하면 토스트(팝업)와 함께 텍스트를 대치해주는 메서드, xml 지정 방식
    public void onClickButton(View v) {
        // 토스트: 작은 팝업을 표시하여 동작에 대한 피드백 표시
        android.widget.Toast.makeText(this, "Click!", android.widget.Toast.LENGTH_SHORT).show();
        TextView textView = (TextView) findViewById(R.id.myText1); // id로 객체 찾아, 형변환 & 저장
        textView.setText("Change!"); // 텍스트 속성 세팅

    }
}