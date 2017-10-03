package com.mylab.hasanahlab4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by student24 on 10/2/17.
 */

public class ImageAdapter extends BaseAdapter {
    public Context mContext;

    public Integer[] mThumbId={
            R.drawable.pic_10, R.drawable.pic_11,
            R.drawable.pic_12, R.drawable.pic_13,
            R.drawable.pic_14, R.drawable.pic_15,
    };

    public ImageAdapter (Context c)
    {
        mContext = c;
    }

    @Override
    public int getCount()
    {
        return mThumbId.length;
    }

    public Object getItem(int position)
    {
        return mThumbId[position];
    }

    public long getItemId(int position)
    {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbId[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(150,150));
        return imageView;

    }
}
