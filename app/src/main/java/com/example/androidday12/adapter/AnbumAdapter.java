package com.example.androidday12.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidday12.Model.Song;
import com.example.androidday12.R;

import java.util.List;

public class AnbumAdapter extends RecyclerView.Adapter<AnbumAdapter.viewHolder> {
   private List<Song> songs;
   private Context context;

    public AnbumAdapter(List<Song> songs, Context context) {
        this.songs = songs;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dong_anbum,parent,false);


        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Song song = songs.get(position);
        holder.tv_name.setText(song.getName());
        holder.tv_casi.setText(song.getCaSi());
        holder.img.setImageResource(song.getImg());
    }

    @Override
    public int getItemCount() {

        return songs.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        private TextView tv_name, tv_casi;
        private ImageView img;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            tv_casi = itemView.findViewById(R.id.tv_casi);
            tv_name = itemView.findViewById(R.id.tv_name);
            img = itemView.findViewById(R.id.img_anbum);


        }
    }
}
