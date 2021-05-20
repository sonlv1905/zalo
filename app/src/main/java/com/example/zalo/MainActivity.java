package com.example.zalo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.zalo.fragment.FragmentBottomAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView navigation;
    private ViewPager viewPager;
    private FragmentBottomAdapter adapter;
    private FloatingActionButton bt;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.iGroup:
                viewPager.setCurrentItem(0);
                break;
            case R.id.iFriend:
                viewPager.setCurrentItem(1);
                break;
            case R.id.iCode:
                viewPager.setCurrentItem(2);
                break;
            case R.id.iCalendar:
                viewPager.setCurrentItem(3);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        adapter = new FragmentBottomAdapter(getSupportFragmentManager(),
                FragmentBottomAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "Da chon", Toast.LENGTH_LONG).show();
            }
        });

        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.mMessage: viewPager.setCurrentItem(0);
                        break;
                    case R.id.mContact: viewPager.setCurrentItem(1);
                        break;
                    case R.id.mTimeline: viewPager.setCurrentItem(2);
                        break;
                    case R.id.mMore: viewPager.setCurrentItem(3);
                        break;
                }
                return true;
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0: navigation.getMenu().findItem(R.id.mMessage).setChecked(true);
                        break;
                    case 1: navigation.getMenu().findItem(R.id.mContact).setChecked(true);
                        break;
                    case 2: navigation.getMenu().findItem(R.id.mTimeline).setChecked(true);
                        break;
                    case 3: navigation.getMenu().findItem(R.id.mMore).setChecked(true);
                        break;

                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initView() {
        bt = findViewById(R.id.fab);
        viewPager = findViewById(R.id.viewPager);
        navigation = findViewById(R.id.navigation);

    }
}