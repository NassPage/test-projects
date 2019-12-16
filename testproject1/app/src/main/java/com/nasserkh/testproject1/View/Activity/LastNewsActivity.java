package com.nasserkh.testproject1.View.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nasserkh.testproject1.FakeDataGenerator;
import com.nasserkh.testproject1.Adapter.NewsAdapter;
import com.nasserkh.testproject1.R;

public class LastNewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_news);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        NewsAdapter newsAdapter = new NewsAdapter(this, FakeDataGenerator.getData(this));
//        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2, RecyclerView.HORIZONTAL, false));
//        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
//        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(newsAdapter);
    }
}