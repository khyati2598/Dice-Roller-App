package com.lco.dicerollerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView dice;
    private Random myRandomNumber = new Random();
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dice = findViewById(R.id.imageView);

        dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotatedice();
                rollOurDice();
            }
        });

    }

    private void rotatedice() {
        animation= AnimationUtils.loadAnimation(this,R.anim.animation);
        dice.startAnimation(animation);
    }

    private void rollOurDice(){
        int myRanNumber = myRandomNumber.nextInt(6) + 1;

        switch (myRanNumber) {
            case 1:
                dice.setImageResource(R.drawable.dice1);
                break;
            case 2:
                dice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                dice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                dice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                dice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                dice.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
