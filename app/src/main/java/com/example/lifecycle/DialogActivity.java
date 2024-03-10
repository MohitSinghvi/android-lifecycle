package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;

public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    public void onPause(){
        super.onPause();
        Log.e("onPause ------", "Dialog onPause");

    }

    public void onStop(){
        super.onStop();
        Log.e("onStop ------", "B onStop");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.e("onDestroy ------", "B onDestroy");
    }

    public void finishDialog(View v) {
        DialogActivity.this.finish();
    }
}