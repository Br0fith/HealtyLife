package com.example.healtylife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreatefoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createfood);
    }
    public void back(View view) {
        Intent intent =new Intent(CreatefoodActivity.this,StgmyitemsActivity.class);
        startActivity(intent);

    }
}