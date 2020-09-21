package com.example.di;

import android.util.Log;

import javax.inject.Inject;

public class Battery {
    @Inject
    public Battery(){
        Log.d("Mobile", "Battery: ");
    }
}
