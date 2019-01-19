package com.example.saichand.hipbarhomescreen.Adapter;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.saichand.hipbarhomescreen.R;

public class AdapterAdsViewPager extends PagerAdapter {
    Activity activity;
    public AdapterAdsViewPager(Activity activity){
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
            LayoutInflater inflater = (LayoutInflater)container.getContext().
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.ads_viewpager,null);
        ImageView imageView = (ImageView) layout.findViewById(R.id.iv_item_ads);
        ((ViewPager)container).addView(layout,0);

        return layout;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ((ViewPager)container).removeView((View)object);
    }


    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == ((View)o);
    }

    @Nullable
    @Override
    public Parcelable saveState() {
        return null;
    }
}
