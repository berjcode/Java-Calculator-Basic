package com.abdullahbalikci.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private  Calucalted calucalted;
    private EditText editTextFirstNumber, editTextSecondNumber;
    private TextView textViewResult;



    private String firstNumber,secondNumber;
    private int first1,second2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextFirstNumber = (EditText) findViewById(R.id.editTextFirstNumber);
        editTextSecondNumber=(EditText) findViewById(R.id.editTextSecondNumber);
        textViewResult = (TextView) findViewById(R.id.textViewResult);


    }


    public void Calucalted(View view){
        firstNumber =editTextFirstNumber.getText().toString();
        secondNumber=editTextSecondNumber.getText().toString();

        if(!TextUtils.isEmpty(firstNumber)&& !TextUtils.isEmpty(secondNumber)){
            first1= Integer.valueOf(firstNumber);
            second2=Integer.valueOf(secondNumber);
            calucalted = new Calucalted(first1,second2);


            switch (view.getId()){
                case R.id.plusButton:
                    result= calucalted.toplam();
                    break;
                case R.id.minusButton2:
                    result=calucalted.cikarma();
                    break;
                case R.id.multiplicationButton:
                    result=calucalted.carpma();
                    break;
                case R.id.divideButton:
                    result=calucalted.bolme();
                    break;

            }
            textViewResult.setText("Sonuç:" + result );
        }else {
            textViewResult.setText("Boş Değer Girilemez.");
        }

    }
}