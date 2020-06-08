package com.example.food_preserver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // nav bar for main menu
        BottomNavigationView nav = findViewById(R.id.bottomNavigationView);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        NavigationUI.setupWithNavController(nav,navHostFragment.getNavController());


        // search icon is clickable
        ImageView searchIcon = findViewById(R.id.SearchIcon);
        searchIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // implement search activity here
                Toast.makeText(MainActivity.this, "Go to Search Activity", Toast.LENGTH_SHORT).show();
            }
        });


        // Ham menu is clickable
        ImageView hamIcon = findViewById(R.id.HamMenu);
        hamIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // implement ham activity here?
                Toast.makeText(MainActivity.this, "Go to Hamburger Activity", Toast.LENGTH_SHORT).show();
            }
        });



    }
}
