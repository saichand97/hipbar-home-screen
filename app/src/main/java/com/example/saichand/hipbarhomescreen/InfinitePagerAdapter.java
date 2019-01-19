package com.example.saichand.hipbarhomescreen;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

public class InfinitePagerAdapter extends PagerAdapter {
    private static final String TAG = "InfinitePagerAdapter";
    private static final boolean DEBUG = false;

    private PagerAdapter adapter;

    public InfinitePagerAdapter(PagerAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public int getCount() {
        if (getRealCount() == 0){
            return 0;
    }
    return Integer.MAX_VALUE;
}
    public int getRealCount() {
        return adapter.getCount();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        int virtualposition = position%getRealCount();
        debug("instantiateItem: real position: "+position);
        debug("instantiateItem: virtual position: "+virtualposition);
        return adapter.instantiateItem(container, virtualposition);

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        int virtualposition = position%getRealCount();
        debug("destroyItem: real position: "+ position);
        debug("destroyItem: virtual position: "+virtualposition);

        adapter.destroyItem(container, virtualposition, object);
    }

    @Override
    public void finishUpdate(@NonNull ViewGroup container) {
        adapter.finishUpdate(container);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return adapter.isViewFromObject(view, o);
    }

    @Override
    public void restoreState(@Nullable Parcelable state, @Nullable ClassLoader loader) {
        adapter.restoreState(state, loader);
    }

    @Nullable
    @Override
    public Parcelable saveState() {
        return adapter.saveState();
    }

    @Override
    public void startUpdate(@NonNull ViewGroup container) {
        adapter.startUpdate(container);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        int virtualPosition = position % getRealCount();
        return adapter.getPageTitle(virtualPosition);
    }

    @Override
    public float getPageWidth(int position) {
        return adapter.getPageWidth(position);
    }

    @Override
    public void setPrimaryItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        adapter.setPrimaryItem(container, position, object);
    }

    @Override
    public void unregisterDataSetObserver(@NonNull DataSetObserver observer) {
        adapter.unregisterDataSetObserver(observer);
    }

    @Override
    public void registerDataSetObserver(@NonNull DataSetObserver observer) {
        adapter.registerDataSetObserver(observer);
    }

    @Override
    public void notifyDataSetChanged() {
        adapter.notifyDataSetChanged();
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return adapter.getItemPosition(object);
    }

    public void debug(String message){
        if (DEBUG){
            Log.d(TAG,message);
        }
    }
}
