package ru.unitech_mo.study_p2_22.android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout main = findViewById(R.id.main);

        Button red_button = findViewById(R.id.red_button);
        Button yellow_button = findViewById(R.id.yellow_button);
        Button green_button = findViewById(R.id.green_button);

        red_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main.setBackgroundColor(Color.RED);
            }
        });

        yellow_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main.setBackgroundColor(Color.YELLOW);
            }
        });

        green_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main.setBackgroundColor(Color.GREEN);
            }
        });
    }
}