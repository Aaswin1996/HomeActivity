package com.example.aaswin.homeactivity.Share;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.aaswin.homeactivity.R;
import com.example.aaswin.homeactivity.Utils.BottomNavigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class ShareActivity extends AppCompatActivity {
    private static final String Tag= "ShareActivity";
    private static final int Activity_num=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toast.makeText(this,"ShareActivity Starts",Toast.LENGTH_SHORT).show();
        setupBottomNavigationView();
    }
    private void setupBottomNavigationView(){
        Toast.makeText(this,"setupBottomNavigationView starts",Toast.LENGTH_SHORT).show();
        BottomNavigationViewEx bottom=(BottomNavigationViewEx)findViewById(R.id.bottomnavview_tab);
        BottomNavigationViewHelper.setupNavView(bottom);
        BottomNavigationViewHelper.enableNavigation(ShareActivity.this,bottom);
        Menu menu=bottom.getMenu();
        MenuItem menuitem=menu.getItem(Activity_num);
        menuitem.setChecked(true);
    }
}
