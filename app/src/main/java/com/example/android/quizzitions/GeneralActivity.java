package com.example.android.quizzitions;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class GeneralActivity extends AppCompatActivity
{

    Button btnDisplay;
    RadioGroup genOne, genTwo, genThree, genFour;
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
        setContentView(R.layout.activity_general);


        btnDisplay = (Button) findViewById(R.id.submit);
        genOne = (RadioGroup) findViewById(R.id.genKnow);
        genTwo = (RadioGroup) findViewById(R.id.genKnowOne);
        genThree = (RadioGroup) findViewById(R.id.genKnowTwo);
        genFour = (RadioGroup) findViewById(R.id.genKnowThree);
        points = 0;

        genOne.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                selected = (RadioButton) genOne.findViewById(checkedId);
                answer = selected.getText().toString();

                if (checkedId == R.id.radioTwo)
                {
                    answer = "1. Giraffe is correct!";
                    points = points + 10;
                    correct++;
                } else
                {
                    answer = "1. The correct answer is Giraffe";
                    points += 0;
                }
            }
        });

        genTwo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                selected = (RadioButton) genTwo.findViewById(checkedId);
                answer1 = selected.getText().toString();

                if (checkedId == R.id.radioBtnn)
                {
                    answer1 = answer + "\n 2. Curvy hips is correct!";
                    points = points + 10;
                    correct++;
                } else {
                    answer1 = answer + "\n 2. The correct answer is Curvy Hips";
                    points += 0;
                }
            }
        });

        genThree.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                selected = (RadioButton) genThree.findViewById(checkedId);
                answer2 = selected.getText().toString();

                if (checkedId == R.id.radioClk)
                {
                    answer2 = answer1 + "\n 3. France is correct!";
                    points = points + 10;
                    correct++;
                } else {
                    answer2 = answer1 + "\n 3. The correct answer is France";
                    points += 0;
                }
            }
        });

        genFour.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                selected = (RadioButton) genFour.findViewById(checkedId);
                answer3 = selected.getText().toString();

                if (checkedId == R.id.radioButton2)
                {
                    answer3 = answer2 + "\n 4. Venus is correct!";
                    points = points + 10;
                    correct++;
                } else {
                    answer3 = answer2 + "\n 3. The correct answer is Venus";
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
        builder.setMessage("Points:" + points + "\nCorrect Answers: " + answer3);
        builder.setNegativeButton("OK", null);
        builder.show();

    }
}
