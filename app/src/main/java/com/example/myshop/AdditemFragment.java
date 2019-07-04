package com.example.myshop;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;


public class AdditemFragment extends Fragment {

    public AdditemFragment() {
        // Required empty public constructor
    }


    TabLayout tabLayout;
    FrameLayout frameLayout;
    Fragment fragment = null;

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_additem, container, false);
        tabLayout=(TabLayout)view.findViewById(R.id.tabLayout);
        frameLayout=(FrameLayout)view.findViewById(R.id.frameLayout);


        fragment = new Allitem();
        fragmentManager = getChildFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.commit();

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                // Fragment fragment = null;
                switch (tab.getPosition()) {
                    case 0:

                        fragment = new Allitem();

                        break;
                    case 1:

                        fragment = new Itemadd();


                        break;
                    case 2:
                        fragment = new Updateitem();

                        break;
                    case 3:
                        fragment = new Deleteitem();
                        break;

                }
                FragmentManager fm = getChildFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frameLayout, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        // Inflate the layout for this fragment
        return view;

    }

}
