package com.example.sonyama.myfragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sonyama on 1/21/16.
 */
public class PM_Fragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the view of this fragment
        return inflater.inflate(R.layout.pm_fragment, container, false);
    }
}
