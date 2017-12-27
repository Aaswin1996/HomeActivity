package com.example.aaswin.homeactivity.Profile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.aaswin.homeactivity.Likes.LikesActivity;
import com.example.aaswin.homeactivity.R;
import com.example.aaswin.homeactivity.Utils.BottomNavigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class ProfileActivity extends AppCompatActivity {
    private static final String Tag= "ProfileActivity";
    private static final int Activity_num=4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toast.makeText(this,"ProfileActivity Starts",Toast.LENGTH_SHORT).show();
        setupBottomNavigationView();
        setupToolbar();
    }
    private void setupBottomNavigationView(){
        Toast.makeText(this,"setupBottomNavigationView starts",Toast.LENGTH_SHORT).show();
        BottomNavigationViewEx bottom=(BottomNavigationViewEx)findViewById(R.id.bottomnavview_tab);
        BottomNavigationViewHelper.setupNavView(bottom);
        BottomNavigationViewHelper.enableNavigation(ProfileActivity.this,bottom);
        Menu menu=bottom.getMenu();
        MenuItem menuitem=menu.getItem(Activity_num);
        menuitem.setChecked(true);
    }
    // to setup the toolbar
    private void setupToolbar()
    {
        Toolbar toolbar=(Toolbar)findViewById(R.id.profileToolbar);
        ImageView profileMenu=(ImageView)findViewById(R.id.profileMenu);
        profileMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ProfileActivity.this,AccountSettingsActivity.class);
                startActivity(intent);
            }
        });


    }
}
