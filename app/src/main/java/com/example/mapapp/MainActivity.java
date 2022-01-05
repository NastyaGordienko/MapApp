package com.example.mapapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText textShirota = (EditText) findViewById(R.id.textShirota);
        EditText textDolgota = (EditText) findViewById(R.id.textDolgota);
        Button btnMap = (Button) findViewById(R.id.btnMap);

       /* View.OnClickListener oclbtnMap = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent();
                intent1.setAction(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("geo: "+textShirota.getText().toString()+","+textDolgota.getText().toString()));
                startActivity(intent1);
            }
        };


        btnMap.setOnClickListener(oclbtnMap);
*/

    }
}