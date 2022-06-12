package com.example.werestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageButton menu_button ;
    private ImageButton location_button ;
    private ImageButton res_button ;
    private ImageButton login_button ;
    private ImageButton home_button ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu_button = findViewById(R.id.menu_button);
        res_button = findViewById(R.id.res_button);
        login_button = findViewById(R.id.login_button);
        location_button = findViewById(R.id.location_button);
        home_button = findViewById(R.id.home_button);



        menu_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MenuActivity.class);
                startActivity(intent);
              Toast.makeText(getApplicationContext(), "You Can Take a look to Menu", Toast.LENGTH_LONG).show();
            }
        });


        ////////////////////////////////////////////////////////////////////////////////
        //////// loooooooooooooooooooogin Button
        login_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);
               Toast.makeText(getApplicationContext(), "LogIn to your Account to take a Disscount", Toast.LENGTH_LONG).show();
            }
        });


        res_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ContactActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "More About Us", Toast.LENGTH_LONG).show();
            }
        });
        location_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MapsActivity.class);
                startActivity(intent);
                 Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
            }
        });

        home_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
            }
        });

    }
}



