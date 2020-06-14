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
 * Use the {@link ThirdFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ThirdFragment extends Fragment {
/*
    //global variables for recyclerview

    String s1[], s2[];
    int images[] = {R.drawable.ic_carrot, R.drawable.ic_fruit, R.drawable.ic_meat,R.drawable.ic_carrot, R.drawable.ic_fruit, R.drawable.ic_meat, R.drawable.ic_meat,R.drawable.ic_carrot, R.drawable.ic_fruit, R.drawable.ic_meat};
*/

    RecyclerView recyclerView;
    List<Food> meatsList;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ThirdFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ThirdFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ThirdFragment newInstance(String param1, String param2) {
        ThirdFragment fragment = new ThirdFragment();
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
        View view = inflater.inflate(R.layout.fragment_third, container, false);

        meatsList = new ArrayList<>();

        //recyclerview implementation in fragment
        recyclerView = view.findViewById(R.id.recyclerView_ThirdFragment);

        MyAdapter myAdapter = new MyAdapter(getContext(), meatsList);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        meatsList.add(new Food("chicken", "chicken", R.drawable.chicken));
        meatsList.add(new Food("chicken", "chicken", R.drawable.chicken));
        meatsList.add(new Food("chicken", "chicken", R.drawable.chicken));

        return view;

    }
}
