package com.createsapp.traveloboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView bhgone;
    Button btnget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bhgone = findViewById(R.id.bgImage);
        btnget = findViewById(R.id.btnget);

        bhgone.animate().scaleX(2).scaleY(2).setDuration(5000).start();

        btnget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,SignUp.class);
                startActivity(a);
            }
        });

    }
}
