package com.example.food_preserver;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> implements Filterable {

     List<Food> foodList;
     List<Food> foodListAll;

     private View.OnClickListener mOnItemClickListener;
     Context context;

    public MyAdapter(Context context, List<Food> foodList) {
    //     context = ct;
    //    data1 = s1;
    //    data2 = s2;
    //    images = img;
        foodListAll = new ArrayList<>(foodList);
        this.foodList = foodList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflator = LayoutInflater.from(parent.getContext());
        View view = inflator.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        holder.mytext1.setText(foodList.get(position).getName());
        holder.mytext2.setText(foodList.get(position).getType());
        holder.myImage.setImageResource(foodList.get(position).getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                String type = foodList.get(position).getType();
                int image = foodList.get(position).getImage();
                final Intent intent;
                intent = new Intent(context, Food_item_instructions.class);
                intent.putExtra("position", position);
                intent.putExtra("type", type);
                intent.putExtra("image", image);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }



    @Override
    public Filter getFilter() {
        return filter;
    }

    Filter filter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {

            List<Food> filteredList = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(foodListAll);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();
                for (Food item : foodListAll) {
                    if (item.getName().toLowerCase().contains(filterPattern)) {
                        filteredList.add(item);
                    }
                }

            }
            FilterResults results = new FilterResults();
            results.values = filteredList;
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
                foodList.clear();
                foodList.addAll((List) results.values);
                notifyDataSetChanged();
        }
    };

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView mytext1, mytext2;
        ImageView myImage;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mytext1 = itemView.findViewById(R.id.myText1);
            mytext2 = itemView.findViewById(R.id.myText2);
            myImage = itemView.findViewById(R.id.myImageView);

            itemView.setTag(this);
            itemView.setOnClickListener(mOnItemClickListener);
        }
    }
}
