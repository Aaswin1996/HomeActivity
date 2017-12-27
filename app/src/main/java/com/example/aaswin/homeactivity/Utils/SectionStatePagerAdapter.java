package com.example.aaswin.homeactivity.Utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by aaswin on 24/12/17.
 */

public class SectionStatePagerAdapter extends FragmentStatePagerAdapter {
    private final List<Fragment> mFragmentList=new ArrayList<>();
    //if we have got the fragment then we get the fragment Number
    private final HashMap<Fragment,Integer> mFragment=new HashMap<>();
    //if we have got the fragment name  then we get the fragment Number
    private final HashMap<String,Integer> mFragmentNumber=new HashMap<>();
    //if we have got the fragment number then we get the fragment Name
    private final HashMap<Integer,String> mFragmentNames=new HashMap<>();
    public SectionStatePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }
    public void addFragment(Fragment fragment,String fragmentName)
    {
        mFragmentList.add(fragment);
        mFragment.put(fragment,mFragmentList.size()-1);
        mFragmentNumber.put(fragmentName,mFragmentList.size()-1);
        mFragmentNames.put(mFragmentList.size()-1,fragmentName);
    }
    /**
     * returns the fragment with name@param
     * @param fragmentName
     */
    public Integer getFragmentNumber(String fragmentName)
    {
        if(mFragmentNumber.containsKey(fragmentName))
        {
           return mFragmentNumber.get(fragmentName);
        }
        else
        {
            return null;
        }
    }
    /**
     * returns the fragment with name@param
     * @param fragment
     */
    public Integer getFragment(Fragment fragment){
        if(mFragmentNumber.containsKey(fragment))
        {
            return mFragmentNumber.get(fragment);
        }
        else{
            return null;
        }
    }
    
}

