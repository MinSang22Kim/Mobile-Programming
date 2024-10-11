package com.example.firstapplication.week6;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firstapplication.R;

import org.jetbrains.annotations.NotNull;

public class MenuPrac extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_week6_menu);
    }

    @Override // 옵션 메뉴 생성 시 호출되는 메서드
    public boolean onCreateOptionsMenu(Menu menu) {
        // MenuInflater를 사용하여 XML 리소스 파일을 메뉴로 확장 (menu.xml)
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);  // 메뉴를 메뉴 리소스 파일에서 인플레이트
        return true;  // true를 반환하여 메뉴 표시
    }

    @Override
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        if (item.getItemId() == R.id.green) {
            Toast.makeText(this, "1번", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.blue) {
            Toast.makeText(this, "2번", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.Item3) {
            Toast.makeText(this, "3번", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.Item4) {
            Toast.makeText(this, "4번", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
