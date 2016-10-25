package com.example.android.quizzitions;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import static com.example.android.quizzitions.R.string.music;
import static com.example.android.quizzitions.R.string.quizzitions;

public class SoulActivity extends AppCompatActivity
{

    Button  btnDisplay;
    RadioGroup rdgGroup1, rdgGroup2, rdgGroup3, rdgGroup4;
    RadioButton selected;
    int points, correct;
    String answer;
    String answer2;
    String answer3;
    String answer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soul);


        btnDisplay = (Button) findViewById(R.id.submit);
        rdgGroup1 = (RadioGroup) findViewById(R.id.soulOne);
        rdgGroup2 = (RadioGroup) findViewById(R.id.soulTwo);
        rdgGroup3 = (RadioGroup) findViewById(R.id.soulThree);
        rdgGroup4 = (RadioGroup) findViewById(R.id.soulFour);
        points = 0;

        rdgGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
             selected = (RadioButton) rdgGroup1.findViewById(checkedId);
                answer = selected.getText().toString();

                if (checkedId == R.id.radioTwo)
                {
                    answer = "1. Brenda Fassie is correct!";
                    points = points + 10;
                    correct++;
                }
                else
                {
                    answer ="1. The correct answer is Brenda Fassie";
                    points += 0;
                }

            }
        });

        rdgGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                selected = (RadioButton) rdgGroup2.findViewById(checkedId);
                 answer2 = selected.getText().toString();

                if (checkedId == R.id.radioBtnn)
                {
                    answer2 = answer + "\n2. TKZ is correct!";
                    points = points + 10;
                    correct++;
                }
                else
                {
                    answer2 = answer + "\n 2. The correct answer is TKZ";
                    points += 0;
                }

            }
        });

        rdgGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                selected = (RadioButton) rdgGroup3.findViewById(checkedId);
                answer3 = selected.getText().toString();

                if (checkedId == R.id.radioClk)
                {
                    answer3 = answer2 + "\n3. Bartolomeo di Francesco Cristofori is correct!";
                    points = points + 10;
                    correct++;
                }
                else
                {
                   answer3 = answer2 + "\n 3. The correct answer is Bartolomeo di Francesco Cristofori";
                    points += 0;
                }

            }
        });

        rdgGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                selected = (RadioButton) rdgGroup4.findViewById(checkedId);
                answer4 = selected.getText().toString();

                if (checkedId == R.id.radioButton3)
                {
                    answer4 = answer3 + "\n 4. Ladysmith Black Mambazo is correct!";
                    points = points + 10;
                    correct++;
                }
                else
                {
                    answer4 = answer3 + "\n 4. The correct answer is Ladysmith Black Mambazo";
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
        builder.setMessage("Points:" + points + "\nCorrect Answers:\n " + answer4);
        builder.setNegativeButton("OK", null);
        builder.show();

    }
}

























