package com.geekchtech.hw5.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.geekchtech.hw5.databinding.FragmentDashBinding;
import com.geekchtech.hw5.databinding.FragmentNotifBinding;

public class NotifFragment extends Fragment {
    private FragmentNotifBinding binding;


    public NotifFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      binding = FragmentNotifBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}