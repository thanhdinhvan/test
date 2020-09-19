package com.example.androidday12.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.androidday12.fragment.AnBumFragment;
import com.example.androidday12.fragment.AsritFragment;
import com.example.androidday12.fragment.SongFragment;

public class MusicPagerAdapter extends FragmentPagerAdapter {
    private String[] titles = new String[]{"Song", "setting", "arist"};
    public MusicPagerAdapter(@NonNull FragmentManager fm) {

        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return  new SongFragment();
            case 1:  return  new AnBumFragment();
            case 2:  return  new AsritFragment();
        }
        return null;
    }



    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    @Override
    public int getCount() {
        return 3;
    }
}
