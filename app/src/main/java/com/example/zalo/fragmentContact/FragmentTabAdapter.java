package com.example.zalo.fragmentContact;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FragmentTabAdapter extends FragmentStatePagerAdapter {

    private int numPage = 2;
    public FragmentTabAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new FragmentContacts();
            case 1:return new FragmentAccount();
            default: return new FragmentContacts();
        }
    }

    @Override
    public int getCount() {
        return numPage;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "Contacts";
            case 1: return "Official Account";
            default: return "Contacts";
        }
    }
}
