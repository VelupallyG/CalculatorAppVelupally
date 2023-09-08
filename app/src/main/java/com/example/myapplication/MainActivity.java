package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String currentNum = "";
    String view = "";
    ArrayList<Integer> NumArr;
    ArrayList<String> OperationsArr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //view v is the button object?
    public void takeInput(View v){
        //integers
        if (v.getId() == R.id.button0){
            currentNum = currentNum + "0";
        }
        else if (v.getId() == R.id.button1){
            currentNum = currentNum + "1";
        }
        else if (v.getId() == R.id.button2){
            currentNum = currentNum + "2";
        }
        else if (v.getId() == R.id.button3){
            currentNum = currentNum + "3";
        }
        else if (v.getId() == R.id.button4){
            currentNum = currentNum + "4";
        }
        else if (v.getId() == R.id.button5){
            currentNum = currentNum + "5";
        }
        else if (v.getId() == R.id.button6){
            currentNum = currentNum + "6";
        }
        else if (v.getId() == R.id.button7){
            currentNum = currentNum + "7";
        }
        else if (v.getId() == R.id.button8){
            currentNum = currentNum + "8";
        }
        else if (v.getId() == R.id.button9){
            currentNum = currentNum + "9";
        }
        //operations
        else if (v.getId() == R.id.buttonAdd){
            currentNum = currentNum + "9";
        }
    }
}