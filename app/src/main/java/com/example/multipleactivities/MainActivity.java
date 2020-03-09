package com.example.multipleactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String username;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);

        username ="";
    }

    public void changeActivity(View view){

        username = editText.getText().toString();
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);

        intent.putExtra("userInput", username); //key=userInput vaalue=username


        startActivity(intent);


    }




}
