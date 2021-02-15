package com.example.photography;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
`
public class loginpage extends AppCompatActivity {

    private TextView juname;
    private TextView jpassword;
    private Button jbtn1;

    private String USERNAME  = "nithinraaj";
    private String PASSWORD =  "123456";

    private boolean isvalidte = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        juname = findViewById(R.id.uname);
        jpassword = findViewById(R.id.upassword);
        jbtn1 = findViewById(R.id.btn1);

        jbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputname = juname.getText().toString();
                String inputpass = jpassword.getText().toString();

                if(inputname.isEmpty() || inputpass.isEmpty())
                {
                    Toast.makeText(loginpage.this,"ENTER THE DETAILS",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    isvalidte = validate(inputname,inputpass);
                    if(!isvalidte) {
                        Toast.makeText(loginpage.this, "ENTERED CREDENTIALS ARE WRONG", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(loginpage.this, "LOGIN SUCESSFUL", Toast.LENGTH_SHORT).show();
                        Intent in = new Intent(loginpage.this,form.class);
                        startActivity(in);
                    }
                }
            }
        });
    }

  private boolean validate(String name,String password)
  {
      if(name.equals(USERNAME) && password.equals(PASSWORD))
      {
          return true;
      }
      return false;
  }
}