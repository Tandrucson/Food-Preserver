package com.example.food_preserver;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

        vegetablesList = new ArrayList<>();

        //recyclerview implementation in fragment
        recyclerView = view.findViewById(R.id.recyclerView_SecondFragment);

        MyAdapter myAdapter = new MyAdapter(vegetablesList);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        vegetablesList.add(new Food("Artichokes", "", R.drawable.artichokes));
        vegetablesList.add(new Food("Asparagus", "", R.drawable.asparagus));
        vegetablesList.add(new Food("Beans: Green, Snap, or Wax", "", R.drawable.beans_green_snap_or_wax));
        vegetablesList.add(new Food("Beans: Lima, Butter, or Pinto", "", R.drawable.beans_lima));
        vegetablesList.add(new Food("Beets", "", R.drawable.beets));
        vegetablesList.add(new Food("Broccoli", "", R.drawable.broccoli));
        vegetablesList.add(new Food("Brussel Sprouts", "", R.drawable.brussel_sprouts));
        vegetablesList.add(new Food("Cabbage or Chinese Cabbage", "", R.drawable.cabbage_or_chinese_cabbage));
        vegetablesList.add(new Food("Carrots", "", R.drawable.carrots));
        vegetablesList.add(new Food("Cauliflower", "", R.drawable.cauliflower));
        vegetablesList.add(new Food("Celery", "", R.drawable.celery));
        vegetablesList.add(new Food("Corn", "", R.drawable.corn));
        vegetablesList.add(new Food("Cucumbers", "", R.drawable.cucumbers));
        vegetablesList.add(new Food("Eggplant", "", R.drawable.eggplant));
        vegetablesList.add(new Food("Garlic-in-Oil", "", R.drawable.garlic_in_oil));
        vegetablesList.add(new Food("Greens (including Spinach)", "", R.drawable.greens_including_spinach));
        vegetablesList.add(new Food("Fresh Herbs", "", R.drawable.fresh_herbs));
        vegetablesList.add(new Food("Horseradish", "", R.drawable.horseradish));
        vegetablesList.add(new Food("Kohlrabi", "", R.drawable.kohlrabi));
        vegetablesList.add(new Food("Mushrooms", "", R.drawable.mushrooms));
        vegetablesList.add(new Food("Okra", "", R.drawable.okra));
        vegetablesList.add(new Food("Onions", "", R.drawable.onions));
        vegetablesList.add(new Food("Peas Blackeye or Field", "", R.drawable.blackeye_or_field_peas));
        vegetablesList.add(new Food("Peas Green", "", R.drawable.green_peas));
        vegetablesList.add(new Food("Peas Pods Edible (Sugar, Chinese, Snow Peas or Sugar Snap Peas)", "", R.drawable.peas_pods));
        vegetablesList.add(new Food("Peppers Bell or Sweet", "", R.drawable.bell_or_sweet_peppers));
        vegetablesList.add(new Food("Peppers Hot", "", R.drawable.hot_peppers));
        vegetablesList.add(new Food("Pimientos", "", R.drawable.pimientos));
        vegetablesList.add(new Food("Potatoes New Irish", "", R.drawable.new_irish_potatoes));
        vegetablesList.add(new Food("Potatoes Sweet", "", R.drawable.sweet_potatoes));
        vegetablesList.add(new Food("Pumpkin", "", R.drawable.pumpkin));
        vegetablesList.add(new Food("Rhubarb", "", R.drawable.rhubarb));
        vegetablesList.add(new Food("Rutabagas", "", R.drawable.rutabagas));
        vegetablesList.add(new Food("Squash Summer", "", R.drawable.summer_squash));
        vegetablesList.add(new Food("Squash Winter", "", R.drawable.winter_squash));
        vegetablesList.add(new Food("Tomatoes", "", R.drawable.tomatoes));
        vegetablesList.add(new Food("Tomatoes Green", "", R.drawable.green_tomatoes));
        vegetablesList.add(new Food("Turnips or Parsnips", "", R.drawable.turnips_or_parsnips));
        vegetablesList.add(new Food("Zucchini", "", R.drawable.zucchini));






        return view;
    }
}