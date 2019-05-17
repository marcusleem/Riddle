package com.marcus.riddle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Event handling Step 1
    TextView tvQ1;
    Button btnRevealQ1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Event handling Step 2
        tvQ1 = findViewById(R.id.buttonRevealQ1);

        //Event handling Step 3
        btnRevealQ1.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View v) {
            Intent intent =new Intent(getBaseContext(),AnswerActivity1.class);
            intent.putExtra("Question" , "Q1");
            startActivity(intent);


            }
        });
    }
}
