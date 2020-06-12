package com.example.food_preserver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    //global variables for recyclerview
    RecyclerView recyclerView;
    MyAdapter myAdapter;


    /*
    String s1[], s2[];
    int images[] = {R.drawable.apples, R.drawable.apricots, R.drawable.avocados,R.drawable.banana, R.drawable.berries, R.drawable.cherries, R.drawable.chokecherries,
            R.drawable.citrus_fruits, R.drawable.crabapple, R.drawable.currants_figs, R.drawable.grapes, R.drawable.melons, R.drawable.mint, R.drawable.peaches,
            R.drawable.pears, R.drawable.pineapple, R.drawable.plums, R.drawable.quince, R.drawable.rhubarb,R.drawable.strawberries};
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
/*
        recyclerView = findViewById(R.id.recycler_search);

        MyAdapter myAdapter = new MyAdapter();
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        //request for get intent when search button is tapped
        if (getIntent().hasExtra("com.example.test.SOMETHING")) {
            TextView tv =  (TextView) findViewById(R.id.textView);
            String text = getIntent().getExtras().getString("com.example.test.SOMETHING");

        }




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_menu, menu);
        MenuItem item = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (myAdapter != null) {
                    myAdapter.getFilter().filter(newText);
                }
                return false;

            }
        });

        return super.onCreateOptionsMenu(menu);
*/

    }
}
