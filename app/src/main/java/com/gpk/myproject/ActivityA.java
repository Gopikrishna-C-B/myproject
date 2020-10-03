package com.gpk.myproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);


        Toolbar toolbar = findViewById(R.id.toolbar_a);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Log.d("ActivityA lifeCycle","In Oncreate");


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityA lifeCycle","In OnStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityA lifeCycle","In OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityA lifeCycle","In OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityA lifeCycle","In OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityA lifeCycle","In OnDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityA lifeCycle","In OnRestart");
    }

    public void openActivityC(View view)
    {
        startActivity(new Intent(this,ActivityC.class));


    }
}