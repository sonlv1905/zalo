package com.example.zalo.fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FragmentBottomAdapter extends FragmentStatePagerAdapter {

    private int numPage = 4;

    public FragmentBottomAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new FragmentMessage();
            case 1: return new FragmentContact();
            case 2: return new FragmentTimeline();
            case 3: return new FragmentMore();
            default: return new FragmentMessage();

        }
    }

    @Override
    public int getCount() {
        return numPage;
    }
}
