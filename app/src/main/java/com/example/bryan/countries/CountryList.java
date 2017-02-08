package com.example.bryan.countries;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by bryan on 2/7/2017.
 */
public class CountryList extends FrameLayout{

    public CountryList(Context context){
        super(context);
    }

    public CountryList(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    public CountryList(Context context, AttributeSet attrs, int defStyleAttr){
        super(context, attrs, defStyleAttr);
        inflate(context, R.layout.country_list, this);
    }


}
