package com.near_miss.app;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by DJ on 7/2/2014.
 */
public class TicketCreateFragment extends Fragment
{
    public static final String ARG_SECTION_NUMBER = "ticket_create";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container
            , Bundle savedInstanceState){
        // inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ticket_create, container, false);
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static TicketCreateFragment newInstance(int sectionNumber) {
        TicketCreateFragment fragment = new TicketCreateFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

}
