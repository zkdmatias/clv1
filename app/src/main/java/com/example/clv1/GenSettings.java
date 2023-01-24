package com.example.clv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class GenSettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gen_settings);

        /*hamburger*/
        ImageButton menubtn = (ImageButton) findViewById(R.id.menubtn);
        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GenSettings.this, Settings.class));
            }
        });

        /*icon*/
        ImageButton logo = (ImageButton) findViewById(R.id.logo);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GenSettings.this, Home_page.class));
            }
        });

        /*save*/
        MaterialButton save = (MaterialButton) findViewById(R.id.savebtn);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GenSettings.this, "UPDATE SUCCESSFUL", Toast.LENGTH_SHORT).show();
            }
        });

        /*BACK*/
        MaterialButton backbtn = (MaterialButton) findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GenSettings.this, MenuSettings.class));
            }
        });
    }
}