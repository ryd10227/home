package com.example.homesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class InfoActivity extends AppCompatActivity {
    private SimpleAdapter mSAdapter;
    private TextView txtName;
    private int mISelectedItem = -1;    //인덱스 값 저장, 현재 선택된 항목 없음

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        txtName = findViewById(R.id.textName);
        ImageButton btnBack;
        btnBack = findViewById(R.id.buttonBack);
        btnBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Intent intent = getIntent();
        if(intent != null) {
            mISelectedItem = intent.getIntExtra("item", -1);
            if(mISelectedItem != -1) {
                txtName.setText(intent.getStringExtra("name"));
            }
        }

    }
}