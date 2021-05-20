package com.example.zalo.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zalo.R;
import com.example.zalo.fragmentContact.FragmentTabAdapter;
import com.google.android.material.tabs.TabLayout;


public class FragmentContact extends Fragment {

    private View v;
    private TabLayout tab;
    private ViewPager viewPager;
    private FragmentTabAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment_contact, container, false);
        tab = v.findViewById(R.id.tab);
        viewPager = v.findViewById(R.id.viewPager);

        adapter = new FragmentTabAdapter(getChildFragmentManager(),
                FragmentTabAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        tab.setupWithViewPager(viewPager);
        return v;
    }
}