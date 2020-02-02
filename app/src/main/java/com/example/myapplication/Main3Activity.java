package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final EditText editWeight = findViewById(R.id.editText_weight);
        final EditText editSteps = findViewById(R.id.editText_steps);

        Button buttonSave3 = findViewById(R.id.button_save3);
        buttonSave3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String weight = editWeight.getText().toString();
                String steps = editSteps.getText().toString();
            }
        });


    }
}
