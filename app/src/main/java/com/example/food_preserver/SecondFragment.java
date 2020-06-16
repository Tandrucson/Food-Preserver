package com.example.food_preserver;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SecondFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecondFragment extends Fragment {
/*
    String s1[], s2[];
    int images[] = {R.drawable.ic_carrot, R.drawable.ic_fruit, R.drawable.ic_meat,
    R.drawable.ic_carrot, R.drawable.ic_fruit, R.drawable.ic_meat, R.drawable.ic_meat,
    R.drawable.ic_carrot, R.drawable.ic_fruit, R.drawable.ic_meat};
*/

    RecyclerView recyclerView;
    List<Food> vegetablesList;

    ArrayList<Food> foodList = new ArrayList<>();
    Food foods;
    int imageURI;
    Activity act;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SecondFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SecondFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SecondFragment newInstance(String param1, String param2) {
        SecondFragment fragment = new SecondFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        //vegetablesList = new ArrayList<>();

        act = getActivity();

        try {
            InputStream inputStream = getActivity().getAssets().open("veg.xml");
            XmlPullParserFactory parserFactory = XmlPullParserFactory.newInstance();
            XmlPullParser parser = parserFactory.newPullParser();
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES,false);
            parser.setInput(inputStream,null);
            String tag = "" , text = "";
            int event = parser.getEventType();
            while (event!= XmlPullParser.END_DOCUMENT){
                tag = parser.getName();
                switch (event) {
                    case XmlPullParser.START_TAG:
                        if(tag.equals("Food"))
                            foods = new Food();
                        break;
                    case XmlPullParser.TEXT:
                        text=parser.getText();
                        break;
                    case XmlPullParser.END_TAG:
                        switch (tag) {
                            case "name": foods.setName(text);
                                break;
                            case "image": foods.setImageURL(text);
                                imageURI = act.getResources().getIdentifier(text, "drawable", act.getPackageName());
                                foods.setImage(imageURI);
                                break;
                            case "type": foods.setType(text);
                                break;
                            case "Food":
                                if(foods!=null)
                                    foodList.add(foods);
                                break;
                        }
                        break;
                }
                event = parser.next();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }

        //recyclerview implementation in fragment
        recyclerView = view.findViewById(R.id.recyclerView_SecondFragment);

        MyAdapter myAdapter = new MyAdapter(getContext(), foodList);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        //38 vegetables
//        vegetablesList.add(new Food("Artichokes", "Vegetable", R.drawable.artichokes));
//        vegetablesList.add(new Food("Asparagus", "Vegetable", R.drawable.asparagus));
//        vegetablesList.add(new Food("Beans: Green, Snap, or Wax", "Vegetable", R.drawable.beans_green_snap_or_wax));
//        vegetablesList.add(new Food("Beans: Lima, Butter, or Pinto", "Vegetable", R.drawable.beans_lima));
//        vegetablesList.add(new Food("Beets", "Vegetable", R.drawable.beets));
//        vegetablesList.add(new Food("Broccoli", "Vegetable", R.drawable.broccoli));
//        vegetablesList.add(new Food("Brussel Sprouts", "Vegetable", R.drawable.brussel_sprouts));
//        vegetablesList.add(new Food("Cabbage or Chinese Cabbage", "Vegetable", R.drawable.cabbage_or_chinese_cabbage));
//        vegetablesList.add(new Food("Carrots", "Vegetable", R.drawable.carrots));
//        vegetablesList.add(new Food("Cauliflower", "Vegetable", R.drawable.cauliflower));
//        vegetablesList.add(new Food("Celery", "Vegetable", R.drawable.celery));
//        vegetablesList.add(new Food("Corn", "Vegetable", R.drawable.corn));
//        vegetablesList.add(new Food("Cucumbers", "Vegetable", R.drawable.cucumbers));
//        vegetablesList.add(new Food("Eggplant", "Vegetable", R.drawable.eggplant));
//        vegetablesList.add(new Food("Garlic-in-Oil", "Vegetable", R.drawable.garlic_in_oil));
//        vegetablesList.add(new Food("Greens (including Spinach)", "Vegetable", R.drawable.greens_including_spinach));
//        vegetablesList.add(new Food("Fresh Herbs", "Vegetable", R.drawable.fresh_herbs));
//        vegetablesList.add(new Food("Horseradish", "Vegetable", R.drawable.horseradish));
//        vegetablesList.add(new Food("Kohlrabi", "Vegetable", R.drawable.kohlrabi));
//        vegetablesList.add(new Food("Mushrooms", "Vegetable", R.drawable.mushrooms));
//        vegetablesList.add(new Food("Okra", "Vegetable", R.drawable.okra));
//        vegetablesList.add(new Food("Onions", "Vegetable", R.drawable.onions));
//        vegetablesList.add(new Food("Peas Blackeye or Field", "Vegetable", R.drawable.blackeye_or_field_peas));
//        vegetablesList.add(new Food("Peas Green", "Vegetable", R.drawable.green_peas));
//        vegetablesList.add(new Food("Peas Pods Edible (Sugar, Chinese, Snow Peas or Sugar Snap Peas)", "Vegetable", R.drawable.peas_pods));
//        vegetablesList.add(new Food("Peppers Bell or Sweet", "Vegetable", R.drawable.bell_or_sweet_peppers));
//        vegetablesList.add(new Food("Peppers Hot", "Vegetable", R.drawable.hot_peppers));
//        vegetablesList.add(new Food("Pimientos", "Vegetable", R.drawable.pimientos));
//        vegetablesList.add(new Food("Potatoes New Irish", "Vegetable", R.drawable.new_irish_potatoes));
//        vegetablesList.add(new Food("Potatoes Sweet", "Vegetable", R.drawable.sweet_potatoes));
//        vegetablesList.add(new Food("Pumpkin", "Vegetable", R.drawable.pumpkin));
//        vegetablesList.add(new Food("Rhubarb", "Vegetable", R.drawable.rhubarb));
//        vegetablesList.add(new Food("Rutabagas", "Vegetable", R.drawable.rutabagas));
//        vegetablesList.add(new Food("Squash Summer", "Vegetable", R.drawable.summer_squash));
//        vegetablesList.add(new Food("Squash Winter", "Vegetable", R.drawable.winter_squash));
//        vegetablesList.add(new Food("Tomatoes", "Vegetable", R.drawable.tomatoes));
//        vegetablesList.add(new Food("Tomatoes Green", "Vegetable", R.drawable.green_tomatoes));
//        vegetablesList.add(new Food("Turnips or Parsnips", "Vegetable", R.drawable.turnips_or_parsnips));
//        vegetablesList.add(new Food("Zucchini", "Vegetable", R.drawable.zucchini));

        return view;
    }
}