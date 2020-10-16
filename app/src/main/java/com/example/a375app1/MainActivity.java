package com.example.a375app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    private final String[] cities = {"Seattle", "Bothell", "Kirkland", "Bellevue", "Lynnwood", "Renton", "Redmond", "Spokane", "Vancouver", "Tacoma", "Olympia", "Bellingham", "Arlington", "Everett", "Woodinville", "Monroe", "New Castle", "Ballard", "Lacey"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.listview_layout, R.id.textView, cities);
        ListView lv = findViewById(R.id.mainList);
        lv.setAdapter(adapter);

    }
}