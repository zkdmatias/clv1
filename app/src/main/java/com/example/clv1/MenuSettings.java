package com.example.clv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.button.MaterialButton;

public class MenuSettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_settings);

        /*hamburger*/
        ImageButton menubtn = (ImageButton) findViewById(R.id.menubtn);
        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuSettings.this, Settings.class));
            }
        });

        /*icon*/
        ImageButton logo = (ImageButton) findViewById(R.id.logo);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuSettings.this, Home_page.class));
            }
        });

        /*------------------------------------------------------------------BUTTONS*/
        /*GenSet*/
        MaterialButton gensetbtn = (MaterialButton) findViewById(R.id.gensetbtn);
        gensetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuSettings.this, GenSettings.class));
            }
        });

        /*Priv*/
        MaterialButton privsetbtn = (MaterialButton) findViewById(R.id.privsetbtn);
        privsetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuSettings.this, PrivacySettings.class));
            }
        });

        /*Back*/
        MaterialButton backbtn = (MaterialButton) findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuSettings.this, Settings.class));
            }
        });
    }
}