package com.example.events;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {

    androidx.appcompat.widget.AppCompatButton btnDot;
    androidx.appcompat.widget.AppCompatButton btn0;
    androidx.appcompat.widget.AppCompatButton btn1;
    androidx.appcompat.widget.AppCompatButton btn2;
    androidx.appcompat.widget.AppCompatButton btn3;
    androidx.appcompat.widget.AppCompatButton btn4;
    androidx.appcompat.widget.AppCompatButton btn5;
    androidx.appcompat.widget.AppCompatButton btn6;
    androidx.appcompat.widget.AppCompatButton btn7;
    androidx.appcompat.widget.AppCompatButton btn8;
    androidx.appcompat.widget.AppCompatButton btn9;

    androidx.appcompat.widget.AppCompatButton btnAddition;
    androidx.appcompat.widget.AppCompatButton btnSubtraction;
    androidx.appcompat.widget.AppCompatButton btnMultiplication;
    androidx.appcompat.widget.AppCompatButton btnDivision;
    androidx.appcompat.widget.AppCompatButton btnClear;
    androidx.appcompat.widget.AppCompatButton btnResult;
    androidx.appcompat.widget.AppCompatButton btnNegative;
    androidx.appcompat.widget.AppCompatButton btnPercents;

    TextView txt;

    TextView txtHint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnDot = findViewById(R.id.dot);
        btn0 = findViewById(R.id.zero);
        btn1= findViewById(R.id.one);
        btn2 = findViewById(R.id.two);
        btn3 = findViewById(R.id.three);
        btn4 = findViewById(R.id.four);
        btn5 = findViewById(R.id.five);
        btn6 = findViewById(R.id.six);
        btn7 = findViewById(R.id.seven);
        btn8 = findViewById(R.id.eight);
        btn9 = findViewById(R.id.nine);
        btnAddition = findViewById(R.id.add);
        btnSubtraction = findViewById(R.id.subtraction);
        btnMultiplication = findViewById(R.id.multiplication);
        btnDivision = findViewById(R.id.division);
        btnClear = findViewById(R.id.clear_text);
        btnResult = findViewById(R.id.result);
        btnNegative = findViewById(R.id.negative);
        btnPercents = findViewById(R.id.percent);
        txt = findViewById(R.id.calc_input);
        txtHint = findViewById(R.id.calc_hint);

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtHint.getText().toString().contains("Result")){
                    txtHint.setText("");
                }
                String currentText = txt.getText().toString();
                if (!currentText.contains(".")) {
                    txt.setText(currentText + ".");
                }
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtHint.getText().toString().contains("Result")){
                    txtHint.setText("");
                }
                txt.setText(txt.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtHint.getText().toString().contains("Result")){
                    txtHint.setText("");
                }
                txt.setText(txt.getText() + "1");
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtHint.getText().toString().contains("Result")){
                    txtHint.setText("");
                }
                txt.setText(txt.getText() + "2");
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtHint.getText().toString().contains("Result")){
                    txtHint.setText("");
                }
                txt.setText(txt.getText() + "3");
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtHint.getText().toString().contains("Result")){
                    txtHint.setText("");
                }
                txt.setText(txt.getText() + "4");
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtHint.getText().toString().contains("Result")){
                    txtHint.setText("");
                }
                txt.setText(txt.getText() + "5");
            }
        });



        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtHint.getText().toString().contains("Result")){
                    txtHint.setText("");
                }
                txt.setText(txt.getText() + "6");
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtHint.getText().toString().contains("Result")){
                    txtHint.setText("");
                }
                txt.setText(txt.getText() + "7");
            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtHint.getText().toString().contains("Result")){
                    txtHint.setText("");
                }
                txt.setText(txt.getText() + "8");
            }
        });


        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtHint.getText().toString().contains("Result")){
                    txtHint.setText("");
                }
                txt.setText(txt.getText() + "9");
            }
        });


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtHint.getText().toString().contains("Result")){
                    txtHint.setText("");
                }
                txt.setText("");
            }
        });

        btnNegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtHint.getText().toString().contains("Result")){
                    txtHint.setText("");
                }
                String currentText = txt.getText().toString();
                if (!currentText.contains("-"))
                    txt.setText("-" + txt.getText());
                else
                    txt.setText(currentText.replaceFirst("-", ""));

            }
        });

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtHint.getText().toString().contains("Result")){
                    txtHint.setText("");
                }
                if(txtHint.getText().length() > 0 && txt.getText().length() > 0)
                    txtHint.setText(txtHint.getText() + "" + txt.getText() + " + ");
                else if(txt.getText().length() > 0)
                    txtHint.setText(txt.getText() + " + " + txtHint.getText());
                txt.setText("");
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtHint.getText().toString().contains("Result")){
                    txtHint.setText("");
                }
                if(txtHint.getText().length() > 0 && txt.getText().length() > 0)
                    txtHint.setText(txtHint.getText() + "" + txt.getText() + " / ");
                else if(txt.getText().length() > 0)
                    txtHint.setText(txt.getText() + " / " + txtHint.getText());
                txt.setText("");
            }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtHint.getText().toString().contains("Result")){
                    txtHint.setText("");
                }
                if(txtHint.getText().length() > 0 && txt.getText().length() > 0)
                    txtHint.setText(txtHint.getText() + "" + txt.getText() + " - ");
                else if(txt.getText().length() > 0)
                    txtHint.setText(txt.getText() + " - " + txtHint.getText());
                txt.setText("");
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtHint.getText().toString().contains("Result")){
                    txtHint.setText("");
                }
                if(txtHint.getText().length() > 0 && txt.getText().length() > 0)
                    txtHint.setText(txtHint.getText() + "" + txt.getText() + " x ");
                else if(txt.getText().length() > 0)
                    txtHint.setText(txt.getText() + " x " + txtHint.getText());
                txt.setText("");
            }
        });

        btnPercents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtHint.getText().toString().contains("Result")){
                    txtHint.setText("");
                }
                if(txtHint.getText().length() > 0 && txt.getText().length() > 0)
                    txtHint.setText(txtHint.getText() + "" + txt.getText() + " % ");
                else if(txt.getText().length() > 0)
                    txtHint.setText(txt.getText() + " % " + txtHint.getText());
                txt.setText("");
            }
        });


        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(txtHint.getText().toString().contains("Result")){
                        txtHint.setText("");
                    }
                    String str = txtHint.getText().toString() +  txt.getText().toString();
                    str = str.replace("x", "*");

                    String expressionStr = str;
                    Expression expression = new ExpressionBuilder(expressionStr).build();
                    double result = expression.evaluate();

                    txtHint.setText("Result = " + result);
                    txt.setText("");
                }
                catch (Exception ex)
                {
                    txt.setText("");
                    txtHint.setText("");
                }




            }
        });

        if(getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}