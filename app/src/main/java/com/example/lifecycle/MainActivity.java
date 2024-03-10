package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static int counter;
    public static int counterR;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("onCreate ------", "Main OnCreate");
    }

    public void onStart(){
        super.onStart();
        Log.e("onStart ------", "Main OnStart");
    }


    public void switchActivityB(View view){
        counter+=5;
        Intent intent = new Intent(MainActivity.this, ActivityB.class);
        startActivity(intent);
    }

    public void switchActivityC(View view){
        counter+=10;
        Intent intent = new Intent(MainActivity.this, ActivityC.class);
        startActivity(intent);
    }

    public void openDialog(View view) {
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.activity_dialog);
        dialog.setTitle("Dialog is opened");
        dialog.show();
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        TextView textView = (TextView) findViewById(R.id.textViewR);
        textView.setText(""+counter);
        Log.e("onRestart ------", "Main onRestart");

    }

    public void onPause(){
        super.onPause();
        Log.e("onPause ------", "Main onPause");

    }

    public void onStop(){
        super.onStop();
        Log.e("onStop ------", "Main onStop");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.e("onDestroy ------", "Main onDestroy");
    }
    public void finishActivityA(){
        MainActivity.this.finish();
    }
}