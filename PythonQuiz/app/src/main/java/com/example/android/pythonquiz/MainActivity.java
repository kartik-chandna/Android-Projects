package com.example.android.pythonquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Set the initial score to 0
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // This method is called when Submit button is clicked .
    // Calculates the total score and display it .
    public void showScore( View view ){

        //Increase the score by 1 if 1st answer is correct
        RadioButton trueRadioButton = (RadioButton)findViewById(R.id.true_radio_button);
        boolean isTrueRadioButton = trueRadioButton.isChecked();
        if(isTrueRadioButton)
            score += 1 ;

        // Increase the score by 1 if 2nd answer is correct
        EditText output = (EditText) findViewById(R.id.output);
        String outputText = output.getText().toString();
        if( outputText.equals("5+7+2"))
            score += 1 ;

        // Increase the score by 1 if 3nd answer is correct
        CheckBox option1 = (CheckBox) findViewById(R.id.option1_checkbox);
        boolean isOption1 = option1.isChecked();
        CheckBox option2 = (CheckBox) findViewById(R.id.option2_checkbox);
        boolean isOption2 = option2.isChecked();
        CheckBox option3 = (CheckBox) findViewById(R.id.option3_checkbox);
        boolean isOption3 = option3.isChecked();
        CheckBox option4 = (CheckBox) findViewById(R.id.option4_checkbox);
        boolean isOption4 = option4.isChecked();
        if(isOption1 & isOption2 & (!isOption3) & (!isOption4))
            score += 1;

        // Increase the score by 1 if 4nd answer is correct
        RadioButton dictRadioButton = (RadioButton)findViewById(R.id.dict_radio_button);
        boolean isDictRadioButton = dictRadioButton.isChecked();
        if(isDictRadioButton)
            score += 1;

        // Increase the score by 1 if 5nd answer is correct
        RadioButton yesRadioButton = (RadioButton)findViewById(R.id.yes_radio_button);
        boolean isYesRadioButton = yesRadioButton.isChecked();
        if( isYesRadioButton )
            score += 1;

        if ( score == 5)
            Toast.makeText(this ,"Perfect score!!" ,Toast.LENGTH_LONG ).show();
        else
            Toast.makeText(this , "You score is "+ score + " out of 5" ,Toast.LENGTH_LONG ).show();

        // Set the score to 0 , so that user can resubmit the quiz .
        score = 0 ;
    }
}
