package com.example.saichand.hipbarhomescreen.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.saichand.hipbarhomescreen.Adapter.AdapterAdsViewPager;
import com.example.saichand.hipbarhomescreen.Adapter.AdapterGenreRecyclerView;
import com.example.saichand.hipbarhomescreen.Adapter.AdapterProductlistRecyclerView;
import com.example.saichand.hipbarhomescreen.InfinitePagerAdapter;
import com.example.saichand.hipbarhomescreen.InfiniteViewPager;
import com.example.saichand.hipbarhomescreen.R;

public class MainActivity extends AppCompatActivity {

    RecyclerView adsRecyclerView, genreRecyclerView, productlistRecyclerview;
    InfiniteViewPager adsViewPager;
LinearLayoutManager genreLinearLayoutManger;
GridLayoutManager productlistGridLayoutManager;
//AdapterAdsRecyclerView adapterAdsRecyclerView;
//AdapterAdsViewPager adapterAdsViewPager;
//InfinitePagerAdapter infintePagerAdapter;
AdapterGenreRecyclerView adapterGenreRecyclerView;
AdapterProductlistRecyclerView adapterProductlistRecyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
//        adsLinearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//        adsRecyclerView = (RecyclerView) findViewById(R.id.rv_ads);
//        adapterAdsRecyclerView = new AdapterAdsRecyclerView(MainActivity.this);
//        adsRecyclerView.setLayoutManager(adsLinearLayoutManager);
//        adsRecyclerView.setAdapter(adapterAdsRecyclerView);
        adsViewPager = (InfiniteViewPager) findViewById(R.id.vp_ads);
        PagerAdapter adapter = new InfinitePagerAdapter(new AdapterAdsViewPager(this));
        adsViewPager.setAdapter(adapter);
//        adsViewPager.setCurrentItem(0);
        adsViewPager.setOffscreenPageLimit(2);
        genreLinearLayoutManger = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        genreRecyclerView = (RecyclerView) findViewById(R.id.rv_genre);
        adapterGenreRecyclerView = new AdapterGenreRecyclerView(MainActivity.this);
        genreRecyclerView.setLayoutManager(genreLinearLayoutManger);
        genreRecyclerView.setAdapter(adapterGenreRecyclerView);
        int numberofcolumns = 3;
        productlistGridLayoutManager = new GridLayoutManager(this,numberofcolumns);
        productlistRecyclerview = (RecyclerView) findViewById(R.id.rv_product_list);
        adapterProductlistRecyclerView = new AdapterProductlistRecyclerView(MainActivity.this);
        productlistRecyclerview.setLayoutManager(productlistGridLayoutManager);
        productlistRecyclerview.setAdapter(adapterProductlistRecyclerView);
    }


}
