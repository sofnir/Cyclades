package com.company.cyclades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textFavor;
    Button button;
    RandomGods randomGods;
    GodsImg godsImg;
    Favor favor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        textFavor = (TextView) findViewById(R.id.textFavor);
        button = (Button) findViewById(R.id.shuffle);

        final int playerNumber =  Integer.parseInt(message);
        randomGods = new RandomGods(playerNumber);

        godsImg = new GodsImg(this);
        favor = new Favor();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            randomGods.random();
            godsImg.updateVisibility(randomGods.getGodsNumber());

            for (int i = 0; i < randomGods.getGodsNumber(); i++) {
                godsImg.setImageResource(i, randomGods.godsTab[i]);
            }

            textFavor.setText(favor.getRandom());
            }
        });
    }
}
