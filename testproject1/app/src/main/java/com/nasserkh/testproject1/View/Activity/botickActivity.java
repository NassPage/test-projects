package com.nasserkh.testproject1.View.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;
import com.nasserkh.testproject1.Adapter.ClotheViewPagerAdapter;
import com.nasserkh.testproject1.R;

public class botickActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botick);
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager viewPager = findViewById(R.id.viewPager);
        ClotheViewPagerAdapter clotheViewPagerAdapter =
                new ClotheViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(clotheViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);


    }
}
