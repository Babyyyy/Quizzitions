package com.example.android.quizzitions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button music;
    Button cosmetics;
    Button generalKnowledge;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        music = (Button) findViewById(R.id.button_music);
        cosmetics = (Button) findViewById(R.id.cosmetics);
        generalKnowledge = (Button) findViewById(R.id.generalKnowledge);

    }

    public void goToMusic(View view)
    {
        Intent intent = new Intent(this,SoulActivity.class);
        startActivity(intent);
    }

    public void goToCosmetics(View view)
    {
        Intent intent = new Intent(this,CosmeticsActivity.class);
        startActivity(intent);
    }

    public void goToGeneral(View view)
    {
        Intent intent = new Intent(this,GeneralActivity.class);
        startActivity(intent);
    }







}
