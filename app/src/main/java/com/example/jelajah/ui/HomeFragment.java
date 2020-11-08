package com.example.jelajah.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jelajah.R;
import com.example.jelajah.activity.LoginActivity;
import com.example.jelajah.activity.SignUpActivity;

public class HomeFragment extends Fragment implements View.OnClickListener{
    private RelativeLayout menu;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageButton btnItem1 = view.findViewById(R.id.borobudur_btn);
        ImageButton btnItem2 = view.findViewById(R.id.prambanan_btn);
        ImageButton btnTrade = view.findViewById(R.id.trade_btn);
        ImageButton btnMenu = view.findViewById(R.id.menu_btn);
        menu = view.findViewById(R.id.menu);
        TextView exit = view.findViewById(R.id.exit);
        btnItem1.setOnClickListener(this);
        btnItem2.setOnClickListener(this);
        btnTrade.setOnClickListener(this);
        btnMenu.setOnClickListener(this);
        exit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.borobudur_btn) {
            JelajahDetailFragment mCategoryFragment = new JelajahDetailFragment();
            FragmentManager mFragmentManager = getFragmentManager();
            if (mFragmentManager != null) {
                mFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container, mCategoryFragment, JelajahDetailFragment.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        } else if (v.getId() == R.id.prambanan_btn){
            JelajahDetailFragment mCategoryFragment = new JelajahDetailFragment();
            FragmentManager mFragmentManager = getFragmentManager();
            if (mFragmentManager != null) {
                mFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container, mCategoryFragment, JelajahDetailFragment.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        } else if (v.getId() == R.id.trade_btn){
            TradeFragment mCategoryFragment = new TradeFragment();
            FragmentManager mFragmentManager = getFragmentManager();
            if (mFragmentManager != null) {
                mFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container, mCategoryFragment, TradeFragment.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        } else if (v.getId() == R.id.menu_btn){
            if (menu.getVisibility()==View.GONE){
                TransitionManager.beginDelayedTransition(menu, new AutoTransition());
                menu.setVisibility(View.VISIBLE);
            }else {
                TransitionManager.beginDelayedTransition(menu, new AutoTransition());
                menu.setVisibility(View.GONE);
            }
        } else if (v.getId() == R.id.exit){
            Intent exit = new Intent(getActivity(), LoginActivity.class);
            startActivity(exit);
            getActivity().finish();
        }
    }
}