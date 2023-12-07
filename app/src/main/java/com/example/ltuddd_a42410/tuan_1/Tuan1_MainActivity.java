package com.example.ltuddd_a42410.tuan_1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ltuddd_a42410.R;

public class Tuan1_MainActivity extends AppCompatActivity {
    //khai bao
    EditText txt1, txt2;
    Button btn;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_tuan1);
        //anh xa cac control
        txt1 = findViewById(R.id.editTextNumber1);
        txt2 = findViewById(R.id.editTextNumber2);
        btn = findViewById(R.id.buttonCalculate);
        tvResult = findViewById(R.id.textViewResult);
        //xu ly su kien
        btn.setOnClickListener(v -> {
            //goi ham tinh tong
            tinhTong();
        });

    }

    //dinh nghia ham tinh tong
    private void tinhTong() {
        //lay du lieu nhap vao tu editText1
        String str1 = txt1.getText().toString();
        float so1 = Float.parseFloat(str1);// chuyen du lieu sang so
        //
        String str2 = txt2.getText().toString();
        float so2 = Float.parseFloat(str2);
        // tinh tong
        float tong = so1 + so2;
        //in ket qua ra man
        tvResult.setText(String.valueOf(tong));
    }
}