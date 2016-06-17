package com.quarkstar.freedom.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class NearBySearchAdapter extends BaseAdapter {
    private Context mContext;
 
    // Keep all Images in array
    public String[] mThumbIds = {
            "In Radius of 1 km", "In Radius of 2 km",
            "In Radius of 4 km", "In Radius of 6 km",
    };
 
    // Constructor
    public NearBySearchAdapter(Context c){
        mContext = c;
    }
 
    @Override
    public int getCount() {
        return mThumbIds.length;
    }
 
    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }
 
    @Override
    public long getItemId(int position) {
        return 0;
    }
 
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView imageView = new TextView(mContext);
        imageView.setText(mThumbIds[position]);
//        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//        imageView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        imageView.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 200));
        return imageView;
    }
 
}