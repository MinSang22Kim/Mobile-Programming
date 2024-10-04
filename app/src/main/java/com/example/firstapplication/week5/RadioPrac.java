package com.example.firstapplication.week5;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firstapplication.R;

public class RadioPrac extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_week5_radio_image);

        // 이벤트 리스너: 각 라디오 버튼의 상태가 바뀔 때마다 호출
        CompoundButton.OnCheckedChangeListener l = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    int id = compoundButton.getId();
                    String message = "";

                    // 라디오 버튼의 ID에 따라 각기 다른 메시지 출력
                    if (id == R.id.radioButton1) {
                        message = "R1 True";
                    } else if (id == R.id.radioButton2) {
                        message = "R2 True";
                    } else if (id == R.id.radioButton3) {
                        message = "R3 True";
                    }

                    // 메시지를 Toast로 화면에 표시
                    Toast.makeText(RadioPrac.this, message, Toast.LENGTH_SHORT).show();
                }
            }
        };

        // 각 라디오 버튼에 이벤트 리스너 설정
        RadioButton r1 = findViewById(R.id.radioButton1);
        r1.setOnCheckedChangeListener(l);

        RadioButton r2 = findViewById(R.id.radioButton2);
        r2.setOnCheckedChangeListener(l);

        RadioButton r3 = findViewById(R.id.radioButton3);
        r3.setOnCheckedChangeListener(l);
    }
}
