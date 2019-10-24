package com.kevinh.myapplication;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class hal2 extends AppCompatActivity {

    TextView txtnpm;
        TextView txtnama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
                 setContentView(R.layout.activity_hal2);

                   txtnpm  = (TextView) findViewById(R.id.txtnpm);
                        txtnama = (TextView) findViewById(R.id.txtnama);


                  Intent datas = getIntent();
                     String npm = datas.getStringExtra("txtnpm");
                          String nama = datas.getStringExtra("txtnama");



        txtnpm.setText(npm);
        txtnama.setText(nama);


    }
    @Override
    public void onBackPressed() {
        Intent back = new Intent(hal2.this, hal1.class);
        startActivity(back);
        finish();

    }
}

