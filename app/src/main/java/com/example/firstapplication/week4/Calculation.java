package com.example.firstapplication.week4;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firstapplication.R;

public class Calculation extends AppCompatActivity {

    private EditText editText1, editText2; // 계산할 두 수
    private TextView resultText; // 결과값

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_week4_calculation); // 4주차 레이아웃 사용

        // EditText 및 TextView를 초기화
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        resultText = findViewById(R.id.textView);

        // 각 버튼에 이벤트 리스너 추가
        Button addButton = findViewById(R.id.plusBtn);
        Button subtractButton = findViewById(R.id.minusBtn);
        Button multiplyButton = findViewById(R.id.mutliplyBtn);
        Button divideButton = findViewById(R.id.divideBtn);

        // 더하기 버튼
        addButton.setOnClickListener(view -> calculate('+'));
        subtractButton.setOnClickListener(view -> calculate('-'));
        multiplyButton.setOnClickListener(view -> calculate('*'));
        divideButton.setOnClickListener(view -> calculate('/'));
    }

    // 사칙연산 수행
    private void calculate(char operator) {
        String input1 = editText1.getText().toString().trim(); // String으로 입력받고 공백은 제거
        String input2 = editText2.getText().toString().trim();

        // 입력값 유효성 검사
        if (input1.isEmpty() || input2.isEmpty()) {
            Toast.makeText(this, "두 숫자를 입력하세요", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double num1 = Double.parseDouble(input1); // String을 double로 변환
            double num2 = Double.parseDouble(input2);
            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        Toast.makeText(this, "0으로 나눌 수 없습니다", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    result = num1 / num2;
                    break;
            }

            // 결과를 TextView에 표시
            resultText.setText(String.valueOf(result));

        } catch (NumberFormatException e) {
            Toast.makeText(this, "유효한 숫자를 입력하세요", Toast.LENGTH_SHORT).show();
        }
    }
}
