package com.gpk.myproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
    }
     public void startActivityA(View view)
     {
         Intent intent = new Intent(this,ActivityA.class);
         startActivity(intent);


     }
     public void startActivityB(View view)
     {
         Intent intent = new Intent();
         intent.setAction(Intent.ACTION_SEND);
         intent.setType("text/plain");
         String message = "Hello Gopi..";
         intent.putExtra(Intent.EXTRA_TEXT,message);
         startActivity(intent);


     }


}