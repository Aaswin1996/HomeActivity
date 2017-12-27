package com.example.aaswin.homeactivity.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.aaswin.homeactivity.Home.HomeActivity;
import com.example.aaswin.homeactivity.Likes.LikesActivity;
import com.example.aaswin.homeactivity.Profile.ProfileActivity;
import com.example.aaswin.homeactivity.R;
import com.example.aaswin.homeactivity.Search.SearchActivity;
import com.example.aaswin.homeactivity.Share.ShareActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by aaswin on 17/10/17.
 */

public class BottomNavigationViewHelper {


    public static void setupNavView(BottomNavigationViewEx obj)
    {
        obj.enableAnimation(false);
        obj.enableItemShiftingMode(false);
        obj.enableShiftingMode(false);




    }

    public static void enableNavigation(final Context context,BottomNavigationViewEx obj)
    {
        obj.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.ic_android_home:
                        Intent intent1=new Intent(context, HomeActivity.class);
                        context.startActivity(intent1);
                        Toast.makeText(context,"navigating ",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ic_android_search:
                        Intent intent2=new Intent(context, SearchActivity.class);
                        context.startActivity(intent2);
                        Toast.makeText(context,"navigating ",Toast.LENGTH_SHORT).show();

                        break;
                    case R.id.ic_android_circle:
                        Intent intent3=new Intent(context, ShareActivity.class);
                        context.startActivity(intent3);
                        Toast.makeText(context,"navigating ",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ic_android_alert:
                        Intent intent4=new Intent(context, LikesActivity.class);
                        context.startActivity(intent4);
                        Toast.makeText(context,"navigating ",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ic_android_android:
                        Intent intent5=new Intent(context, ProfileActivity.class);
                        context.startActivity(intent5);
                        Toast.makeText(context,"navigating ",Toast.LENGTH_SHORT).show();
                        break;


                }

                return false;
            }
        });
    }


}
