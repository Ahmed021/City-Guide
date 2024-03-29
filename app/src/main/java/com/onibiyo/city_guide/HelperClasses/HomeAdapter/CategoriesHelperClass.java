package com.onibiyo.city_guide.HelperClasses.HomeAdapter;

import android.graphics.drawable.GradientDrawable;
import android.widget.RelativeLayout;

public class CategoriesHelperClass {
    GradientDrawable gradient;
    int image;
    String title;

    public CategoriesHelperClass(GradientDrawable gradient, int image, String title) {
        this.gradient = gradient;
        this.image = image;
        this.title = title;
    }

    public GradientDrawable getGradient() {
        return gradient;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }
}
