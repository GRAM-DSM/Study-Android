package com.example.projecthensel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ImageButton ImageButton;
    DateAdapter adapter;
    String month, date, bool, dataString;
    int count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int code = 1001; //add Route 수신코드
        ImageButton = (ImageButton)findViewById(R.id.editImageButton);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        adapter = new DateAdapter();
        recyclerView.setAdapter(adapter);

        Intent intent = getIntent();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        bool = intent.getStringExtra("bool");

        if("1".equals(bool)){
            month = intent.getStringExtra("month");
            date = intent.getStringExtra("date");
            dataString = (month + "월 " + date + "일");

            adapter.addItem(new Data(dataString, count));
            adapter.notifyDataSetChanged();
        }

        ImageButton.setOnClickListener(new View.OnClickListener(){     //add Route 페이지로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RouteAddingActivity.class);
                startActivityForResult(intent, code);
            }
        });
    }


}