package com.jalaj.firstapp.gridlistview;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * Created by jalajmehta on 7/3/16.
 */

public class Contact {

   private ImageView imageView;
    private String name;

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public Contact(ImageView imageView, String name) {
        this.imageView = imageView;

        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
}
