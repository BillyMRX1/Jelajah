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

public class Welcome2Fragment extends Fragment implements View.OnClickListener {

    public Welcome2Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_welcome2, container, false);
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
            Welcome3Fragment mCategoryFragment = new Welcome3Fragment();
            FragmentManager mFragmentManager = getFragmentManager();
            if (mFragmentManager != null) {
                mFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container, mCategoryFragment, Welcome3Fragment.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        } else if (v.getId() == R.id.skip_btn){
            Intent goHome = new Intent(getActivity(), MainActivity.class);
            startActivity(goHome);
        }
    }
}