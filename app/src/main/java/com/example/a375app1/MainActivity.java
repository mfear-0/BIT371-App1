package com.example.a375app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button myButton = (Button) findViewById(R.id.button);
    }

/*    public void goToActivity(View view){
        EditText user = findViewById(R.id.ptxt1);
        EditText pass = findViewById(R.id.ptxt2);
        String userin = user.getText().toString();
        String passin = pass.getText().toString();
        Log.i("INFO", "Username is " + userin);
        Log.i("INFO", "Username is " + passin);

        Intent intent = new Intent(getApplicationContext(), Activity2.class);
        intent.putExtra("Username:", userin);
        intent.putExtra("Password:", passin);
        Log.i("INFO", "Moving to confirmation...");
        startActivity(intent);

    }*/

}