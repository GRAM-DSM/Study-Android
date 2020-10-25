package com.example.projecthensel;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ImageButton ImageButton;
    DateAdapter adapter = new DateAdapter();
    String month, date, bool, dataString; // Adding 페이지에서 받아오는 값을 저장
    String memo,address, startHour, startMin, endHour, endMin; // Detail 페이지로 넘길 값을 저장
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int code = 1001; //add Route 수신코드
        ImageButton = findViewById(R.id.editImageButton);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Intent intent = getIntent();
        Intent intent3 = new Intent(MainActivity.this, DetailRouteActivity.class);

        if(intent.hasExtra("bool"))
       {
            bool = intent.getExtras().getString("bool");
            //add Route 페이지에서 데이터 받아오기
            month = intent.getExtras().getString("month");
            date = intent.getExtras().getString("date");
            dataString = month + "월 " + date + "일";
            count = intent.getExtras().getInt("count");

           recyclerView.setAdapter(adapter);
           adapter.addItem(new Data(dataString, count));
        }

        ImageButton.setOnClickListener(new View.OnClickListener(){     //add Route 페이지로 이동
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, RouteAddingActivity.class);
                startActivityForResult(intent2, code);
            }
        });
    }
}