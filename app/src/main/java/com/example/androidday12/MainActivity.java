package com.example.androidday12;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.androidday12.adapter.MusicPagerAdapter;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

// drawale lay out
public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
        private DrawerLayout drawerLayout;
        private NavigationView navigationView;
        private ViewPager vp_music;
        private MusicPagerAdapter musicPagerAdapter;
        private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.muenu);
        drawerLayout = findViewById(R.id.dr_menu);
        navigationView = findViewById(R.id.menu_navigation);
        tabLayout = findViewById(R.id.tab_main);
        vp_music = findViewById(R.id.vp_music);

        musicPagerAdapter = new MusicPagerAdapter(getSupportFragmentManager());
        vp_music.setAdapter(musicPagerAdapter);
        tabLayout.setupWithViewPager(vp_music);


        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            if (drawerLayout.isDrawerOpen(GravityCompat.START)){
              drawerLayout.closeDrawer(GravityCompat.START);
            } else {
                drawerLayout.openDrawer(GravityCompat.START);
            }
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case  R.id.menu_song :
                Toast.makeText(getApplicationContext(),"song",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_caidat:
                Toast.makeText(getApplicationContext(),"caidat",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_setting:
                Toast.makeText(getApplicationContext(),"setting",Toast.LENGTH_SHORT).show();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return false;
    }
}