package com.example.firstapplication.week6;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.firstapplication.R;

import org.jetbrains.annotations.NotNull;

public class ColorMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_week6_menu2);
    }

    @Override // 옵션 메뉴 생성 시 호출되는 메서드
    public boolean onCreateOptionsMenu(Menu menu) {
        // MenuInflater를 사용하여 XML 리소스 파일을 메뉴로 확장 (menu.xml)
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.color_menu, menu);
        return true;  // true를 반환하여 메뉴 표시
    }

    @Override
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        if (item.getItemId() == R.id.green) {
            Toast.makeText(this, "green", Toast.LENGTH_SHORT).show();
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.main);
            constraintLayout.setBackgroundColor(Color.GREEN);
        }
        else if (item.getItemId() == R.id.blue) {
            Toast.makeText(this, "blue", Toast.LENGTH_SHORT).show();
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.main);
            constraintLayout.setBackgroundColor(Color.BLUE);
        }
        else if (item.getItemId() == R.id.white) {
            Toast.makeText(this, "white", Toast.LENGTH_SHORT).show();
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.main);
            constraintLayout.setBackgroundColor(Color.WHITE);
        }
        else if (item.getItemId() == R.id.red) {
            Toast.makeText(this, "red", Toast.LENGTH_SHORT).show();
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.main);
            constraintLayout.setBackgroundColor(Color.RED);
        }
        return true;
    }
}
