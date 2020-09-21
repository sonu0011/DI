package com.example.di;

import android.util.Log;

import javax.inject.Inject;

public class Charger {

    @Inject
    public Charger(){
        Log.d("Mobile", "Charger: ");
    }
}
