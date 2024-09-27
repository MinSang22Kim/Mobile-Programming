package com.example.firstapplication.week4;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firstapplication.R;

public class SwitchButton extends AppCompatActivity {
    // Android 액티비티 생명주기에서 가장 먼저 호출되어 초기화 해주는 메서드
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_week4_switch); // 4주차 레이아웃 사용

        // Switch 위젯 초기화
        Switch s = findViewById(R.id.switch1);

        // 스위치 상태 변경 리스너 설정
        s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // 스위치가 켜졌을 때
                    Toast.makeText(SwitchButton.this, "Switch is ON", Toast.LENGTH_SHORT).show();
                } else {
                    // 스위치가 꺼졌을 때
                    Toast.makeText(SwitchButton.this, "Switch is OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // 연습용
    public void onClick(View view) {
        Switch s = (Switch) findViewById(R.id.switch1);
        boolean b = s.isChecked();
        Toast.makeText(this, String.valueOf(b), Toast.LENGTH_SHORT).show();
    }
}
