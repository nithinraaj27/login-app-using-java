package com.example.photography;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class form extends AppCompatActivity {

    private TextView nname;
    private TextView nfname;
    private TextView ndate;
    private TextView naddres;
    private TextView nphno;
    private Button nbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        nname = findViewById(R.id.name);
        nfname = findViewById(R.id.func_name);
        ndate = findViewById(R.id.date);
        naddres = findViewById(R.id.adress);
        nphno = findViewById(R.id.phnno);
        nbtn = findViewById(R.id.bttn);


        nbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(form.this,booking.class);
                startActivity(it);
            }
        });
    }
}