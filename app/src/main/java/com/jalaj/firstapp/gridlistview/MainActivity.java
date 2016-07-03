package com.jalaj.firstapp.gridlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;

import com.jalaj.firstapp.gridlistview.adapter.GridListViewAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Contact> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_gridlist);
        //
        arrayList = new ArrayList<>();


        arrayList.add(new Contact(getImageView(R.drawable.honeycomb),"HoneyComb"));
        arrayList.add(new Contact(getImageView(R.drawable.nougat),"Nougat"));
        arrayList.add(new Contact(getImageView(R.drawable.marshmallow),"Marshmallow"));
        arrayList.add(new Contact(getImageView(R.drawable.gingerbread),"GingerBread"));
        arrayList.add(new Contact(getImageView(R.drawable.icsandwich),"Icecream Sandwich"));
        arrayList.add(new Contact(getImageView(R.drawable.jellybean),"Jellybean"));
        //
        GridListViewAdapter gridListViewAdapter = new GridListViewAdapter(arrayList,this);
        gridView = (GridView)findViewById(R.id.gridListView);
        gridView.setAdapter(gridListViewAdapter);
        //

    }

    private ImageView getImageView(int d){
        ImageView iv = new ImageView(this);
        iv.setLayoutParams(new GridView.LayoutParams(85, 85));
        iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
        iv.setPadding(8, 8, 8, 8);
        iv.setImageResource(R.drawable.honeycomb);
        return iv;
    }
}
