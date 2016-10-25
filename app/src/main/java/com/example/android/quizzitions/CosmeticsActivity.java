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
    String answer;
    String answer1;
    String answer2;
    String answer3;


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
                answer = selected.getText().toString();

                if (checkedId == R.id.cosThree)
                {
                    answer = "1. DKNY Golden Delicious Million Dollar Fragrance Bottle is correct!";
                    points = points + 10;
                    correct++;
                }
                else
                {
                    answer ="1. The correct answer is DKNY Golden Delicious Million Dollar Fragrance Bottle";
                    points += 0;
                }
            }
        });

        radio2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                selected = (RadioButton) radio2.findViewById(checkedId);
                answer1 = selected.getText().toString();

                if (checkedId == R.id.radioBtnn)
                {
                    answer1 = answer + "\n2. The Hermes Chaine d Ancre is correct!";
                    points = points + 10;
                    correct++;
                }
                else
                {
                    answer1 = answer + "\n2. The correct answer is The Hermes Chaine d Ancre";
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

                if (checkedId == R.id.cosSix)
                {
                    answer2 = answer1 + "\n3. Noriko for Rene of Paris Shilo wig is correct!";
                    points = points + 10;
                    correct++;
                }
                else
                {
                    answer2 = answer1 +"\n3. The correct answer is Noriko for Rene of Paris Shilo wig";
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
                    answer3 = answer2 + "\n4. Calvin Klein Euphoria Men Body wash is correct!";
                    points = points + 10;
                    correct++;
                }
                else
                {
                    answer3 = answer2 + "\n4. The correct answer is Calvin Klein Euphoria Men Body wash";
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
        builder.setMessage("Points:" + points + "\nCorrect Answers: \n" + answer3);
        builder.setNegativeButton("OK", null);
        builder.show();

    }
}
