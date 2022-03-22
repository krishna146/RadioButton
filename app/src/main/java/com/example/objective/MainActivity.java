package com.example.objective;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //declaring all the view and view group

    RadioGroup rdGp_Qa, rdGp_Qb, rdGp_Qc;
    RadioButton rdBtn_Qa_Opta, rdBtn_Qa_Optb, rdBtn_Qa_Optc, rdBtn_Qa_Optd, rdBtn_Qb_Opta, rdBtn_Qb_Optb, rdBtn_Qb_Optc, rdBtn_Qb_Optd, rdBtn_Qc_Opta, rdBtn_Qc_Optb, rdBtn_Qc_Optc, rdBtn_Qc_Optd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialising all the view and viewgroup

        rdGp_Qa = findViewById(R.id.rdGp_Qa);
        rdGp_Qb = findViewById(R.id.rdGp_Qb);
        rdGp_Qc = findViewById(R.id.rdGp_Qc);
        rdBtn_Qa_Opta = findViewById(R.id.rdBtn_Qa_Opta);
        rdBtn_Qa_Optb = findViewById(R.id.rdBtn_Qa_Optb);
        rdBtn_Qa_Optc = findViewById(R.id.rdBtn_Qa_Optc);
        rdBtn_Qa_Optd = findViewById(R.id.rdBtn_Qa_Optd);
        rdBtn_Qb_Opta = findViewById(R.id.rdBtn_Qb_Opta);
        rdBtn_Qb_Optb = findViewById(R.id.rdBtn_Qb_Optb);
        rdBtn_Qb_Optc = findViewById(R.id.rdBtn_Qb_Optc);
        rdBtn_Qb_Optd = findViewById(R.id.rdBtn_Qb_Optd);
        rdBtn_Qc_Opta = findViewById(R.id.rdBtn_Qc_Opta);
        rdBtn_Qc_Optb = findViewById(R.id.rdBtn_Qc_Optb);
        rdBtn_Qc_Optc = findViewById(R.id.rdBtn_Qc_Optc);
        rdBtn_Qc_Optd = findViewById(R.id.rdBtn_Qc_Optd);

        // adding click listener on radigroup

        rdGp_Qa.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rdBtn_Qa_Optd) {
                    Toast.makeText(MainActivity.this, "correct answer", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "incorrect answer", Toast.LENGTH_SHORT).show();

                }
            }
        });

        rdGp_Qb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rdBtn_Qb_Optd) {
                    Toast.makeText(MainActivity.this, "correct answer", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "incorrect answer", Toast.LENGTH_SHORT).show();

                }
            }
        });


        rdGp_Qc.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rdBtn_Qc_Optb) {
                    Toast.makeText(MainActivity.this, "correct answer", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "incorrect answer", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}