package com.androidpopcorn.tenx.viewpagerexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class CustomPagerAdapter extends PagerAdapter {

    private Context mCtx;
    private String[] mImageUrls = {"https://source.unsplash.com/random/600x450",
            "https://source.unsplash.com/random/600x451",
            "https://source.unsplash.com/random/600x452",
            "https://source.unsplash.com/random/600x453",
            "https://source.unsplash.com/random/600x454",
            "https://source.unsplash.com/random/600x455",
            "https://source.unsplash.com/random/600x456"};

    public CustomPagerAdapter(Context mCtx) {
        this.mCtx = mCtx;
    }

    @Override
    public int getCount() {
        return mImageUrls.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
       View view = LayoutInflater.from(mCtx).inflate(R.layout.layout_pager, container, false);

        ImageView img = view.findViewById(R.id.iv_image);

        Glide.with(mCtx).load(mImageUrls[position]).into(img);

        container.addView(view);
        return view;


    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
