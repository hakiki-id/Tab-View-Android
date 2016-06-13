package com.hakiki95.loginwithvolley;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hakiki95.loginwithvolley.Adapter.PagerAdapter;

public class MainActivity extends AppCompatActivity {
    TabLayout mTabLayout ;
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mViewPager = (ViewPager) findViewById(R.id.view_pager);

        FragmentManager mFragmentManager = getSupportFragmentManager();

        PagerAdapter mPagerAdapter = new PagerAdapter(mFragmentManager);

        mViewPager.setAdapter(mPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));


        mTabLayout.setTabsFromPagerAdapter(mPagerAdapter);
    }
}
