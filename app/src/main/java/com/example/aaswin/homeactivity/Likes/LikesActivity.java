package com.example.aaswin.homeactivity.Likes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.aaswin.homeactivity.R;
import com.example.aaswin.homeactivity.Utils.BottomNavigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class LikesActivity extends AppCompatActivity {
    private static final String Tag= "LikesActivity";
    private static final int Activity_num=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toast.makeText(this,"LikesActivity Starts",Toast.LENGTH_SHORT).show();
        setupBottomNavigationView();
    }
    private void setupBottomNavigationView(){
        Toast.makeText(this,"setupBottomNavigationView starts",Toast.LENGTH_SHORT).show();
        BottomNavigationViewEx bottom=(BottomNavigationViewEx)findViewById(R.id.bottomnavview_tab);
        BottomNavigationViewHelper.setupNavView(bottom);
        BottomNavigationViewHelper.enableNavigation(LikesActivity.this,bottom);
        Menu menu=bottom.getMenu();
        MenuItem menuitem=menu.getItem(Activity_num);
        menuitem.setChecked(true);
    }
}
