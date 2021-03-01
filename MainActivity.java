package com.example.activity_lifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ActivityLifecycle","oncreate");

        et=findViewById(R.id.et1);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);



          String s=savedInstanceState.getString("text");
          et.setText(s);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityLifecycle","onstart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityLifecycle","onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityLifecycle","onpause");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        String input=et.getText().toString();
        outState.putString("text", "input");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityLifecycle","onstop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityLifecycle","onrestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityLifecycle","ondestroy");
    }
}
