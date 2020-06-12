package com.example.food_preserver;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Food_item_instructions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_item_instructions);

        BottomNavigationView nav = findViewById(R.id.methods);
        NavHostFragment navHostFragment = (NavHostFragment) this.getSupportFragmentManager().findFragmentById(R.id.fragment_container);
        NavigationUI.setupWithNavController(nav,navHostFragment.getNavController());

//        nav.setOnNavigationItemSelectedListener(navListener);
//
//        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new canningFragment).commit();
    }

//    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
//            new BottomNavigationView.OnNavigationItemSelectedListener() {
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//            Fragment selectedFragment = null;
//
//            switch(menuItem.getItemId()) {
//                case R.id.canning:
//                    selectedFragment = new canningFragment();
//                    break;
//                case R.id.drying:
//                    selectedFragment = new dryingFragment();
//                    break;
//                case R.id.freezing:
//                    selectedFragment = new freezingFragment();
//                    break;
//            }
//
//            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
//
//            return true;
//        }
//    };
}