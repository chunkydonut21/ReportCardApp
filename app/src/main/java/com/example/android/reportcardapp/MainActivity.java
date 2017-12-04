package com.example.android.reportcardapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ReportCard> grade = new ArrayList<ReportCard>();

        grade.add(new ReportCard("Mathematics", 76));
        grade.add(new ReportCard("Computer Science", 67));
        grade.add(new ReportCard("Physics", 81));
        grade.add(new ReportCard("Chemistry", 77));
        grade.add(new ReportCard("Environmental Science", 68));


        ReportAdapter adapter = new ReportAdapter(this, grade);

        ListView listView = (ListView) findViewById(R.id.activity_main);

        listView.setAdapter(adapter);

    }

}
