package com.example.saichand.hipbarhomescreen.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.saichand.hipbarhomescreen.R;

public class AdapterAdsRecyclerView extends RecyclerView.Adapter<AdapterAdsRecyclerView.ViewHolder>{
Context context;
public AdapterAdsRecyclerView(Context context){
    this.context = context;
}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View adsRecyclerView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ads_viewpager,viewGroup,false);
        return new AdapterAdsRecyclerView.ViewHolder(adsRecyclerView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_item_ads);
        }
    }
}
