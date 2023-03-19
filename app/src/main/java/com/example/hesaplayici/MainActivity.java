package com.example.hesaplayici;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBindingUtil;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.hesaplayici.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;
    private String process = "";
    private String firstNumber = "0",secondNumber = "0";
    private double result;

    private int flag = 0;
    private int flag2 = 0;


    // =  butonuna basmadan +,-,x,/ kullanarak üst üste işlem yapılabilir. ÖRNEĞİN sayı girildikten sonra + ya basılmalı.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = DataBindingUtil.setContentView(this,R.layout.activity_main);



        tasarim.resultView.setText("= 0");

        tasarim.zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(process.equals("")) {
                    firstNumber += "0";
                }
                else {
                    secondNumber += "0";
                }
                tasarim.calculateView.setText(tasarim.calculateView.getText() + "0");
            }
        });
        tasarim.oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(process.equals("")) {
                    firstNumber += "1";
                }
                else {
                    secondNumber += "1";
                }
                tasarim.calculateView.setText(tasarim.calculateView.getText() + "1");
            }
        });
        tasarim.twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(process.equals("")) {
                    firstNumber += "2";
                }
                else {
                    secondNumber += "2";
                }
                tasarim.calculateView.setText(tasarim.calculateView.getText() + "2");
            }
        });
        tasarim.threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(process.equals("")) {
                    firstNumber += "3";
                }
                else {
                    secondNumber += "3";
                }
                tasarim.calculateView.setText(tasarim.calculateView.getText() + "3");
            }
        });
        tasarim.fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(process.equals("")) {
                    firstNumber += "4";
                }
                else {
                    secondNumber += "4";
                }
                tasarim.calculateView.setText(tasarim.calculateView.getText() + "4");
            }
        });
        tasarim.fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(process.equals("")) {
                    firstNumber += "5";
                }
                else {
                    secondNumber += "5";
                }
                tasarim.calculateView.setText(tasarim.calculateView.getText() + "5");
            }
        });
        tasarim.sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(process.equals("")) {
                    firstNumber += "6";
                }
                else {
                    secondNumber += "6";
                }
                tasarim.calculateView.setText(tasarim.calculateView.getText() + "6");
            }
        });
        tasarim.sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(process.equals("")) {
                    firstNumber += "7";
                }
                else {
                    secondNumber += "7";
                }
                tasarim.calculateView.setText(tasarim.calculateView.getText() + "7");
            }
        });
        tasarim.eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(process.equals("")) {
                    firstNumber += "8";
                }
                else {
                    secondNumber += "8";
                }
                tasarim.calculateView.setText(tasarim.calculateView.getText() + "8");
            }
        });
        tasarim.nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(process.equals("")) {
                    firstNumber += "9";
                }
                else {
                    secondNumber += "9";
                }
                tasarim.calculateView.setText(tasarim.calculateView.getText() + "9");
            }
        });
        tasarim.dotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(process.equals("")) {
                    if(firstNumber.equals("0")){

                    }
                    else{
                        firstNumber += ".";
                        tasarim.calculateView.setText(tasarim.calculateView.getText() + ".");
                    }
                }
                else {
                    if(secondNumber.equals("0")){

                    }
                    else{
                        secondNumber += ".";
                        tasarim.calculateView.setText(tasarim.calculateView.getText() + ".");
                    }
                }
            }
        });




        tasarim.plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hesapla("+");

            }
        });
        tasarim.minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hesapla("-");
            }
        });
        tasarim.multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hesapla("x");
            }
        });
        tasarim.divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hesapla("/");
            }
        });
        tasarim.percentageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hesapla("%");
            }
        });
        tasarim.equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double r = 0;
                tasarim.calculateView.setText("");
                tasarim.resultView.setTextSize(70);
                if(process.equals("+")){
                    r = Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);
                    secondNumber = "";
                    firstNumber = String.valueOf(r);
                }
                else if(process.equals("-")){
                    r = Double.parseDouble(firstNumber) - Double.parseDouble(secondNumber);
                    secondNumber = "";
                    firstNumber = String.valueOf(r);
                }
                else if(process.equals("x")){
                    r = Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber);
                    secondNumber = "";
                    firstNumber = String.valueOf(r);
                }
                else if(process.equals("/")){
                    r = Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber);
                    secondNumber = "";
                    firstNumber = String.valueOf(r);
                }
                else if(process.equals("%")){
                    r = (Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber)) / 100;
                    secondNumber = "";
                    firstNumber = String.valueOf(r);
                }
                else{
                    tasarim.resultView.setText(String.valueOf(firstNumber));
                }
                tasarim.resultView.setText(String.valueOf(r));
            }
        });
        tasarim.clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = "";
                firstNumber = "0";
                secondNumber = "0";
                result = 0;
                color_reset();
                tasarim.calculateView.setText("");
                tasarim.resultView.setText("= 0");
            }
        });
        tasarim.deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(process.equals("")){
                    if(flag == 0){
                        firstNumber = firstNumber.substring(1);
                        flag = 1;
                    }
                    firstNumber = firstNumber.substring(0,firstNumber.length()-1);
                    tasarim.calculateView.setText(firstNumber);
                }
                else{
                    if(flag2 == 0){
                        secondNumber = secondNumber.substring(1);  //baştaki 0 ı siler
                        flag2 = 1;
                    }
                    secondNumber = secondNumber.substring(0,secondNumber.length()-1);
                    String text = tasarim.calculateView.getText().toString();
                    text = text.substring(0,text.length()-1);
                    tasarim.calculateView.setText(text);
                }
            }
        });



    }
    public void color_reset(){
        ViewCompat.setBackgroundTintList(tasarim.plusButton, ColorStateList.valueOf(Color.parseColor("#1D1D1D")));
        ViewCompat.setBackgroundTintList(tasarim.minusButton, ColorStateList.valueOf(Color.parseColor("#1D1D1D")));
        ViewCompat.setBackgroundTintList(tasarim.multiplyButton, ColorStateList.valueOf(Color.parseColor("#1D1D1D")));
        ViewCompat.setBackgroundTintList(tasarim.divisionButton, ColorStateList.valueOf(Color.parseColor("#1D1D1D")));
        ViewCompat.setBackgroundTintList(tasarim.percentageButton, ColorStateList.valueOf(Color.parseColor("#1D1D1D")));

    }
    public void hesapla(String process){
        double result = 0;
        if(process.equals("+")){
            this.process = "+";
            color_reset();
            ViewCompat.setBackgroundTintList(tasarim.plusButton, ColorStateList.valueOf(Color.parseColor("#00FF0D")));
            tasarim.calculateView.setText("");
            result = Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);
            secondNumber = "0";
            firstNumber = String.valueOf(result);
            tasarim.resultView.setText("= " + String.valueOf(result));
        }
        else if(process.equals("-")){
            this.process = "-";
            color_reset();
            ViewCompat.setBackgroundTintList(tasarim.minusButton, ColorStateList.valueOf(Color.parseColor("#00FF0D")));
            tasarim.calculateView.setText("");
            result = Double.parseDouble(firstNumber) - Double.parseDouble(secondNumber);
            secondNumber = "0";
            firstNumber = String.valueOf(result);
            tasarim.resultView.setText("= " + String.valueOf(result));
        }
        else if(process.equals("x")){
            if(secondNumber.equals("0")){
                this.process = "x";
                color_reset();
                ViewCompat.setBackgroundTintList(tasarim.multiplyButton, ColorStateList.valueOf(Color.parseColor("#00FF0D")));
                tasarim.calculateView.setText("");
                secondNumber = "1";
                firstNumber = String.valueOf(Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber));
                secondNumber = "0";
                tasarim.resultView.setText("= " + firstNumber);
            }
            else {
                this.process = "x";
                color_reset();
                ViewCompat.setBackgroundTintList(tasarim.multiplyButton, ColorStateList.valueOf(Color.parseColor("#00FF0D")));
                tasarim.calculateView.setText("");
                firstNumber = String.valueOf(Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber));
                secondNumber = "0";
                tasarim.resultView.setText("= " + firstNumber);
            }
        }
        else if(process.equals("/")){
            if(secondNumber.equals("0")){
                this.process = "/";
                color_reset();
                ViewCompat.setBackgroundTintList(tasarim.divisionButton, ColorStateList.valueOf(Color.parseColor("#00FF0D")));
                tasarim.calculateView.setText("");
                secondNumber = "1";
                result = Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber);
                secondNumber = "0";
                tasarim.resultView.setText("= " + String.valueOf(result));
            }
            else {
                this.process = "/";
                color_reset();
                ViewCompat.setBackgroundTintList(tasarim.divisionButton, ColorStateList.valueOf(Color.parseColor("#00FF0D")));
                tasarim.calculateView.setText("");
                result = Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber);
                secondNumber = "0";
                firstNumber = String.valueOf(result);
                tasarim.resultView.setText("= " + String.valueOf(result));
            }
        }
        else if(process.equals("%")){
            if(secondNumber.equals("0")){
                this.process = "%";
                color_reset();
                ViewCompat.setBackgroundTintList(tasarim.percentageButton, ColorStateList.valueOf(Color.parseColor("#00FF0D")));
                tasarim.calculateView.setText("");
                secondNumber = "100";
                result = (Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber)) / 100;
                secondNumber = "0";
                tasarim.resultView.setText("= " + String.valueOf(result));
            }
            else {
                this.process = "%";
                color_reset();
                ViewCompat.setBackgroundTintList(tasarim.percentageButton, ColorStateList.valueOf(Color.parseColor("#00FF0D")));
                tasarim.calculateView.setText("");
                result = (Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber)) / 100;
                secondNumber = "0";
                firstNumber = String.valueOf(result);
                tasarim.resultView.setText("= " + String.valueOf(result));
            }
        }
        else{
            tasarim.calculateView.setText("HATA");
        }
        

    }







}