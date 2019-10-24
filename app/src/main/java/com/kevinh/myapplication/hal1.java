package com.kevinh.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class hal1 extends AppCompatActivity {
    EditText edtnpm;
    EditText edtnama;
    Button btnkirim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtnpm  = (EditText) findViewById(R.id.edtnpm);
        edtnama = (EditText) findViewById(R.id.edtnama);

        btnkirim = (Button) findViewById(R.id.btnkirim);
        btnkirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String npm = edtnpm.getText().toString();
                String nama = edtnama.getText().toString();

                Intent next = new Intent(hal1.this,hal2.class);
                next.putExtra("txtnpm", npm);
                next.putExtra("txtnama", nama);
                startActivity(next);
                finish();
            }
        });
    }
}
