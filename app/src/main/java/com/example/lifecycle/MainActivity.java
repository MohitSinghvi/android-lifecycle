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
    }

    public void switchActivityB(View view){
        Intent intent = new Intent(MainActivity.this, ActivityB.class);
        startActivity(intent);
    }

    public void switchActivityC(View view){
        Intent intent = new Intent(MainActivity.this, ActivityC.class);
        startActivity(intent);
    }

    public void openDialog(View view) {
        //ExampleDialog exampleDialog=new ExampleDialog();
        //ExampleDialogexampleDialogmpleDialog.show(getSupportFragmentManager(),"example dialog");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.activity_dialog);
        dialog.setTitle("Dialog is opened");
        dialog.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
//        this.counterR++;
//        TextView textView = (TextView) findViewById(R.id.textViewR);
//        textView.setText("OnResume Counter: " + counterR);
//        Log.e("onResume ------ ","MainActivity: onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        this.counter+=5;
        TextView textView = (TextView) findViewById(R.id.textViewR);
        textView.setText(""+counter);
        Log.e("onRestart ------ ","MainActivity: onRestart()");

    }

    public void finishActivityA(){
        MainActivity.this.finish();
    }
}