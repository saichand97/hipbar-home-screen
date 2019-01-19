package com.example.saichand.hipbarhomescreen.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.saichand.hipbarhomescreen.R;

public class AdapterGenreRecyclerView extends RecyclerView.Adapter<AdapterGenreRecyclerView.ViewHolder>{
    Context context;
    public AdapterGenreRecyclerView(Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View genreRecyclerView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.genre_recycler_view,viewGroup,false);
        return new AdapterGenreRecyclerView.ViewHolder(genreRecyclerView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.tv_item_genre);
    }
}
}
