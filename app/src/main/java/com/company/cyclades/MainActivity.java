package com.company.cyclades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.shawnlin.numberpicker.NumberPicker;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, Main2Activity.class);

        NumberPicker numberPicker = (NumberPicker) findViewById(R.id.number_picker);
        String message = Integer.toString(numberPicker.getValue());
        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);
    }
}
