package com.example.ltuddd_a42410.tuan_2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ltuddd_a42410.R;

public class Tuan22MainActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan22_main);
        lv = findViewById(R.id.tuan22Listview);

        String[] arr = new String[] {"Mon 1", "Tuan 2", "Mon 3", "Mon 4", "Mon 5", "Tuan 6", "aaa", "bbb"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);

        lv.setAdapter(adapter);
    }
}