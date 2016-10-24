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
                String answer = selected.getText().toString();

                if (checkedId == R.id.radioTwo)
                {
                    answer = "";
                    points = points + 33;
                    correct++;
                } else
                {
                    answer = "";
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
                String answer = selected.getText().toString();

                if (checkedId == R.id.radioBtnn)
                {
                    answer = "";
                    points = points + 33;
                    correct++;
                } else {
                    answer = "";
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
                String answer = selected.getText().toString();

                if (checkedId == R.id.radioClk)
                {
                    answer = "";
                    points = points + 33;
                    correct++;
                } else {
                    answer = "";
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
                String answer = selected.getText().toString();

                if (checkedId == R.id.radioButton2)
                {
                    answer = "";
                    points = points + 33;
                    correct++;
                } else {
                    answer = "";
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
