package com.auribises.ayu_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public final String TAG="MainActivity";

    //When object of Activity is created by Android System(Inversion of Control)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);// Linking the layout of activity
        Log.i(TAG, "onCreate");


    }

    //When object of Activity is pushed onto stack
    //Stack: BaseStack or Task
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");

    }


    // When object of activity is visible as a rectangular screen
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");

    }


    // When your Activity is partially covered by some other UI Element or Activity
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");

    }


    // When Your Activity is full covered by some other UI Element ot Activity
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");

    }

    // When user will press back button or programmer executes finish() function
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");

    }
}

