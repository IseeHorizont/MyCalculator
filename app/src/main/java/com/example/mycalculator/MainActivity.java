package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<Integer> numbers = new ArrayList<>();
    public String operations = "";
    public Integer result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        Button button0 = findViewById(R.id.key_0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(0);
                numbers.add(0);
            }
        });

        Button button1 = findViewById(R.id.key_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(1);
                numbers.add(1);
            }
        });

        Button button2 = findViewById(R.id.key_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(2);
                numbers.add(2);
            }
        });

        Button button3 = findViewById(R.id.key_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(3);
                numbers.add(3);
            }
        });

        Button button4 = findViewById(R.id.key_4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(4);
                numbers.add(4);
            }
        });

        Button button5 = findViewById(R.id.key_5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(5);
                numbers.add(5);
            }
        });

        Button button6 = findViewById(R.id.key_6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(6);
                numbers.add(6);
            }
        });

        Button button7 = findViewById(R.id.key_7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(7);
                numbers.add(7);
            }
        });

        Button button8 = findViewById(R.id.key_8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(8);
                numbers.add(8);
            }
        });

        Button button9 = findViewById(R.id.key_9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(9);
                numbers.add(9);
            }
        });

        Button buttonDivided = findViewById(R.id.key_divided);
        buttonDivided.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("/");
                operations = "/";
            }
        });

        Button buttonMultiply = findViewById(R.id.key_multiply);
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("*");
                operations = "*";
            }
        });

        Button buttonPlus = findViewById(R.id.key_plus);
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("+");
                operations = "+";
            }
        });

        Button buttonMinus = findViewById(R.id.key_minus);
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("-");
                operations = "-";
            }
        });

        Button buttonEquals = findViewById(R.id.key_equals);
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (operations) {
                    case "/":
                        result = numbers.get(0) / numbers.get(1);
                        break;
                    case "*":
                        result = numbers.get(0) * numbers.get(1);
                        break;
                    case "+":
                        result = numbers.get(0) + numbers.get(1);
                        break;
                    case "-":
                        result = numbers.get(0) - numbers.get(1);
                        break;
                }
                System.out.println("Результат операции: " + result);
            }
        });
    }
}