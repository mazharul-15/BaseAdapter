package com.example.baseadapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class MyBaseAdapter extends BaseAdapter {

    Context context;
    int[] data;
    LayoutInflater inflater;

    MyBaseAdapter(Context context, int[] data) {
        this.context = context;
        this.data = data;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        view = inflater.inflate(R.layout.image_view, null);
        ImageView imgView = (ImageView) view.findViewById(R.id.image_view);
        imgView.setImageResource(data[position]);

        return view;
    }
}
