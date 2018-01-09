package com.example.aaswin.homeactivity.Profile;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aaswin.homeactivity.R;

/**
 * Created by aaswin on 28/12/17.
 */

public class EditProfileFragment extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View  view = inflater.inflate(R.layout.fragment_editprofile,container,false);
        return view;

    }
}
