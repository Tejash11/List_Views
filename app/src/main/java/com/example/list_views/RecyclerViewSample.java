package com.example.list_views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;


public class RecyclerViewSample extends AppCompatActivity {

    RecyclerView rcv;
    ArrayList<info> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        data.add(new info("Soumen", "Android", R.drawable.ic_launcher_background));
        data.add(new info("Soumen", "Android", R.drawable.ic_launcher_background));
        data.add(new info("Soumen", "Android", R.drawable.ic_launcher_background));
        data.add(new info("Soumen", "Android", R.drawable.ic_launcher_background));
        data.add(new info("Soumen", "Android", R.drawable.ic_launcher_background));
        data.add(new info("Soumen", "Android", R.drawable.ic_launcher_background));
        data.add(new info("Soumen", "Android", R.drawable.ic_launcher_background));
        data.add(new info("Soumen", "Android", R.drawable.ic_launcher_background));
        data.add(new info("Soumen", "Android", R.drawable.ic_launcher_background));
        data.add(new info("Soumen", "Android", R.drawable.ic_launcher_background));

        rcv = (RecyclerView) findViewById(R.id.recyclerview);
        rcv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        customadapter adapter = new customadapter(data);
        rcv.setAdapter(adapter);




    }
}