package com.example.emicalculator;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class ELECActivity extends AppCompatActivity{
    TextView textView5,textView6;
    EditText      edittext, edittext1, edittext2, edittext3    ;
    TextView          button ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elec);
        Toast.makeText(this, " Kindly fill all the details", Toast.LENGTH_SHORT).show();
        edittext = findViewById(R.id.edittext);
        edittext1 = findViewById(R.id.edittext1);
        edittext2 = findViewById(R.id.edittext2);
        edittext3 = findViewById(R.id.edittext3);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);

        button = findViewById(R.id.submitButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a =Integer.parseInt(edittext1.getText().toString())  ;
                int b =Integer.parseInt(edittext2.getText().toString())  ;
                float c =Float.parseFloat(edittext3.getText().toString())  ;
                String d = edittext.getText().toString() ;

                float sum = a * b * 30;
                float sum1 =  sum/1000 ;
                float sum2 =  sum1 * c ;
                float sum3 =  sum2 * 12 ;
                textView5.setText(d +"'s Monthly Cost is = "+ sum2 + " Rs.")  ;
                textView6.setText(d +"'s Yearly Cost is = "+ sum3 + " Rs.")  ;
                Toast.makeText(getApplicationContext(), "form is submitted", Toast.LENGTH_SHORT ).show();


            }

        });
    }

}
