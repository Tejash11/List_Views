package com.example.list_views;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewholder extends RecyclerView.ViewHolder{


    TextView name, des;
    ImageView img;

    public viewholder(@NonNull View itemView) {
        super(itemView);

        name = (TextView) itemView.findViewById(R.id.text1);
        des = (TextView) itemView.findViewById(R.id.text2);
        img = (ImageView) itemView.findViewById(R.id.image);

    }
}
