package com.example.gramacc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    int num1 = 0, num2 = 0, position;
    String box1 = "", box2 = "";
    TextView result_TextView;

    public void insertNumber(int number) {
        if(num1 == 0 || position == 0){
            box1 += Integer.toString(number);
        }
        else if(num1 != 0 || position != 0){
            box2 += Integer.toString(number);
        }
        else {
            num1 = Integer.parseInt(box1);
            num2 = Integer.parseInt(box2);
            }
        }


    public void resetVariable(){
        num1 = 0;
        num2 = 0;
        position = 0;
    }
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result_TextView = (TextView)findViewById((R.id.ResultTextView));
        final Button OneButton = (Button)findViewById(R.id.OneButton);
        final Button TwoButton = (Button)findViewById(R.id.TwoButton);
        final Button ThreeButton = (Button)findViewById(R.id.ThreeButton);
        final Button FourButton = (Button)findViewById(R.id.FourButton);
        final Button FiveButton = (Button)findViewById(R.id.FiveButton);
        final Button SixButton = (Button)findViewById(R.id.SixButton);
        final Button SevenButton = (Button)findViewById(R.id.SevenButton);
        final Button EightButton = (Button)findViewById(R.id.EightButton);
        final Button NineButton = (Button)findViewById(R.id.NineButton);
        final Button ZeroButton = (Button)findViewById(R.id.ZeroButton);
        final Button EqualButton = (Button)findViewById(R.id.EqualButton);
        final Button PlusButton = (Button)findViewById(R.id.PlusButton);
        final Button MinusButton = (Button)findViewById(R.id.MinusButton);
        final Button MultiplyButton = (Button)findViewById(R.id.MultiplyButton);
        final Button DivideButton = (Button)findViewById(R.id.DivideButton);
        final Button ClearButton = (Button)findViewById(R.id.ClearButton);

        OnClickListener cl = new OnClickListener(){
            @Override
            public void onClick(View v) {
                if(v == OneButton){
                    insertNumber(1);
                }
                else if(v == TwoButton) {
                    insertNumber(2);
                }
                else if(v == ThreeButton){
                    insertNumber(3);
                }
                else if(v == FourButton){
                    insertNumber(4);
                }
                else if(v == FiveButton){
                    insertNumber(5);
                }
                else if(v == SixButton){
                    insertNumber(6);
                }
                else if(v == SevenButton){
                    insertNumber(7);
                }
                else if(v == EightButton){
                    insertNumber(8);
                }
                else if(v == NineButton){
                    insertNumber(9);
                }
                else if(v == ZeroButton){
                    insertNumber(0);
                }

                else if(v == PlusButton){
                    position = 1;
                }
                else if(v == MinusButton){
                    position = 2;
                }
                else if(v == MultiplyButton){
                    position = 3;
                }
                else if(v == DivideButton){
                    position = 4;
                }
                else if(v == ClearButton){
                    result_TextView.setText(" ");
                    resetVariable();

                }
                else if(v == EqualButton){
                    if(position == 1){
                        result_TextView.setText(result_TextView.getText().toString() + (num1 + num2));
                    }
                    else if(position == 2){
                        result_TextView.setText(result_TextView.getText().toString() + (num1 - num2));
                    }
                    else if(position == 3){
                        result_TextView.setText(result_TextView.getText().toString() + (num1 * num2));
                    }
                    else if(position == 4){
                        result_TextView.setText(result_TextView.getText().toString() + (num1 / num2));
                    }
                }
            }
        };
        OneButton.setOnClickListener(cl);
        TwoButton.setOnClickListener(cl);
        ThreeButton.setOnClickListener(cl);
        FourButton.setOnClickListener(cl);
        FiveButton.setOnClickListener(cl);
        SixButton.setOnClickListener(cl);
        SevenButton.setOnClickListener(cl);
        EightButton.setOnClickListener(cl);
        NineButton.setOnClickListener(cl);
        ZeroButton.setOnClickListener(cl);
        PlusButton.setOnClickListener(cl);
        MinusButton.setOnClickListener(cl);
        MultiplyButton.setOnClickListener(cl);
        DivideButton.setOnClickListener(cl);
        EqualButton.setOnClickListener(cl);
        ClearButton.setOnClickListener(cl);
    }
}