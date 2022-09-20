package com.example.myapplication;

import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ChronometreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("ChronometreActivity", "onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chronometre);
        Toast.makeText(ChronometreActivity.this,"Chronomètre", Toast.LENGTH_SHORT).show();

        ImageButton start = findViewById(R.id.start);
        ImageButton stop = findViewById(R.id.stop);

    }
}