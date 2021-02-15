package com.example.photography;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button jbtn;
    private TextView jidd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jbtn = findViewById(R.id.bt);

        jbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "LOGIN TO BOOK ORDERS", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,loginpage.class);
                startActivity(intent);
            }
        });
    }
}