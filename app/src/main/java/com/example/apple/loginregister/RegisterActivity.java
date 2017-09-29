package com.example.apple.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);

        final Button RegisterBton = (Button) findViewById(R.id.RegisterBton);

        RegisterBton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent register = new Intent(RegisterActivity.this,UserPageActivity.class);
                RegisterActivity.this.startActivity(register);
            }
        });

    }
}
