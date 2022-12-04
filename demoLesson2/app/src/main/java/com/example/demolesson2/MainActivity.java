package com.example.demolesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG", "onCreate");

        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag", "onDestroy");
    }
}