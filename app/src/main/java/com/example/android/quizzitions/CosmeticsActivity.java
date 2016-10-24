package com.example.android.quizzitions;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import static com.example.android.quizzitions.R.id.cosmetics;
import static com.example.android.quizzitions.R.string.music;


public class CosmeticsActivity extends AppCompatActivity
{

    Button btnDisplay;
    RadioGroup radio1, radio2, radio3, radio4;
    RadioButton selected;
    int points, correct;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosmetics);
        setTitle("Cosmetics");
        
        btnDisplay = (Button) findViewById(R.id.submit);
        radio1 = (RadioGroup) findViewById(R.id.CosmeticsOne);
        radio2 = (RadioGroup) findViewById(R.id.CosmeticsTwo);
        radio3 = (RadioGroup) findViewById(R.id.CosmeticsThree);
        radio4 = (RadioGroup) findViewById(R.id.CosmeticsFour);
        points = 0;

        radio1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                selected = (RadioButton) radio1.findViewById(checkedId);
                String answer = selected.getText().toString();

                if (checkedId == R.id.cosThree)
                {
                    answer = "";
                    points = points + 33;
                    correct++;
                }
                else
                {
                    answer ="";
                    points += 0;
                }
            }
        });

        radio2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                selected = (RadioButton) radio2.findViewById(checkedId);
                String answer = selected.getText().toString();

                if (checkedId == R.id.radioBtnn)
                {
                    answer = "";
                    points = points + 33;
                    correct++;
                }
                else
                {
                    answer ="";
                    points += 0;
                }
            }
        });

        radio3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                selected = (RadioButton) radio3.findViewById(checkedId);
                String answer = selected.getText().toString();

                if (checkedId == R.id.cosThree)
                {
                    answer = "";
                    points = points + 33;
                    correct++;
                }
                else
                {
                    answer ="";
                    points += 0;
                }
            }
        });

        radio4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                selected = (RadioButton) radio4.findViewById(checkedId);
                String answer = selected.getText().toString();

                if (checkedId == R.id.cosmTwo)
                {
                    answer = "";
                    points = points + 33;
                    correct++;
                }
                else
                {
                    answer ="";
                    points += 0;
                }
            }
        });

    }


    public void submitHere(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.images);
        builder.setTitle("quizzitions");
        builder.setMessage("Points:" + points + "\nCorrect Answers: " + correct);
        builder.setNegativeButton("OK", null);
        builder.show();

    }
}
