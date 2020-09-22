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
    int num1 = 0, num2 = 0;
    char delimiter;
    TextView text;
    EditText edit;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView)findViewById((R.id.ResultTextView));
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
                    if(num1 == 0){
                        num1 = 1;
                    }
                    else if(num2 == 0){
                        num2 = 1;
                    }
                }
                else if(v == TwoButton) {
                    if(num1 == 0){
                        num1 = 2;
                    }
                    else if(num2 == 0){
                        num2 = 2;
                    }
                }
                else if(v == ThreeButton){
                    if(num1 == 0){
                        num1 = 3;
                    }
                    else if(num2 == 0){
                        num2 = 3;
                    }
                }
                else if(v == FourButton){
                    if(num1 == 0){
                        num1 = 4;
                    }
                    else if(num2 == 0){
                        num2 = 4;
                    }
                }
                else if(v == FiveButton){
                    if(num1 == 0){
                        num1 = 5;
                    }
                    else if(num2 == 0){
                        num2 = 5;
                    }
                }
                else if(v == SixButton){
                    if(num1 == 0){
                        num1 = 6;
                    }
                    else if(num2 == 0){
                        num2 = 6;
                    }
                }
                else if(v == SevenButton){
                    if(num1 == 0){
                        num1 = 7;
                    }
                    else if(num2 == 0){
                        num2 = 7;
                    }
                }
                else if(v == EightButton){
                    if(num1 == 0){
                        num1 = 8;
                    }
                    else if(num2 == 0){
                        num2 = 8;
                    }
                }
                else if(v == NineButton){
                    if(num1 == 0){
                        num1 = 9;
                    }
                    else if(num2 == 0){
                        num2 = 9;
                    }
                }
                else if(v == ZeroButton){
                    if(num1 == 0){
                        num1 = 0;
                    }
                    else if(num2 == 0){
                        num2 = 0;
                    }
                }

                else if(v == PlusButton){
                    delimiter = '+';
                    position = 1;
                }
                else if(v == MinusButton){
                    delimiter = '-';
                    position = 2;
                }
                else if(v == MultiplyButton){
                    delimiter = '*';
                    position = 3;
                }
                else if(v == DivideButton){
                    delimiter = '/';
                    position = 4;
                }
                else if(v == ClearButton){
                    text.setText(" ");
                }
                else if(v == EqualButton){
                    if(position == 1){
                        text.setText(text.getText().toString() + (num1 + num2));
                        num1 = 0;
                        num2 = 0;
                        position = 0;
                    }
                    else if(position == 2){
                        text.setText(text.getText().toString() + (num1 - num2));
                        num1 = 0;
                        num2 = 0;
                        position = 0;
                    }
                    else if(position == 3){
                        text.setText(text.getText().toString() + (num1 * num2));
                        num1 = 0;
                        num2 = 0;
                        position = 0;
                    }
                    else if(position == 4){
                        text.setText(text.getText().toString() + (num1 / num2));
                        num1 = 0;
                        num2 = 0;
                        position = 0;
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
    }
}