package com.example.a375app1;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private String username = "bob";
    private String password = "pass";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        String userac = getIntent().getStringExtra("Username:");
        String passac = getIntent().getStringExtra("Password:");
        TextView tv2 = findViewById(R.id.txt2);

        if(username.equals(userac) && password.equals(passac)){
            tv2.setText("Logged in as " + userac);
            Log.i("INFO", "Log in successful, attempted log in with username: "+userac+" and password: "+passac+ " matched.");
        }
        else{
            tv2.setText("Username or Password entered incorrectly");
            Log.i("INFO", "Log in unsuccessful, attempted log in with username: "+userac+" and password: "+passac+ "  do not match saved username: "+username+" and password: "+password+".");
        }
    }
}