package com.example.student.labsheet3app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("AALifeCycle","Inside Oncrete() Method");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("AALifeCycle","Inside onStart() Method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("AALifeCycle","Inside onResume() Method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("AALifeCycle","Inside onPause() Method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("AALifeCycle","Inside onStop() Method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("AALifeCycle","Inside onDestroy() Method");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("AALifeCycle","Inside onRestart() Method");
    }
}
