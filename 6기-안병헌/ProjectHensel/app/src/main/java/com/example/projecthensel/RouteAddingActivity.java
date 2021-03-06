package com.example.projecthensel;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RouteAddingActivity extends AppCompatActivity {

    Button returnButton, addButton;
    TextView countText;
    EditText addressEdit, yearEdit, monthEdit, dateEdit, hourStartEdit, minStartEdit, hourEndEdit, minEndEdit, memoEdit, et;
    DateAdapter adapter;
    String month, date, memo,address, startHour, startMin, endHour, endMin;
    InputMethodManager imm;
    ConstraintLayout mainLayout;
    int count = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.route_adding_page);
        final int code2 = 1002;
        returnButton = (Button) findViewById(R.id.addToAllButton);
        addButton = (Button) findViewById(R.id.addButton);
        countText = (TextView)findViewById(R.id.countText);
        addressEdit = (EditText) findViewById(R.id.addressEdit);
        yearEdit = (EditText)findViewById(R.id.yearEdit);
        monthEdit = (EditText)findViewById(R.id.monthEdit);
        dateEdit = (EditText)findViewById(R.id.dateEdit);
        hourStartEdit = (EditText)findViewById(R.id.hourStartEdit);
        minStartEdit = (EditText)findViewById(R.id.minStartEdit);
        hourEndEdit = (EditText)findViewById(R.id.hourEndEdit);
        minEndEdit = (EditText)findViewById(R.id.minEndEdit);
        memoEdit = (EditText)findViewById(R.id.memoEdit);

        //adapter = new DateAdapter();
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);

        mainLayout = (ConstraintLayout)findViewById(R.id.constraint);
        mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(addressEdit.getWindowToken(), 0);
            }
        });



        returnButton.setOnClickListener(new View.OnClickListener() { // All Route 페이지로 이동하는 인텐트
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivityForResult(intent, code2);
            }
        });
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("경로를 추가하시겠습니까?");
                builder.setCancelable(false);
                builder.setPositiveButton("추가", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        month = monthEdit.getText().toString();
                        date = dateEdit.getText().toString();
                        address = addressEdit.getText().toString();
                        startHour = hourStartEdit.getText().toString();
                        startMin = minStartEdit.getText().toString();
                        endHour = hourEndEdit.getText().toString();
                        endMin = minEndEdit.getText().toString();
                        memo = memoEdit.getText().toString();
//                        if(month == "" || date == "" || address == "" || startHour == "" ||
//                                startMin == "" || endHour == "" || endMin == "" || memo == "" ){
//                            Toast toast = Toast.makeText(getApplicationContext(), "빈칸을 채워주세요", Toast.LENGTH_SHORT);
//                            toast.show();
//                        }
                        //else {
                            count += 1;
                            Intent intent = new Intent(RouteAddingActivity.this, MainActivity.class);
                            insertData(intent);
                            startActivity(intent);

                            initData();
                            finish();
                        //}
                    }
                });
                builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
    public void insertData(Intent intent){
        intent.putExtra("bool", "1");
        intent.putExtra("month", month);
        intent.putExtra("date", date);
        intent.putExtra("address", address);
        intent.putExtra("startHour", startHour);
        intent.putExtra("startMin", startMin);
        intent.putExtra("endHour", endHour);
        intent.putExtra("endMin", endMin);
        intent.putExtra("memo", memo);
        intent.putExtra("count", count);
    }

    public void initData(){
        monthEdit.setText("");
        dateEdit.setText("");
        memoEdit.setText("");
        hourStartEdit.setText("");
        minStartEdit.setText("");
        hourEndEdit.setText("");
        minEndEdit.setText("");
        addressEdit.setText("");
    }
}
