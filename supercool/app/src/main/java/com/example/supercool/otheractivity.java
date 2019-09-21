package com.example.supercool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class otheractivity extends AppCompatActivity {
    private static String TAG = "Other LifeCycle";
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otheractivity);

        Log.i(TAG, " onCreate");

        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(otheractivity.this, MainActivity.class);
                Log.i(TAG, "GOING TO MAIN ACTIVITY");
                startActivity(intent);

        }
        });
}


        @Override
protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
        }

@Override
protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
        }

@Override
protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
        }

@Override
protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
        }

@Override
protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
        }

@Override
protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
        }
        }
