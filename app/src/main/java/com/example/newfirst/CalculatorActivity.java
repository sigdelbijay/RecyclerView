package com.example.newfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editText1, editText2;
    TextView resultTV;
    Button plusButton, minusButton, multiplyButton, divideButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        resultTV = findViewById(R.id.resultTV);
        plusButton = findViewById(R.id.plusButton);
        minusButton = findViewById(R.id.minusButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        divideButton = findViewById(R.id.divideButton);

        plusButton.setOnClickListener(this);
        minusButton.setOnClickListener(this);
        multiplyButton.setOnClickListener(this);
        divideButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        int value1 = Integer.parseInt(editText1.getText().toString());
        int value2 = Integer.parseInt(editText2.getText().toString());
        switch (v.getId()){
            case R.id.plusButton:
                resultTV.setText((value1 + value2) + "");
                break;
            case R.id.minusButton:
                resultTV.setText(value1 - value2 + "");
                break;
            case R.id.multiplyButton:
                resultTV.setText(value1 * value2 + "");
                break;
            case R.id.divideButton:
//                resultTV.setText(value1 / value2 + "");
                int year = Calendar.getInstance().get(Calendar.YEAR);
                resultTV.setText(year+"");
                break;
        }
    }
}
