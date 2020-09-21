package com.example.di;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {
    private Battery battery;
    private Charger charger;

    @Inject
    public Mobile(Battery battery, Charger charger) {

        this.battery = battery;
        this.charger = charger;

    }

    void call() {
        Log.d("Mobile", "call: ");
    }
}
