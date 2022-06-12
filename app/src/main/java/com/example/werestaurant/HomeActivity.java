package com.example.werestaurant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        RecyclerView recycler = findViewById(R.id.restaurant_recycler);
        String[] captions = new String[Contents.contents.length];
        int[] ids = new int[Contents.contents.length];

        for (int i = 0; i < captions.length; i++) {
            captions[i] = Contents.contents[i].getName();
            ids[i] = Contents.contents[i].getImageID();
        }
        GridLayoutManager mLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
        recycler.setLayoutManager(mLayoutManager);
//        recycler.setLayoutManager(new GridLayoutManager(this));
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions, ids);
        recycler.setAdapter(adapter);

    }
}