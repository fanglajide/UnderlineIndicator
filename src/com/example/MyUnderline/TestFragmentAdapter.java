package com.example.MyUnderline;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.example.*;

class TestFragmentAdapter extends FragmentPagerAdapter     {
    protected static final String[] CONTENT = new String[] { "周边", "组织" };


    private int mCount = CONTENT.length;

    public TestFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return TestFragment.newInstance(CONTENT[position % CONTENT.length]);
    }

    @Override
    public int getCount() {
        return mCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TestFragmentAdapter.CONTENT[position % CONTENT.length];
    }




    public void setCount(int count) {
        if (count > 0 && count <= 10) {
            mCount = count;
            notifyDataSetChanged();
        }
    }
}