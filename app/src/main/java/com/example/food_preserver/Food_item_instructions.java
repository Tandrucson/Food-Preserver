package com.example.food_preserver;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class Food_item_instructions extends AppCompatActivity{

    ImageView foodImage;
    TextView name;
    String foodName;

    ArrayList<Food> foodList = new ArrayList<Food>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_item_instructions);

        BottomNavigationView nav = findViewById(R.id.methods);
        NavHostFragment navHostFragment = (NavHostFragment) this.getSupportFragmentManager().findFragmentById(R.id.fragment_container);
        NavigationUI.setupWithNavController(nav,navHostFragment.getNavController());


        //xmlpullparser code here

//        nav.setOnNavigationItemSelectedListener(navListener);
//
        foodList.add(new Food("Artichokes", "Vegetable", R.drawable.artichokes));
        foodList.add(new Food("Asparagus", "Vegetable", R.drawable.asparagus));
        foodList.add(new Food("Beans: Green, Snap, or Wax", "Vegetable", R.drawable.beans_green_snap_or_wax));
        foodList.add(new Food("Beans: Lima, Butter, or Pinto", "Vegetable", R.drawable.beans_lima));
        foodList.add(new Food("Beets", "Vegetable", R.drawable.beets));
        foodList.add(new Food("Broccoli", "Vegetable", R.drawable.broccoli));
        foodList.add(new Food("Brussel Sprouts", "Vegetable", R.drawable.brussel_sprouts));
        foodList.add(new Food("Cabbage or Chinese Cabbage", "Vegetable", R.drawable.cabbage_or_chinese_cabbage));
        foodList.add(new Food("Carrots", "Vegetable", R.drawable.carrots));
        foodList.add(new Food("Cauliflower", "Vegetable", R.drawable.cauliflower));
        foodList.add(new Food("Celery", "Vegetable", R.drawable.celery));
        foodList.add(new Food("Corn", "Vegetable", R.drawable.corn));
        foodList.add(new Food("Cucumbers", "Vegetable", R.drawable.cucumbers));
        foodList.add(new Food("Eggplant", "Vegetable", R.drawable.eggplant));
        foodList.add(new Food("Garlic-in-Oil", "Vegetable", R.drawable.garlic_in_oil));
        foodList.add(new Food("Greens (including Spinach)", "Vegetable", R.drawable.greens_including_spinach));
        foodList.add(new Food("Fresh Herbs", "Vegetable", R.drawable.fresh_herbs));
        foodList.add(new Food("Horseradish", "Vegetable", R.drawable.horseradish));
        foodList.add(new Food("Kohlrabi", "Vegetable", R.drawable.kohlrabi));
        foodList.add(new Food("Mushrooms", "Vegetable", R.drawable.mushrooms));
        foodList.add(new Food("Okra", "Vegetable", R.drawable.okra));
        foodList.add(new Food("Onions", "Vegetable", R.drawable.onions));
        foodList.add(new Food("Peas Blackeye or Field", "Vegetable", R.drawable.blackeye_or_field_peas));
        foodList.add(new Food("Peas Green", "Vegetable", R.drawable.green_peas));
        foodList.add(new Food("Peas Pods Edible (Sugar, Chinese, Snow Peas or Sugar Snap Peas)", "Vegetable", R.drawable.peas_pods));
        foodList.add(new Food("Peppers Bell or Sweet", "Vegetable", R.drawable.bell_or_sweet_peppers));
        foodList.add(new Food("Peppers Hot", "Vegetable", R.drawable.hot_peppers));
        foodList.add(new Food("Pimientos", "Vegetable", R.drawable.pimientos));
        foodList.add(new Food("Potatoes New Irish", "Vegetable", R.drawable.new_irish_potatoes));
        foodList.add(new Food("Potatoes Sweet", "Vegetable", R.drawable.sweet_potatoes));
        foodList.add(new Food("Pumpkin", "Vegetable", R.drawable.pumpkin));
        foodList.add(new Food("Rhubarb", "Vegetable", R.drawable.rhubarb));
        foodList.add(new Food("Rutabagas", "Vegetable", R.drawable.rutabagas));
        foodList.add(new Food("Squash Summer", "Vegetable", R.drawable.summer_squash));
        foodList.add(new Food("Squash Winter", "Vegetable", R.drawable.winter_squash));
        foodList.add(new Food("Tomatoes", "Vegetable", R.drawable.tomatoes));
        foodList.add(new Food("Tomatoes Green", "Vegetable", R.drawable.green_tomatoes));
        foodList.add(new Food("Turnips or Parsnips", "Vegetable", R.drawable.turnips_or_parsnips));
        foodList.add(new Food("Zucchini", "Vegetable", R.drawable.zucchini));
        foodList.add(new Food("Apples", "Fruit", R.drawable.apples));
        foodList.add(new Food("Apricots", "Fruit", R.drawable.apricots));
        foodList.add(new Food("Avocados", "Fruit", R.drawable.avocados));
        foodList.add(new Food("Banana", "Fruit", R.drawable.banana));
        foodList.add(new Food("Berries", "Fruit", R.drawable.berries));
        foodList.add(new Food("Cherries", "Fruit", R.drawable.cherries));
        foodList.add(new Food("Chokecherries", "Fruit", R.drawable.chokecherries));
        foodList.add(new Food("Citrus Fruits", "Fruit", R.drawable.citrus_fruits));
        foodList.add(new Food("Crabapple", "Fruit", R.drawable.crabapple));
        foodList.add(new Food("Currants Figs", "Fruit", R.drawable.currants_figs));
        foodList.add(new Food("Grapes", "Fruit", R.drawable.grapes));
        foodList.add(new Food("Melons", "Fruit", R.drawable.melons));
        foodList.add(new Food("Mint", "Fruit", R.drawable.mint));
        foodList.add(new Food("Peaches", "Fruit", R.drawable.peaches));
        foodList.add(new Food("Pears", "Fruit", R.drawable.pears));
        foodList.add(new Food("Pineapples", "Fruit", R.drawable.pineapple));
        foodList.add(new Food("Plums", "Fruit", R.drawable.plums));
        foodList.add(new Food("Quince", "Fruit", R.drawable.quince));
        foodList.add(new Food("Rhubarb", "Fruit", R.drawable.rhubarb));
        foodList.add(new Food("Strawberries", "Fruit", R.drawable.strawberries));
        foodList.add(new Food("Chicken", "Meat", R.drawable.chicken));

        Intent intent = getIntent();
        Bundle bundle = getIntent().getExtras();
        String type = bundle.getString("type");
        int position = intent.getIntExtra("position", 0);
        int image = intent.getIntExtra("image", 0);

        foodImage = findViewById(R.id.food_image);
        name = findViewById(R.id.food_name);

        if(type.toLowerCase().equals("vegetable"))
            foodName = foodList.get(position).getFoodName();
        if(type.toLowerCase().equals("fruit"))
            foodName = foodList.get(position + 39).getFoodName();
        if(type.toLowerCase().equals("meat"))
            foodName = foodList.get(position + 59).getFoodName();

        name.setText(foodName);
        foodImage.setImageResource(image);
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