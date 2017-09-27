package com.example.rynel.myapplication;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTag";
    private EditText editText;
    private TextView textView;

    //adding button
    //Life Cycle for Android Programs practice

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate: ");

    }



    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);



        outState.putString("textviewValue", textView.getText().toString());

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        textView.setText(savedInstanceState.getString("textviewValue"));

    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    public void goToSecond(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    public void updateTextView(View view){
        textView.setText((editText.getText().toString()));
    }
}
