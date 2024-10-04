package com.example.firstapplication.week5;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firstapplication.R;

public class ImagePrac extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_week5_radio_image);

        RadioButton r1 = (RadioButton) findViewById(R.id.radioButton1);
        RadioButton r2 = (RadioButton) findViewById(R.id.radioButton2);

        CompoundButton.OnCheckedChangeListener l = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                ImageView imageView = (ImageView) findViewById(R.id.imageButton);

                if (compoundButton.getId() == R.id.radioButton1 && b) {
                    imageView.setImageResource(R.drawable.sample1);
                } else if (compoundButton.getId() == R.id.radioButton2 && b) {
                    imageView.setImageResource(R.drawable.sample2);
                }
            }
        };

        r1.setOnCheckedChangeListener(l);
        r2.setOnCheckedChangeListener(l);

//        ImageView i = (ImageView) findViewById(R.id.imageButton);
//        i.setImageResource(R.drawable.sample2);
    }
}
