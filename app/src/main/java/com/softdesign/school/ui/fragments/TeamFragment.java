package com.softdesign.school.ui.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softdesign.school.R;
import com.softdesign.school.ui.activities.MainActivity;

/**
 * Created by Lenovo on 10.02.2016.
 */
public class TeamFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_team,null);
        getActivity().setTitle(getResources().getString(R.string.drawer_team));
        Activity activity=getActivity();
        ((MainActivity)activity).setCheck(R.id.drawer_team);
        return v;
    }
}