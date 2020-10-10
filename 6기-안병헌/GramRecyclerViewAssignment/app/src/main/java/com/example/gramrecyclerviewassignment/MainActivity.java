package com.example.gramrecyclerviewassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ModelAdapter adapter;
    Button button;
    EditText editText1, editText2, editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        button  = findViewById(R.id.addButton);
        adapter = new ModelAdapter();

         editText1 = findViewById(R.id.inputNameEditText);
         editText2 = findViewById(R.id.inputYearEditText);
         editText3 = findViewById(R.id.inputMobileEditText);

         recyclerView.setLayoutManager(new LinearLayoutManager(this));

         button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.addItem(new Model(editText1.getText().toString(),
                        editText1.getText().toString(), editText3.getText().toString()));
                recyclerView.setAdapter(adapter);

                editText1.setText("");
                editText2.setText("");
                editText3.setText("");
            }

        });
    }
}