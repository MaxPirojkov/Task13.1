package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private static final String TAG = "mylogs2";
    String heart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final EditText pushUp = findViewById(R.id.editText_uppush);
        final EditText pushDown = findViewById(R.id.editText_downpush);
        final EditText puls = findViewById(R.id.editText_puls);
        final CheckBox checkBox1 = findViewById(R.id.checkBox_heart);

        final EditText dateTime = findViewById(R.id.editText_date);

        final Button buttonSave2 = findViewById(R.id.button_save2);
        buttonSave2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pressureUp = pushUp.getText().toString();
                String pressureDown = pushDown.getText().toString();
                String heartPuls = puls.getText().toString();
                String date = dateTime.getText().toString();
                onCheckboxClicked(checkBox1);
            }
        });

    }
    public void onCheckboxClicked(View view){
        CheckBox checkBox1 = (CheckBox) view;
        boolean checked = checkBox1.isChecked();
        switch (view.getId()) {
            case R.id.checkBox_heart:
                if (checked)
                    heart = "тахикардия";
                else
                    heart = "ok";



        }
    }


}




