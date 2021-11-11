package com.example.ej6eventos;

import androidx.appcompat.app.AppCompatActivity;



import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvText;
    private  float rotation=45.0F;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvText = findViewById(R.id.tvText);


        tvText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               tvText.setRotation(rotation);
               tvText.setText("HOOOOOOLA!!!!!");
               tvText.setBackgroundColor(getResources().getColor(R.color.green));
               tvText.setTextSize(35);
               rotation+=45.0F;
            }
        });


    }
}