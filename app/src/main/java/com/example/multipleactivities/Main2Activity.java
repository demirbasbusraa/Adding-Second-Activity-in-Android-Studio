package com.example.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //SAYFALAR ARASI BİLGİ AKTARIMI
        textView = findViewById(R.id.textView3);
        Intent intent=getIntent();
        textView.setText("Hello, " + intent.getStringExtra("userInput"));

    }

    public void changeScreen(View view){

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
