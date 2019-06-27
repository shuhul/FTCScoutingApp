package com.example.shuhulmujoo.ftcscoutingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {
    private Button record;
    private Button results;
    private Button about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_home_page);
        record = findViewById(R.id.rec);
        results = findViewById(R.id.view);
        about = findViewById(R.id.about);
        record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMainPage();
            }
        });
        results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToResultsPage();
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAboutPage();
            }
        });
    }
    private void goToMainPage(){
        Intent intent = new Intent(this, MainPage.class);
        startActivity(intent);
    }
    private void goToResultsPage(){
        Intent intent = new Intent(this, ResultsPage.class);
        startActivity(intent);
    }
    private void goToAboutPage(){
        Intent intent = new Intent(this, AboutPage.class);
        startActivity(intent);
    }
}
