package com.example.exam_mid2;

import android.content.Context;
import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class Imageclass extends BaseAdapter {

    Context context;
    int[] person;
    LayoutInflater inflater;

     public Imageclass(Context context, int[] person){
         this.context = context;
         this.person = person;
         this.inflater = (LayoutInflater.from(context));
     }

    @Override
    public int getCount() {
        return person.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
         view = inflater.inflate(R.layout.grid_image,null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(person[i]);
         return view;
    }
}
