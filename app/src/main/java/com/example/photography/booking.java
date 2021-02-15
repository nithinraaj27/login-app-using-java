package com.example.photography;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class booking extends AppCompatActivity {

    private TextView bb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        bb = findViewById(R.id.id);
        Toast.makeText(booking.this, "OUR PHOTOGRAPHY MEMBER CONTACT U SHORTLY :)", Toast.LENGTH_LONG).show();

    }
}