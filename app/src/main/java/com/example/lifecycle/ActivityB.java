package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }

    public void onStart(){
        super.onStart();
        Log.e("onStart ------", "B OnStart");
    }

    public void onResume(){
        super.onResume();
        Log.e("onResume ------", "B onResume");
    }

    public void switchActivity(View view){
        Intent intent = new Intent(ActivityB.this, MainActivity.class);
        startActivity(intent);
    }

    public void finishActivity(View view){
        finish();
    }

    public void onRestart(){
        super.onRestart();
        MainActivity.counter+=5;
        Log.e("onRestart ------", "B onRestart");

    }

    public void onPause(){
        super.onPause();
        Log.e("onPause ------", "B onPause");

    }

    public void onStop(){
        super.onStop();
        Log.e("onStop ------", "B onStop");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.e("onDestroy ------", "B onDestroy");
    }

}