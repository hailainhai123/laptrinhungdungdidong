package com.example.ltuddd_a42410.tuan_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ltuddd_a42410.R;

public class Tuan211MainActivity extends AppCompatActivity {

    EditText txt1, txt2;

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan211_main);
        txt1 = findViewById(R.id.tuan21txt1);
        txt2 = findViewById(R.id.tuan21txt2);
        btn1 = findViewById(R.id.btuan21btn1);
        btn1.setOnClickListener(v->{
            Intent i = new Intent(Tuan211MainActivity.this, Tuan211SecondActivity.class);

            i.putExtra("so1", txt1.getText().toString());
            i.putExtra("so2", txt2.getText().toString());

            startActivity(i);
        });
    }
}