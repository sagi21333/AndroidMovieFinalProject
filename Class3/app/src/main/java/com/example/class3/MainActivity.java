package com.example.class3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.class3.StudentActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.main_add_student_btn);

        btn.setOnClickListener(view -> {
            Intent intent = new Intent(this, StudentActivity.class);
            startActivity(intent);
        });
    }
}