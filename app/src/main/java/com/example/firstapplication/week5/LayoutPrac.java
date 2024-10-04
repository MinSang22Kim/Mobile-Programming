package com.example.firstapplication.week5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firstapplication.R;

public class LayoutPrac extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_week5_layout);

        // LinearLayout을 XML 레이아웃에서 참조
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayout);

        // 새로운 Button 객체 생성 및 텍스트 설정
        Button button = new Button(this);
        button.setText("Hello World!!");

        // 버튼을 LinearLayout에 추가
        linearLayout.addView(button);

        // 버튼 클릭 시 Toast 메시지 표시
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast 메시지를 화면에 출력
                Toast.makeText(LayoutPrac.this, "Hello World!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
