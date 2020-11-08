package com.example.jelajah.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.jelajah.R;

public class TradeFragment extends Fragment implements View.OnClickListener{

    public TradeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_trade, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageButton btnBack = view.findViewById(R.id.back_btn);
        ImageButton btnDummy1 = view.findViewById(R.id.dummy1_btn);
        ImageButton btnDummy2 = view.findViewById(R.id.dummy2_btn);
        btnBack.setOnClickListener(this);
        btnDummy1.setOnClickListener(this);
        btnDummy2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.back_btn) {
            getFragmentManager().popBackStackImmediate();
        } else if (v.getId() == R.id.dummy1_btn){
            TradeDetailFragment mCategoryFragment = new TradeDetailFragment();
            FragmentManager mFragmentManager = getFragmentManager();
            if (mFragmentManager != null) {
                mFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container, mCategoryFragment, TradeDetailFragment.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        } else if (v.getId() == R.id.dummy2_btn){
            TradeDetailFragment mCategoryFragment = new TradeDetailFragment();
            FragmentManager mFragmentManager = getFragmentManager();
            if (mFragmentManager != null) {
                mFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container, mCategoryFragment, TradeDetailFragment.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        }
    }
}