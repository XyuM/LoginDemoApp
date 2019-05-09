package com.example.logindemoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    private EditText et_username;
    private EditText et_password;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.bu_1);
        final EditText account = (EditText) findViewById(R.id.et_username);
        final EditText code = (EditText) findViewById(R.id.et_password);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = ((EditText) findViewById(R.id.et_username)).getText().toString();
                String pwd = ((EditText)findViewById(R.id.et_password)).getText().toString();




            }

        });
    }
}
