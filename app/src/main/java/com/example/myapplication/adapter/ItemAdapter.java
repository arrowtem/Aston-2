package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.myapplication.Country;
import com.example.myapplication.DataCountry;
import com.example.myapplication.R;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder>{

    private ArrayList<Country> data;
    private final LayoutInflater inflater;
    public ItemAdapter(Context context, ArrayList<Country> data){

        this.data = data;
        inflater = LayoutInflater.from(context);
    }
   public static class ViewHolder extends RecyclerView.ViewHolder{
        final TextView textView;
        final ImageView imageView;

        public ViewHolder(@NonNull View itemView)  {
            super(itemView);
             textView = itemView.findViewById(R.id.countryName);
             imageView =  itemView.findViewById(R.id.countryFlag);
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View adapterLayout = inflater.inflate(R.layout.recycler_item,parent,false);
        return new ViewHolder(adapterLayout);
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Country item = data.get(position);
        holder.imageView.setImageResource(item.countryFlag);
        holder.textView.setText(item.countryName);

    }

    @Override
    public int getItemCount() {
       return new DataCountry().getListOfCountries().size();
    }
}
