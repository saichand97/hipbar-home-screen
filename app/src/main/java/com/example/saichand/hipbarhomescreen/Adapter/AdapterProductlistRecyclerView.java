package com.example.saichand.hipbarhomescreen.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.saichand.hipbarhomescreen.R;

public class AdapterProductlistRecyclerView extends RecyclerView.Adapter<AdapterProductlistRecyclerView.ViewHolder> {
    Context context;

    public AdapterProductlistRecyclerView(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View productlistRecyclerView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.product_list_recycler_view, viewGroup, false);
        return new AdapterProductlistRecyclerView.ViewHolder(productlistRecyclerView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 29;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_item_product_list);
            textView = itemView.findViewById(R.id.tv_item_product_list);
        }
    }
}
