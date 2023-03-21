package com.test.datetest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{

    Button buttonastro;
    TextView textViewastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonastro = findViewById(R.id.astrto_btn);
        textViewastro = findViewById(R.id.astro_sign_textview);

        buttonastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, MainActivity.this, year,month,day);
                datePickerDialog.show();
            }
        });

    }
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth){
        textViewastro.setText("Your Zodic Sign Is "+getZodiacSign(dayOfMonth,month));
    }

    private String getZodiacSign(int day, int month){
        String zodiacZign = "";

        if(month == 0){
            if (day<20){
                zodiacZign = "Capricorn";
            }else{
                zodiacZign = "Aquarius";
            }
        }else if(month==1){
            if (day<20){
                zodiacZign = "Aquarius";
            }else{
                zodiacZign = "Pisces";
            }
        }else if(month==2){
            if (day<20){
                zodiacZign = "Pisces";
            }else{
                zodiacZign = "Aries";
            }
        }else if(month==3){
            if (day<20){
                zodiacZign = "Aries";
            }else{
                zodiacZign = "Taurus";
            }
        }else if(month==4){
            if (day<20){
                zodiacZign = "Taurus";
            }else{
                zodiacZign = "Gemini";
            }
        }else if(month==5){
            if (day<20){
                zodiacZign = "Gemini";
            }else{
                zodiacZign = "Cancer";
            }
        }else if(month==6){
            if (day<20){
                zodiacZign = "Cancer";
            }else{
                zodiacZign = "Leo";
            }
        }else if(month==7){
            if (day<20){
                zodiacZign = "Leo";
            }else{
                zodiacZign = "Virgo";
            }
        }else if(month==8){
            if (day<20){
                zodiacZign = "Virgo";
            }else{
                zodiacZign = "Libra";
            }
        }else if(month==9){
            if (day<20){
                zodiacZign = "Libra";
            }else{
                zodiacZign = "Scorpio";
            }
        }else if(month==10){
            if (day<20){
                zodiacZign = "Scorpio";
            }else{
                zodiacZign = "Sagittarius";
            }
        }else if(month==11){
            if (day<20){
                zodiacZign = "Sagittarius";
            }else{
                zodiacZign = "Capricorn";
            }
        }
        return zodiacZign;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}