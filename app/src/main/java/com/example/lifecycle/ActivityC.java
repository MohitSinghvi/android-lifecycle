package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
    }

    public void onStart(){
        super.onStart();
        Log.e("onStart ------", "C OnStart");
    }

    public void onResume(){
        super.onResume();
        Log.e("onResume ------", "C onResume");
    }

    public void switchActivity(View view){
        Intent intent = new Intent(ActivityC.this, MainActivity.class);
        startActivity(intent);
    }

    public void finishActivity(View view){
        finish();
    }

    public void onRestart(){
        super.onRestart();
        MainActivity.counter+=10;
        Log.e("onRestart ------", "C onRestart");
    }

    public void onPause(){
        super.onPause();
        Log.e("onPause ------", "C onPause");

    }

    public void onStop(){
        super.onStop();
        Log.e("onStop ------", "C onStop");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.e("onDestroy ------", "C onDestroy");
    }


}