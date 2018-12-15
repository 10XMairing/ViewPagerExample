package com.androidpopcorn.tenx.viewpagerexample;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

        ViewPager pager;
        CustomPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new CustomPagerAdapter(this);

        pager = findViewById(R.id.pager);

        pager.setAdapter(adapter);

    }
}
