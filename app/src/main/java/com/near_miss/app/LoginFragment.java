package com.near_miss.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by DJ on 7/2/2014.
 */
public class LoginFragment extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container
            , Bundle savedInstanceState){
        // inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }
}
