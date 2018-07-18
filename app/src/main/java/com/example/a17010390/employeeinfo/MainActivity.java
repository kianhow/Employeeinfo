package com.example.a17010390.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvInfo;
    ArrayList<Information> alInformation;
    CustomAdapter caInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvInfo = findViewById(R.id.lvInfo);
        alInformation = new ArrayList<>();
        Information item1 = new Information("Johnny", "Business", 3400);

        alInformation.add(item1);

        caInfo = new CustomAdapter(this, R.layout.movie_item, alInformation);
        lvInfo.setAdapter(caInfo);
    }
}
