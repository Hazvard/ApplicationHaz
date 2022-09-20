package com.example.myapplication;

import android.content.Intent;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("MainActivity", "onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bonjour = findViewById(R.id.bonjour);
        Button chrono = findViewById(R.id.chrono);
        Button photo = findViewById(R.id.photo);

        bonjour.setOnClickListener(view -> Toast.makeText(MainActivity.this,"Bonjour", Toast.LENGTH_SHORT).show());
        chrono.setOnClickListener(view -> startActivities(new Intent[]{new Intent(MainActivity.this, ChronometreActivity.class)}));










    }
}