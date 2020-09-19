package com.example.androidday12.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidday12.Model.Song;
import com.example.androidday12.R;
import com.example.androidday12.adapter.AnbumAdapter;

import java.util.ArrayList;
import java.util.List;

public class AnBumFragment extends Fragment {
    private RecyclerView recyclerView;
    private List<Song> songs;
    private AnbumAdapter anbumAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_anbum,container,false);
        songs = new ArrayList<>();
        songs.add(new Song("lac nhau den muon doi",R.drawable.nhacvanhoa,"van thanh"));
        songs.add(new Song("noi ta tim ve",R.drawable.nhacvanhoa,"van thanh"));
        songs.add(new Song("thang tu loi noi doi",R.drawable.nhacvanhoa,"van thanh"));
        songs.add(new Song("phai chia tay thoi",R.drawable.nhacvanhoa,"van thanh"));
        songs.add(new Song("van nghe si",R.drawable.nhacvanhoa,"van thanh"));
        songs.add(new Song("chi toi",R.drawable.nhacvanhoa,"van thanh"));
        songs.add(new Song("con mua bang gia",R.drawable.nhacvanhoa,"van thanh"));
        anbumAdapter = new AnbumAdapter(songs,getContext());

        recyclerView = view.findViewById(R.id.rc_anbum);
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(),1);
       recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(anbumAdapter);


        return view;
    }
}
