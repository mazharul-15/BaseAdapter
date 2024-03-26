package com.example.baseadapters;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView grid_view_adapter;
    int[] data = {R.drawable.sallu_1, R.drawable.sallu_2, R.drawable.sallu_3, R.drawable.sallu_4, R.drawable.sallu_5, R.drawable.sallu_6, R.drawable.sallu_7, R.drawable.sallu_8, R.drawable.sallu_9, R.drawable.sallu_10,
            R.drawable.sallu_1, R.drawable.sallu_2, R.drawable.sallu_3, R.drawable.sallu_4, R.drawable.sallu_5, R.drawable.sallu_6, R.drawable.sallu_7, R.drawable.sallu_8, R.drawable.sallu_9, R.drawable.sallu_10};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid_view_adapter = (GridView) findViewById(R.id.grid_view_adapter);

        MyBaseAdapter baseAdapter = new MyBaseAdapter(getApplicationContext(), data);

        grid_view_adapter.setAdapter(baseAdapter);
    }
}