package com.example.jelajah.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.jelajah.CameraActivityTF;
import com.example.jelajah.ClassifierActivity;
import com.example.jelajah.MainActivity;
import com.example.jelajah.R;
import com.example.jelajah.activity.CameraActivity;
import com.example.jelajah.activity.LoginActivity;

public class JelajahDetailFragment extends Fragment implements View.OnClickListener{

    public JelajahDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_jelajah_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageButton btnBack = view.findViewById(R.id.back_btn);
        ImageButton btnItem1 = view.findViewById(R.id.dummy1_btn);
        ImageButton btnItem2 = view.findViewById(R.id.dummy2_btn);
        ImageButton btnItem3 = view.findViewById(R.id.dummy3_btn);
        btnBack.setOnClickListener(this);
        btnItem1.setOnClickListener(this);
        btnItem2.setOnClickListener(this);
        btnItem3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.back_btn) {
            getFragmentManager().popBackStackImmediate();
        } else if (v.getId() == R.id.dummy1_btn){
            Intent getCam = new Intent(getActivity(), ClassifierActivity.class);
            startActivity(getCam);
        } else if (v.getId() == R.id.dummy2_btn){
            Intent getCam = new Intent(getActivity(), CameraActivity.class);
            startActivity(getCam);
        } else if (v.getId() == R.id.dummy3_btn){
            Intent getCam = new Intent(getActivity(), CameraActivity.class);
            startActivity(getCam);
        }
    }
}