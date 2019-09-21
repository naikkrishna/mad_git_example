package com.example.supercool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;
public class MainActivity extends AppCompatActivity {
    private static String TAG = "Main LifeCycle";
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, " onCreate");


      button = findViewById(R.id.myButton);
      button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,otheractivity.class);
        Log.i(TAG,"GOING TO OTHER ACTIVITY");
        startActivity(intent);


    }
});


      //  final Button myButton = findViewById(R.id.myButton);

        /*final Button button1 = findViewById(R.id.button1);
        myButton.setBackgroundColor(Color.BLUE);
     button1.setBackgroundColor(Color.RED);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ColorDrawable color = (ColorDrawable)button1.getBackground();
                int ButtonColor = color.getColor();
                if (ButtonColor == Color.BLUE) {


                    button1.setBackgroundColor(Color.RED);


                } else {
                    button1.setBackgroundColor(Color.BLUE);
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ColorDrawable color = (ColorDrawable) myButton.getBackground();
                int ButtonColor = color.getColor();
                if (ButtonColor == Color.BLUE) {


                    myButton.setBackgroundColor(Color.RED);


                } else {
                    myButton.setBackgroundColor(Color.BLUE);
                }
            }


        });*/
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