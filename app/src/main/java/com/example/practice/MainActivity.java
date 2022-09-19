package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button incrementBtn = (Button) findViewById(R.id.addButton);
        TextView resultTextView = (TextView) findViewById(R.id.resultTextView);



        incrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = resultTextView.getText().toString();
                int value = Integer.parseInt(result);
                value = value + 100;

                resultTextView.setText(String.valueOf(value));
            }
        });

    }

}