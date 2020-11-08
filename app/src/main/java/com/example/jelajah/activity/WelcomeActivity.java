package com.example.jelajah.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;

import com.example.jelajah.R;
import com.example.jelajah.ui.HomeFragment;
import com.example.jelajah.ui.Welcome1Fragment;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        FragmentManager mFragmentManager = getSupportFragmentManager();
        Welcome1Fragment mHomeFragment = new Welcome1Fragment();
        Fragment fragment = mFragmentManager.findFragmentByTag(Welcome1Fragment.class.getSimpleName());

        if (!(fragment instanceof Welcome1Fragment)) {
            Log.d("MyFlexibleFragment", "Fragment Name :" + Welcome1Fragment.class.getSimpleName());
            mFragmentManager
                    .beginTransaction()
                    .add(R.id.frame_container, mHomeFragment, Welcome1Fragment.class.getSimpleName())
                    .commit();
        }
    }
}