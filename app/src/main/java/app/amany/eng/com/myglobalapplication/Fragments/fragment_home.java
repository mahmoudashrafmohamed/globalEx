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

public class fragment_home extends Fragment {

    public fragment_home() {
        // Required empty public constructor
    }

    public static fragment_home newInstance() {
        fragment_home fragment = new fragment_home();
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
        return inflater.inflate(R.layout.fragment_home, container, false);
    }


}
