package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "mylogs";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "находим элементы View");
        setContentView(R.layout.activity_main);
        final EditText editFIO = findViewById(R.id.editText_fio);
        final EditText editAge = findViewById(R.id.editText_age);
        Button buttonSave = findViewById(R.id.button_save1);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Обрабатываем по нажатию кнопки сохранить");
                String fio = editFIO.getText().toString();
                String age = editAge.getText().toString();

                if (age.length() > 0) {
                    if (getAge(age) != 0) {

                    } else {
                        Exception e;
                    }
                }
                String curFio = fio;
                int curAge = getAge(age);
                if ((curFio.trim().equals("")) & (curAge == 0)) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Введите данные!",
                            Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Данные сохранены!",
                            Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
            }
        });

        Button goAvtiv2 = findViewById(R.id.button_goactivity2);
        goAvtiv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "обработка перехада на второй экран");
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

        Button goActiv3 = findViewById(R.id.button_goactivity3);
        goActiv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "обработка перехада на третий экран");
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);
            }
        });
    }

    private int getAge(String age) {
        try {
            return Integer.parseInt(age);
        } catch (Exception e) {
            Log.e("Ошибка ввода возраста", e.toString());

        }
        return 0;

    }
}
