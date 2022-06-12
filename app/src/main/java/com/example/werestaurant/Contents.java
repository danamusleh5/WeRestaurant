package com.example.werestaurant;

import android.widget.Button;

public class Contents {

    private String name;
    private int imageID;

    public static final com.example.werestaurant.Contents[] contents = {
            new com.example.werestaurant.Contents("Our Menu", R.drawable.menu),
            new com.example.werestaurant.Contents("Reservation ", R.drawable.reservation),
            new com.example.werestaurant.Contents("Order", R.drawable.order),
            new com.example.werestaurant.Contents("About Us", R.drawable.place),
            new com.example.werestaurant.Contents("Our Location", R.drawable.location),
            new com.example.werestaurant.Contents("Log In", R.drawable.login),



    };
    private Contents(String name, int imageID){
        this.name = name;
        this.imageID = imageID;
    }
    public String getName(){return name;}
    public int getImageID(){return imageID;}

}


