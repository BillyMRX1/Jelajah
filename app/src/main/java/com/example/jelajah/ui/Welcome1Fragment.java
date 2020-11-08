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

import com.example.jelajah.MainActivity;
import com.example.jelajah.R;
import com.example.jelajah.activity.LoginActivity;

public class Welcome1Fragment extends Fragment implements View.OnClickListener{

    public Welcome1Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_welcome1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageButton btnNext = view.findViewById(R.id.next_btn);
        ImageButton btnSkip = view.findViewById(R.id.skip_btn);
        btnNext.setOnClickListener(this);
        btnSkip.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.next_btn) {
            Welcome2Fragment mCategoryFragment = new Welcome2Fragment();
            FragmentManager mFragmentManager = getFragmentManager();
            if (mFragmentManager != null) {
                mFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container, mCategoryFragment, Welcome2Fragment.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        } else if (v.getId() == R.id.skip_btn){
            Intent goHome = new Intent(getActivity(), MainActivity.class);
            startActivity(goHome);
        }
    }
}