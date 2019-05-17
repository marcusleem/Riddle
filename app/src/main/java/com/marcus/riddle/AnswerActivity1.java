package com.marcus.riddle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        tvAnswer = findViewById(R.id.textViewQ1);
        tvAnswer.setText("In Second Activity");
        Intent intentReceieved = getIntent();
        String questionsSelected = intentReceieved.getStringExtra("Question");
        tvAnswer.setText(questionsSelected + " answer is: Queue");
    }
}
