package com.example.MyUnderline;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

public class MyUnderlineActivity extends FragmentActivity {
    static com.example.MyUnderline.UnderlinePageIndicator mIndicator = null;
    TestFragmentAdapter mAdapter;
    ViewPager mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //The look of this sample is set via a style in the manifest
        setContentView(R.layout.simple_underlines);
        Button nearby = (Button) findViewById(R.id.nearby);
        Button contacts = (Button) findViewById(R.id.contacts);
        nearby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mIndicator.setCurrentItem(0);

            }
        });
        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mIndicator.setCurrentItem(1);
            }
        });
        mAdapter = new TestFragmentAdapter(getSupportFragmentManager());

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        mIndicator = (com.example.MyUnderline.UnderlinePageIndicator) findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);

    }
}