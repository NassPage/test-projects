package com.nasserkh.testproject1.Adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.nasserkh.testproject1.View.Fragment.ClotheFragment;

public class ClotheViewPagerAdapter extends FragmentPagerAdapter {
    public ClotheViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return ClotheFragment.newInstance();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case (0):
                return "مشاهده شده ها";
            case (1):
                return "پر بازدیدترین ها";
            case (2):
                return "جدیدترین ها";
            default:
                return "";
        }
    }
}
