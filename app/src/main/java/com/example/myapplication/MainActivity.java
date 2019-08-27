package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText burden = findViewById(R.id.bee);
        final TextView baxter = findViewById(R.id.kurl);
        Button but = findViewById(R.id.button1);
        Random random = new Random();
        final TextView gino = findViewById(R.id.ers);
        final int randnum = random.nextInt(10);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int guess = Integer.parseInt(burden.getText().toString());
                if(guess==randnum) {
                    baxter.setText("You win!");
                }
                else{
                    baxter.setText("try again");
                }
                if(Math.abs(randnum-guess)<=3){
                    gino.setText("close");
                }
                else if(Math.abs(randnum - guess) >= 3){
                    gino.setText("far");
                }
                //this is a commment
            }
        });
    }
}
