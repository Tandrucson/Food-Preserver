package com.example.food_preserver;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SecondFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecondFragment extends Fragment {

    RecyclerView recyclerView;
    String s1[], s2[];
    int images[] = {R.drawable.artichokes, R.drawable.asparagus, R.drawable.beans_green_snap_or_wax,R.drawable.beans_lima, R.drawable.beets, R.drawable.broccoli, R.drawable.brussel_sprouts,R.drawable.cabbage_or_chinese_cabbage, R.drawable.carrots, R.drawable.cauliflower,
            R.drawable.celery, R.drawable.corn, R.drawable.cucumbers,R.drawable.eggplant, R.drawable.garlic_in_oil, R.drawable.greens_including_spinach, R.drawable.fresh_herbs,R.drawable.horseradish, R.drawable.kohlrabi, R.drawable.mushrooms,
            R.drawable.okra, R.drawable.onions, R.drawable.blackeye_or_field_peas,R.drawable.green_peas, R.drawable.peas_pods, R.drawable.bell_or_sweet_peppers, R.drawable.hot_peppers,R.drawable.pimientos, R.drawable.new_irish_potatoes, R.drawable.sweet_potatoes,
            R.drawable.pumpkin, R.drawable.rhubarb, R.drawable.rutabagas,R.drawable.summer_squash, R.drawable.winter_squash, R.drawable.tomatoes, R.drawable.green_tomatoes,R.drawable.turnips_or_parsnips, R.drawable.zucchini};


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


        //recyclerview implementation in fragment
        recyclerView = view.findViewById(R.id.recyclerView_SecondFragment);

        s1 = getResources().getStringArray(R.array.vegetables);
        s2 = getResources().getStringArray(R.array.vegetablesDescription);

        MyAdapter myAdapter = new MyAdapter(getActivity(), s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }
}
