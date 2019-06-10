package com.example.a1795481.rajwinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String tag = "Message : ";
    Button btn;
    TextView reg;
    EditText   name , email , password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(tag, "This is from onCreate()");
        btn = findViewById(R.id.btn_check);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Click",  "im clicked on button!");
                reg = findViewById(R.id.txt_register);

                reg.getText();
            }
        });
    }


    }

