package com.example.esegitteam5b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Context;

public class MainActivity extends AppCompatActivity {
    Button invio;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        invio= (Button)findViewById(R.id.b1);
        context=getApplicationContext();
    }
    public void message(View v){
        int duration = Toast.LENGTH_LONG;
        Toast  toast = Toast.makeText(context,R.string.text,duration);
        toast.show();
    }
}