package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

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
                String pressureUp = pushUp.getText().toString().trim();
                try {
                    int NumbPressureUp = Integer.parseInt(pushUp.getText().toString().trim());
                } catch (Exception e) {
                    Log.e(TAG, "ошибка преобразовнаия верхнего давления");
                }

                String pressureDown = pushDown.getText().toString().trim();
                if (pressureDown.length() > 0) {
                    if (getPressureDown(pressureDown) != 0) {
                    } else {
                        Exception e;
                    }
                }

                String heartPuls = (puls.getText().toString().trim());
                int NumbHeartPuls = getChangeFormat(heartPuls);

                String date = dateTime.getText().toString();
                onCheckboxClicked(checkBox1);
            }
        });

    }

    public int getChangeFormat(String inputString) {
        try {
            return Integer.parseInt(inputString);
        } catch (NumberFormatException e) {
            return Log.e("Ошибка ввода числа", e.toString());
        }
    }

    private int getPressureDown(String pressureDown) {
        try {
            return Integer.parseInt(pressureDown);
        } catch (Exception e) {
            Log.e("Ошибка ввода Ндавления", e.toString());

        }
        return 0;

    }

    public void onCheckboxClicked(View view) {
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




