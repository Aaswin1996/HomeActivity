package com.example.aaswin.homeactivity.Home;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.aaswin.homeactivity.R;
import com.example.aaswin.homeactivity.Utils.BottomNavigationViewHelper;
import com.example.aaswin.homeactivity.Utils.SectionPagerAdapter;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class HomeActivity extends AppCompatActivity {
    private static final int Activity_num=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toast.makeText(this,"Oncreate starts",Toast.LENGTH_SHORT).show();
        setupBottomNavigationView();
        setupFragments();
    }
    //method to create all the functionalities related to the tabs
    private void setupFragments()
    {
        SectionPagerAdapter adapter=new SectionPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new CameraFragment());//index 0
        adapter.addFragment(new HomeFragment());//index 1
        adapter.addFragment(new MessageFragment());//index 2
        ViewPager viewpager=(ViewPager)findViewById(R.id.container);
        viewpager.setAdapter(adapter);

        TabLayout tabs=(TabLayout)findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewpager);
        tabs.getTabAt(0).setIcon(R.drawable.ic_acamera_alert);
        tabs.getTabAt(1).setIcon(R.drawable.ic_insta_icon);
        tabs.getTabAt(2).setIcon(R.drawable.ic_message_icon);





    }

    private void setupBottomNavigationView(){
        Toast.makeText(this,"setupBottomNavigationView starts",Toast.LENGTH_SHORT).show();
        BottomNavigationViewEx bottom=(BottomNavigationViewEx)findViewById(R.id.bottomnavview_tab);
        BottomNavigationViewHelper.setupNavView(bottom);
        BottomNavigationViewHelper.enableNavigation(HomeActivity.this,bottom);
        Menu menu=bottom.getMenu();
        MenuItem menuitem=menu.getItem(Activity_num);
    }

}
