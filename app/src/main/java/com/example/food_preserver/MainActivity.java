package com.example.food_preserver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


/* recyclerview initial values

     RecyclerView recyclerView;
     String s1[], s2[];
     int images[] = {R.drawable.ic_carrot, R.drawable.ic_fruit, R.drawable.ic_meat};
*/
    Context context;

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
                //final Intent intentmethods;
                //intentmethods = new Intent(MainActivity.this, Food_item_instructions.class);
                Toast.makeText(MainActivity.this, "Go to Search Activity", Toast.LENGTH_SHORT).show();
                //MainActivity.this.startActivity(intentmethods);

            }
        });


        // Ham menu is clickable
        ImageView hamIcon = findViewById(R.id.HamMenu);
        hamIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // implement ham activity here?
                final Intent intent;
                intent = new Intent(MainActivity.this, Food_item_instructions.class);
                //intent = new Intent(MainActivity.this, Menu.class);
                Toast.makeText(MainActivity.this, "Menu", Toast.LENGTH_SHORT).show();
                MainActivity.this.startActivity(intent);
                Log.v("navhost", "issue");
            }
        });



/*     recyclerview implementation in MainActivity Template

          recyclerView = findViewById(R.id.recyclerView);
          s1 = getResources().getStringArray(R.array.programming_languages);
          s2 = getResources().getStringArray(R.array.description);
          MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
          recyclerView.setAdapter(myAdapter);
          recyclerView.setLayoutManager(new LinearLayoutManager(this));
*/

    }
}
