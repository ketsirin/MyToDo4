package com.example.mytodo;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast t = Toast.makeText(Main2Activity.this,"Welcome to My ToDo application!",Toast.LENGTH_SHORT);
        t.show();
    }
}
