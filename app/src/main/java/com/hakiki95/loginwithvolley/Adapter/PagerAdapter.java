package com.hakiki95.loginwithvolley.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.hakiki95.loginwithvolley.Fragment.DataList;
import com.hakiki95.loginwithvolley.Fragment.Login;
import com.hakiki95.loginwithvolley.Fragment.Signup;

/**
 * Created by H A K I K I on 12/06/2016.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {


    public PagerAdapter (FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment mFragment = null ;

        switch (position){
            case 0:
                mFragment = new Login();
                break;
            case 1:
                mFragment = new Signup();
                break;
            case 2:
                mFragment = new DataList();
                break;
        }

        return mFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String mTitle = "";

        switch (position){
            case 0 :
                mTitle = "Login";
                break;
            case 1 :
                mTitle = "SignUp";
                break;
            case 2 :
                mTitle = "Data";
                break;
        }

        return mTitle;
    }
}
