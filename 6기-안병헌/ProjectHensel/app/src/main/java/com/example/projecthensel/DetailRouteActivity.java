package com.example.projecthensel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DetailRouteActivity extends AppCompatActivity {

    Button returnButton;
    RecyclerView detailRecyclerView;
    DetailAdapter adapter;
    //TextView addressText, startTimeText, endTimeText, memoText2;
    String address, start, end, memo, startHour, startMin, endHour, endMin;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_route_page);
        returnButton = (Button)findViewById(R.id.detailToAllButton);
        detailRecyclerView = (RecyclerView)findViewById(R.id.detailRecyclerView);
//        addressText = (TextView)findViewById(R.id.addressText);
//        startTimeText = (TextView)findViewById(R.id.startTime);
//        endTimeText = (TextView)findViewById(R.id.endTime);
//        memoText2 = (TextView)findViewById(R.id.memoText2);


        adapter = new DetailAdapter();
        detailRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        Intent intent = getIntent();
        //if("1".equals(intent2.getStringExtra("bool"))){
            detailRecyclerView.setAdapter(adapter);
            address = intent.getStringExtra("address");
            startHour = intent.getStringExtra("startHour");
            startMin = intent.getStringExtra("startMin");
            endHour = intent.getStringExtra("endHour");
            endMin = intent.getStringExtra("endMin");
            memo = intent.getStringExtra("memo");

            start = startHour + ":" + startMin + " AM";
            end = endHour + ":" + endMin + " PM";

            adapter.addItem(new Data2(address, start, end, memo));

        //}
        returnButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(DetailRouteActivity.this, MainActivity.class);
                startActivity(intent2);
            }
        });
    }
}
