package com.nasserkh.testproject1.View.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;
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
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2, RecyclerView.VERTICAL, false));
//        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
//        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(newsAdapter);
        setupToolbar();
    }

    private void setupToolbar(){
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar); //نمایش نام صفحه از مانیفست
        toolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.White ));
        DrawerLayout drawerLayout = findViewById(R.id.navigationDrawer);
//        NavigationView navigationView = findViewById(R.id.navigationView);

        ActionBar actionBar = getSupportActionBar(); //نمایش علامت دراور لایوات
        actionBar.setDisplayHomeAsUpEnabled(true); // نشان دادن ایکون دارور تاگل بصورت همبرگر در صفحه اصلی
        actionBar.setHomeButtonEnabled(true);

        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, 0, 0);
        drawerToggle.syncState(); //سینک استیت با دراور لایوت

        drawerLayout.addDrawerListener(drawerToggle); //نمایش انیمیشن morphing icon
    }
}