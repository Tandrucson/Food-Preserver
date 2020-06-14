package com.example.food_preserver;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {
/*
    //global variables for recyclerview
    RecyclerView recyclerView;
    String s1[], s2[];
    int images[] = {R.drawable.apples, R.drawable.apricots, R.drawable.avocados,R.drawable.banana, R.drawable.berries, R.drawable.cherries, R.drawable.chokecherries,
            R.drawable.citrus_fruits, R.drawable.crabapple, R.drawable.currants_figs, R.drawable.grapes, R.drawable.melons, R.drawable.mint, R.drawable.peaches,
            R.drawable.pears, R.drawable.pineapple, R.drawable.plums, R.drawable.quince, R.drawable.rhubarb,R.drawable.strawberries};
*/
    RecyclerView recyclerView;
    List<Food> fruitsList;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FirstFragment() {

        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FirstFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FirstFragment newInstance(String param1, String param2) {
        FirstFragment fragment = new FirstFragment();
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
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        fruitsList = new ArrayList<>();

        //recyclerview implementation in fragment
        recyclerView = view.findViewById(R.id.recyclerView_FirstFragment);
        MyAdapter myAdapter = new MyAdapter(fruitsList);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        // add fruit items into the arrayList
        fruitsList.add(new Food("Apples", "", R.drawable.apples));
        fruitsList.add(new Food("Apricots", "", R.drawable.apricots));
        fruitsList.add(new Food("Avocados", "", R.drawable.avocados));
        fruitsList.add(new Food("Banana", "", R.drawable.banana));
        fruitsList.add(new Food("Berries", "", R.drawable.berries));
        fruitsList.add(new Food("Cherries", "", R.drawable.cherries));
        fruitsList.add(new Food("Chokecherries", "", R.drawable.chokecherries));
        fruitsList.add(new Food("Citrus Fruits", "", R.drawable.citrus_fruits));
        fruitsList.add(new Food("Crabapple", "", R.drawable.crabapple));
        fruitsList.add(new Food("Currants Figs", "", R.drawable.currants_figs));
        fruitsList.add(new Food("Grapes", "", R.drawable.grapes));
        fruitsList.add(new Food("Melons", "", R.drawable.melons));
        fruitsList.add(new Food("Mint", "", R.drawable.mint));
        fruitsList.add(new Food("Peaches", "", R.drawable.peaches));
        fruitsList.add(new Food("Pears", "", R.drawable.pears));
        fruitsList.add(new Food("Pineapples", "", R.drawable.pineapple));
        fruitsList.add(new Food("Plums", "", R.drawable.plums));
        fruitsList.add(new Food("Quince", "", R.drawable.quince));
        fruitsList.add(new Food("Rhubarb", "", R.drawable.rhubarb));
        fruitsList.add(new Food("Strawberries", "", R.drawable.strawberries));





        return view;

    }
}
