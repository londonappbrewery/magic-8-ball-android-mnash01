package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Varibles
        Button makeDecision = findViewById(R.id.decisionButton);
        final ImageView magicBall = findViewById(R.id.appImage);
        //Create Array of images from 0 to 4
        final int[] decisionArray = {R.drawable.ball1,
        R.drawable.ball2,
        R.drawable.ball3,
        R.drawable.ball4,
        R.drawable.ball5};


        makeDecision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Generate Random Number
                Random randFunction = new Random();
                int randNumber = randFunction.nextInt(5);
                //Log.d("magicballtag", "onClick: The random number is" +randNumber);
                magicBall.setImageResource(decisionArray[randNumber]);
            }
        });

    }
}
