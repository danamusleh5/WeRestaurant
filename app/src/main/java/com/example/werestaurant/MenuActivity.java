package com.example.werestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        listView= (ListView)findViewById(R.id.menu_list);

          String[] captions = new String[Menu.menus.length];
          int[] ids = new int[Menu.menus.length];

        for (int i = 0; i < captions.length; i++) {
            captions[i] = Menu.menus[i].getName();
            ids[i] = Menu.menus[i].getImageID();
        }
                ArrayAdapter <Menu> listAdapter = new ArrayAdapter <Menu>(this,
                android.R.layout.simple_list_item_1,
               Menu.menus);
        listView.setAdapter(listAdapter);


        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(MenuActivity.this, TypeActivity.class);
                    intent.putExtra("type_id",(int)id);
                    startActivity(intent);
                }
            }
        };

        listView.setOnItemClickListener(itemClickListener);
    }
}
