package com.example.rishabh.scorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   int ScoreA;
   int ScoreB;

    public void threeA(View view){
        ScoreA=ScoreA+3;
        displayA(ScoreA);
    }

    public void threeB(View view){
        ScoreB=ScoreB+3;
        displayB(ScoreB);
    }

    public void twoA(View view){
        ScoreA=ScoreA+2;
        displayA(ScoreA);
    }

    public void twoB(View view){
        ScoreB=ScoreB+2;
        displayB(ScoreB);
    }

    public void freeA(View view){
        ScoreA=ScoreA+1;
        displayA(ScoreA);
    }

    public void freeB(View view){
        ScoreB=ScoreB+1;
        displayB(ScoreB);
    }

    private void displayA(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.textView);
        quantityTextView.setText("" + number);
    }
    private void displayB(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.textView2);
        quantityTextView.setText("" + number);
    }


}
