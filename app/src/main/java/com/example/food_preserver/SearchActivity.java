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

        foodList.add(new Food("Apples", "", R.drawable.apples));
        foodList.add(new Food("Apricots", "", R.drawable.apricots));
        foodList.add(new Food("Artichokes", "", R.drawable.artichokes));
        foodList.add(new Food("Asparagus", "", R.drawable.asparagus));
        foodList.add(new Food("Avocados", "", R.drawable.avocados));
        foodList.add(new Food("Banana", "", R.drawable.banana));
        foodList.add(new Food("Beans: Green, Snap, or Wax", "", R.drawable.beans_green_snap_or_wax));
        foodList.add(new Food("Beans: Lima, Butter, or Pinto", "", R.drawable.beans_lima));
        foodList.add(new Food("Beets", "", R.drawable.beets));
        foodList.add(new Food("Berries", "", R.drawable.berries));
        foodList.add(new Food("Broccoli", "", R.drawable.broccoli));
        foodList.add(new Food("Brussel Sprouts", "", R.drawable.brussel_sprouts));
        foodList.add(new Food("Cabbage or Chinese Cabbage", "", R.drawable.cabbage_or_chinese_cabbage));
        foodList.add(new Food("Carrots", "", R.drawable.carrots));
        foodList.add(new Food("Cauliflower", "", R.drawable.cauliflower));
        foodList.add(new Food("Celery", "", R.drawable.celery));
        foodList.add(new Food("Cherries", "", R.drawable.cherries));
        foodList.add(new Food("Chicken", "", R.drawable.chicken));
        foodList.add(new Food("Chokecherries", "", R.drawable.chokecherries));
        foodList.add(new Food("Citrus Fruits", "", R.drawable.citrus_fruits));
        foodList.add(new Food("Corn", "", R.drawable.corn));
        foodList.add(new Food("Crabapple", "", R.drawable.crabapple));
        foodList.add(new Food("Cucumbers", "", R.drawable.cucumbers));
        foodList.add(new Food("Currants Figs", "", R.drawable.currants_figs));
        foodList.add(new Food("Eggplant", "", R.drawable.eggplant));
        foodList.add(new Food("Garlic-in-Oil", "", R.drawable.garlic_in_oil));
        foodList.add(new Food("Grapes", "", R.drawable.grapes));
        foodList.add(new Food("Greens (including Spinach)", "", R.drawable.greens_including_spinach));
        foodList.add(new Food("Fresh Herbs", "", R.drawable.fresh_herbs));
        foodList.add(new Food("Horseradish", "", R.drawable.horseradish));
        foodList.add(new Food("Kohlrabi", "", R.drawable.kohlrabi));
        foodList.add(new Food("Melons", "", R.drawable.melons));
        foodList.add(new Food("Mint", "", R.drawable.mint));
        foodList.add(new Food("Mushrooms", "", R.drawable.mushrooms));
        foodList.add(new Food("Okra", "", R.drawable.okra));
        foodList.add(new Food("Onions", "", R.drawable.onions));
        foodList.add(new Food("Peaches", "", R.drawable.peaches));
        foodList.add(new Food("Pears", "", R.drawable.pears));
        foodList.add(new Food("Peas Blackeye or Field", "", R.drawable.blackeye_or_field_peas));
        foodList.add(new Food("Peas Green", "", R.drawable.green_peas));
        foodList.add(new Food("Peas Pods Edible (Sugar, Chinese, Snow Peas or Sugar Snap Peas)", "", R.drawable.peas_pods));
        foodList.add(new Food("Peppers Bell or Sweet", "", R.drawable.bell_or_sweet_peppers));
        foodList.add(new Food("Peppers Hot", "", R.drawable.hot_peppers));
        foodList.add(new Food("Pimientos", "", R.drawable.pimientos));
        foodList.add(new Food("Pineapples", "", R.drawable.pineapple));
        foodList.add(new Food("Plums", "", R.drawable.plums));
        foodList.add(new Food("Potatoes New Irish", "", R.drawable.new_irish_potatoes));
        foodList.add(new Food("Potatoes Sweet", "", R.drawable.sweet_potatoes));
        foodList.add(new Food("Pumpkin", "", R.drawable.pumpkin));
        foodList.add(new Food("Quince", "", R.drawable.quince));
        foodList.add(new Food("Rhubarb", "", R.drawable.rhubarb));
        foodList.add(new Food("Rutabagas", "", R.drawable.rutabagas));
        foodList.add(new Food("Squash Summer", "", R.drawable.summer_squash));
        foodList.add(new Food("Squash Winter", "", R.drawable.winter_squash));
        foodList.add(new Food("Strawberries", "", R.drawable.strawberries));
        foodList.add(new Food("Tomatoes", "", R.drawable.tomatoes));
        foodList.add(new Food("Tomatoes Green", "", R.drawable.green_tomatoes));
        foodList.add(new Food("Turnips or Parsnips", "", R.drawable.turnips_or_parsnips));
        foodList.add(new Food("Zucchini", "", R.drawable.zucchini));



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
