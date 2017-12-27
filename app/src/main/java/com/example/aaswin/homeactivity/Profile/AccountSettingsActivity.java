package com.example.aaswin.homeactivity.Profile;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.aaswin.homeactivity.R;

import java.util.ArrayList;

/**
 * Created by aaswin on 23/12/17.
 */

public class AccountSettingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accountsettings);
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
    private void setupSettingsList()
    {
        ListView listView=(ListView)findViewById(R.id.lvAccountSettings);
        ArrayList<String> options=new ArrayList<>();
        options.add(getString(R.string.edit_profile));
        options.add(getString(R.string.Sign_out));

        ArrayAdapter arrayAdapter=new ArrayAdapter(AccountSettingsActivity.this,android.R.layout.simple_list_item_1,options);
        listView.setAdapter(arrayAdapter);




    }
}
