package com.example.firstapplication.week6;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firstapplication.R;

public class LinearLayoutPrac2 extends AppCompatActivity {
    int count = 1;

    public void onClickListen(View v) {
        TextView textView = new TextView(this);
        textView.setText("TextView " + count);
        textView.setTextSize(30);
        count++;

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        linearLayout.addView(textView);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_week6_layoutprac2);
    }
}
