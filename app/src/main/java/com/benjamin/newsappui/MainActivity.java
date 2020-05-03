package com.benjamin.newsappui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<NewsData> newsData = new ArrayList<>();
        newsData.add(new NewsData("Trump encourages healthy living admist novel covid-19 pademic",
                "4th May, 2020", R.drawable.trump));
        newsData.add(new NewsData("ACCESS denies closing branches", "4th May, 2020",
                R.drawable.access));
        newsData.add(new NewsData("COVID-19: Bright light at the end of the tunnel",
                "4th May, 2020", R.drawable.covid));
        newsData.add(new NewsData("Chikwe declears intention for 2023", "3rd May, 2020",
                R.drawable.chikwe));
        newsData.add(new NewsData("Local government donates relief materials", "3rd May, 2020",
                R.drawable.rice));
        newsData.add(new NewsData("13 year old boy solves legendary math problem", "3rd May, 2020",
                R.drawable.boy));
        newsData.add(new NewsData("Trump encourages healthy living admist novel covid-19 pademic",
                "4th May, 2020", R.drawable.trump));
        newsData.add(new NewsData("ACCESS denies closing branches", "4th May, 2020",
                R.drawable.access));
        newsData.add(new NewsData("COVID-19: Bright light at the end of the tunnel",
                "4th May, 2020", R.drawable.covid));
        newsData.add(new NewsData("Chikwe declears intention for 2023", "3rd May, 2020",
                R.drawable.chikwe));
        newsData.add(new NewsData("Local government donates relief materials", "3rd May, 2020",
                R.drawable.rice));
        newsData.add(new NewsData("13 year old boy solves legendary math problem", "3rd May, 2020",
                R.drawable.boy));


        ListView listView = findViewById(R.id.list_item);
        NewsAdapter adapter = new NewsAdapter(this, 0, newsData);
        listView.setAdapter(adapter);


    }
}
