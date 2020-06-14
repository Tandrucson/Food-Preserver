package com.example.food_preserver;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    //global variables for recyclerview
    RecyclerView recyclerView;
    MyAdapter myAdapter;
    List<Food> foodList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        foodList = new ArrayList<>();

        foodList.add(new Food("Apples", "Apples", R.drawable.apples));
        foodList.add(new Food("Grapes", "Apples", R.drawable.apples));
        foodList.add(new Food("Banana", "Apples", R.drawable.apples));


        recyclerView = findViewById(R.id.recycler_search);
        myAdapter = new MyAdapter(foodList);
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
                    myAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}
