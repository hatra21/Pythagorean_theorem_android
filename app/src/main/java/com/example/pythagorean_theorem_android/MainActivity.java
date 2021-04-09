package com.example.pythagorean_theorem_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText base;
    private EditText perpendicular;
    private TextView answerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.base = this.findViewById(R.id.base);
        this.perpendicular = this.findViewById(R.id.perpendicular);
        this.answerTV = this.findViewById(R.id.answerTV);

    }


    public void onCalculateBtnClicked(View v) {
        String baseVal = this.base.getText().toString();
        String perpendicularVal = this.perpendicular.getText().toString();

        double result = calculatePythagorean(Double.parseDouble(baseVal), Double.parseDouble(perpendicularVal));
        this.answerTV.setText(Double.toString(result));
    }

    public double calculatePythagorean(double base, double perpendicular) {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(perpendicular, 2));

    }
}