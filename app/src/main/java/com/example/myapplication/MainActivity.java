package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String currentNum;
    String view;
    ArrayList<String> numArr = new ArrayList<String>();
    ArrayList<String> operationsArr = new ArrayList<String>();
    TextView result_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result_tv = findViewById(R.id.result_tv);
        currentNum = "";
        view = "";

    }

    //view v is the button object?
    public void takeInput(View v){
        //integers
        if (v.getId() == R.id.button0){
            currentNum = currentNum + "0";
            view = view + "0";
        }
        else if (v.getId() == R.id.button1){
            currentNum = currentNum + "1";
            view = view + "1";
        }
        else if (v.getId() == R.id.button2){
            currentNum = currentNum + "2";
            view = view + "2";
        }
        else if (v.getId() == R.id.button3){
            currentNum = currentNum + "3";
            view = view + "3";
        }
        else if (v.getId() == R.id.button4){
            currentNum = currentNum + "4";
            view = view + "4";
        }
        else if (v.getId() == R.id.button5){
            currentNum = currentNum + "5";
            view = view + "5";
        }
        else if (v.getId() == R.id.button6){
            currentNum = currentNum + "6";
            view = view + "6";
        }
        else if (v.getId() == R.id.button7){
            currentNum = currentNum + "7";
            view = view + "7";
        }
        else if (v.getId() == R.id.button8){
            currentNum = currentNum + "8";
            view = view + "8";
        }
        else if (v.getId() == R.id.button9){
            currentNum = currentNum + "9";
            view = view + "9";
        }
        //operations
        else if (v.getId() == R.id.buttonAdd){
            numArr.add(currentNum);
            currentNum = "";
            view = view + " + ";
            operationsArr.add("+");
        }
        else if (v.getId() == R.id.buttonSubtract){
            numArr.add(currentNum);
            currentNum = "";
            view = view + " - ";
            operationsArr.add("-");
        }
        else if (v.getId() == R.id.buttonMultiply){
            numArr.add(currentNum);
            currentNum = "";
            view = view + " * ";
            operationsArr.add("*");
        }
        else if (v.getId() == R.id.buttonDivide){
            numArr.add(currentNum);
            currentNum = "";
            view = view + " / ";
            operationsArr.add("/");
        }
        //Clear and decimal buttons: later
        else if (v.getId() == R.id.buttonEnter){
            numArr.add(currentNum);
            view = calculate();
        }
        else if (v.getId() == R.id.buttonClear){
            currentNum = "";
            view = "";
            numArr = new ArrayList<String>();
            operationsArr = new ArrayList<String>();
        }
        result_tv.setText(view);
    }

    public String calculate(){
        //numArr.size() == OperationsArr.size() + 1
        if (numArr.contains("") == false) {
            double answer = Double.parseDouble(numArr.get(0));
            for (int i = 0; i < operationsArr.size(); i++) {
                String operation = operationsArr.get(i);
                if (operation.equals("+")) {
                    answer += Double.parseDouble(numArr.get(i + 1));
                }
                if (operation.equals("-")) {
                    answer -= Double.parseDouble(numArr.get(i + 1));
                }
                if (operation.equals("*")) {
                    answer *= Double.parseDouble(numArr.get(i + 1));
                }
                if (operation.equals("/")) {
                    if (Double.parseDouble(numArr.get(i + 1)) == 0){
                        return "ERR";
                    }
                    answer /= Double.parseDouble(numArr.get(i + 1));
                }
            }
            return String.valueOf(answer);
        }else{
            return "ERR";
        }
    }
}