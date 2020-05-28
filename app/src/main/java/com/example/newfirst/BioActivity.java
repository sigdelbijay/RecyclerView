package com.example.newfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class BioActivity extends AppCompatActivity {

    EditText nameET, descriptionET;
    RadioGroup genderRG;
    RadioButton radioButton;
    CheckBox cProgrammingCB, cPPCB, javaCB, othersCB;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        nameET = findViewById(R.id.nameET);
        descriptionET = findViewById(R.id.descriptionET);
        genderRG = findViewById(R.id.genderRG);
        cProgrammingCB = findViewById(R.id.cProgrammingCB);
        cPPCB = findViewById(R.id.cPPCB);
        javaCB = findViewById(R.id.javaCB);
        othersCB = findViewById(R.id.othersCB);
        submitButton = findViewById(R.id.submitButton);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer buffer = new StringBuffer();
                buffer.append("Hello " + nameET.getText().toString() + "\n");
                buffer.append("Description: " + descriptionET.getText().toString()+ "\n");

                radioButton = findViewById(genderRG.getCheckedRadioButtonId());
                buffer.append("Your gender is " + radioButton.getText().toString() + "\n");
                buffer.append("Your skills are: ");
                buffer.append("C Programming:" + cProgrammingCB.isChecked() + "\n");
                buffer.append("CPP: " + cPPCB.isChecked() + "\n");
                buffer.append("Java: " + javaCB.isChecked() + "\n");
                buffer.append("Others: " + othersCB.isChecked());

                Log.d("BIO", buffer.toString());

            }
        });
    }
}
