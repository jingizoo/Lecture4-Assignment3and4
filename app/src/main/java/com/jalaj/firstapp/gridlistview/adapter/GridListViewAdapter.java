package com.jalaj.firstapp.gridlistview.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.jalaj.firstapp.gridlistview.Contact;
import com.jalaj.firstapp.gridlistview.R;

import java.util.ArrayList;

/**
 * Created by jalajmehta on 7/3/16.
 */

public class GridListViewAdapter extends BaseAdapter {
    ArrayList<Contact> arrayList;
    LayoutInflater layoutInflater;

    public GridListViewAdapter(ArrayList<Contact> arrayList, Context ctx) {
        this.arrayList = arrayList;
        layoutInflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.layout_textview,parent,false);
        ImageView iv = (ImageView)convertView.findViewById(R.id.imageView1);
        TextView t = (TextView)convertView.findViewById(R.id.textView2);

        Contact c = (Contact) getItem(position);


       t.setText(c.getName());

        switch (c.getName()){
        case "HoneyComb":iv.setImageResource(R.drawable.honeycomb);
            Log.d("","honeycomb yeah!");break;
            case "Icecream Sandwich":iv.setImageResource(R.drawable.icsandwich);break;
            case "Nougat":iv.setImageResource(R.drawable.nougat);break;
            case "Marshmallow":iv.setImageResource(R.drawable.marshmallow);break;
            case "Jellybean":iv.setImageResource(R.drawable.jellybean);break;
            case "GingerBread":iv.setImageResource(R.drawable.gingerbread);break;}

        return convertView;
    }
}
