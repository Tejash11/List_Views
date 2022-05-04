package com.example.list_views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class customadapter extends RecyclerView.Adapter<viewholder> {

    ArrayList<info> data = new ArrayList<>();

    customadapter(ArrayList<info> data)
    {
        this.data = data;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View row = inflater.inflate(R.layout.single_row, parent, false);
        return new viewholder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {

        holder.des.setText(data.get(position).getDes());
        holder.name.setText(data.get(position).getName());
        holder.img.setImageResource(data.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
