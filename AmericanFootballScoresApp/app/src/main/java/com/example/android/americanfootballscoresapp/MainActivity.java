package com.example.android.americanfootballscoresapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Tracks the score of Team A
    int scoreTeamA = 0 ;

    //Tracks the score of Team B
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 6 points
     */
    public void addSixForTeamA(View view){
        scoreTeamA += 6 ;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 6 points
     */
    public void addSixForTeamB(View view){
        scoreTeamB += 6;
        displayForTeamB(scoreTeamB);
    }


    /**
     * Increase the score for Team A by 3 points
     */
    public void addThreeForTeamA(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 3 points
     */
    public void addThreeForTeamB(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team A by 2 points
     */
    public void addTwoForTeamA(View view){
        scoreTeamA += 2 ;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 2 points
     */
    public void addTwoForTeamB(View view){
        scoreTeamB += 2 ;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team A by 1 point
     */
    public void addOneForTeamA(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 1 point
     */
    public void addOneForTeamB(View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset the scores of both Team A and Team B
     */
    public void resetScore(View view){
        scoreTeamA = 0 ;
        scoreTeamB = 0 ;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
