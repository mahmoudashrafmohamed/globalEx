package app.amany.eng.com.myglobalapplication.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.amany.eng.com.myglobalapplication.R;

/**
 * Created by Amany1 on 10/15/2017.
 */

public class fragment_myprofile extends Fragment {

    public fragment_myprofile() {
        // Required empty public constructor
    }

    public static fragment_myprofile newInstance() {
        fragment_myprofile  fragment= new fragment_myprofile();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_myprofile, container, false);
    }


}