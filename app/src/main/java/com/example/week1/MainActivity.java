package com.example.week1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    public double result = 0;
    public String myOperation = "";
    DecimalFormat decimalFormat = new DecimalFormat("0.#");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txtNum = findViewById(R.id.txtNum);
        //Create variable for all buttons
        Button btnCal = findViewById(R.id.btnCal);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btn0 = findViewById(R.id.btn0);
        Button btnClear = findViewById(R.id.btnClear);
        Button btnDot = findViewById(R.id.btnDot);
        Button btnPlus = findViewById(R.id.btnPlus);
        Button btnMinus = findViewById(R.id.btnMinus);
        Button btnMultiply = findViewById(R.id.btnMultiply);
        Button btnDivide = findViewById(R.id.btnDivide);

        //Listener
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNum.setText("0");
                myCalculate(Integer.parseInt(txtNum.getText().toString()));
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNum.setText("1");
                myCalculate(Integer.parseInt(txtNum.getText().toString()));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNum.setText("2");
                myCalculate(Integer.parseInt(txtNum.getText().toString()));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNum.setText("3");
                myCalculate(Integer.parseInt(txtNum.getText().toString()));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNum.setText("4");
                myCalculate(Integer.parseInt(txtNum.getText().toString()));
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNum.setText("5");
                myCalculate(Integer.parseInt(txtNum.getText().toString()));
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNum.setText("6");
                myCalculate(Integer.parseInt(txtNum.getText().toString()));
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNum.setText("7");
                myCalculate(Integer.parseInt(txtNum.getText().toString()));
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNum.setText("8");
                myCalculate(Integer.parseInt(txtNum.getText().toString()));
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNum.setText("9");
                myCalculate(Integer.parseInt(txtNum.getText().toString()));
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myOperation  = "+";
                txtNum.setText(decimalFormat.format(result));
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myOperation = "-";
                txtNum.setText(decimalFormat.format(result));
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myOperation = "*";
                txtNum.setText(decimalFormat.format(result));
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myOperation = "/";
                txtNum.setText(decimalFormat.format(result));
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = 0;
                myOperation = "";
                txtNum.setText("");
            }
        });
        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, String.valueOf(result), Toast.LENGTH_SHORT).show();
                txtNum.setText(decimalFormat.format(result));
                myOperation = "";
            }
        });
    }

    private void myCalculate(int currentNum){
        switch (myOperation){
            case "+": result += currentNum;
            break;
            case "-": result -= currentNum;
            break;
            case "*": result *= currentNum;
            break;
            case "/": result /= currentNum;
            break;
            default: result = currentNum;
        }
    }

}
