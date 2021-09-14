package com.example.tugas9_gits;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugas9_gits.Adapter.HomeAdapter;
import com.example.tugas9_gits.Models.HomeDataModel;
import com.example.tugas9_gits.Models.HomeModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btnHome;
    private RecyclerView rv;
    private HomeAdapter homeAdapter;
    private List<HomeModel> homeModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();



        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondActivity();
                finish();
            }
        });

    }

    private void openSecondActivity() {
        Intent intent = new Intent(this, HomeActivity
                .class);
        startActivity(intent);

    }

    private void initView() {
        btnHome = findViewById(R.id.btn_home);
    }

}