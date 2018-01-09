package com.example.aaswin.homeactivity.Profile;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.example.aaswin.homeactivity.R;
import com.example.aaswin.homeactivity.Utils.SectionPagerAdapter;
import com.example.aaswin.homeactivity.Utils.SectionStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by aaswin on 23/12/17.
 */

public class AccountSettingsActivity extends AppCompatActivity {
    private SectionStatePagerAdapter pagerAdapter;
    private RelativeLayout mRelativeLayout;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accountsettings);
        mRelativeLayout=(RelativeLayout)findViewById(R.id.relLayout1);
        mViewPager=(ViewPager)findViewById(R.id.container);
        setupFragments();
        setupSettingsList();
        //setup the on click listener for navigating back to profile activity
        ImageView backArrow=(ImageView)findViewById(R.id.backArrow);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AccountSettingsActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
    private void setupFragments()
    {
        pagerAdapter=new SectionStatePagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new EditProfileFragment(),getString(R.string.edit_profile));//fragment No 0
        pagerAdapter.addFragment(new SignOutFragment(),getString(R.string.Sign_out));//fragment No 1


    }
    private void setupViewPager(int fragmentNo)
    {
        mRelativeLayout.setVisibility(View.GONE);
        mViewPager.setAdapter(pagerAdapter);
        mViewPager.setCurrentItem(fragmentNo);
    }
    private void setupSettingsList()
    {
        ListView listView=(ListView)findViewById(R.id.lvAccountSettings);
        ArrayList<String> options=new ArrayList<>();
        options.add(getString(R.string.edit_profile));
        options.add(getString(R.string.Sign_out));

        ArrayAdapter arrayAdapter=new ArrayAdapter(AccountSettingsActivity.this,android.R.layout.simple_list_item_1,options);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                setupViewPager(position);
            }
        });




    }
}
