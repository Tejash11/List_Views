package com.example.list_views;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    String name[] = {"Soumen Paul", "Bappa Paul", "Varun Paul"};
    String des[] =  {"Soumen Paul", "Bappa Paul", "Varun Paul"};
    int images[] = {R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,R.drawable.ic_launcher_background};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.parent_list_view);
        myadapter adapter = new myadapter(getApplicationContext(),name,des,images);
        lv.setAdapter(adapter);


    }


    class myadapter extends ArrayAdapter<String>
    {
        Context context;
        String name[];
        String des[];
        int images[];

        myadapter(Context context, String name[], String des[], int image[])
        {
            super(context, R.layout.single_row, R.id.text1, name);

            this.context = context;
            this.name = name;
            this.des = des;
            this.images = image;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater inflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.single_row, parent, false);

            ImageView image = row.findViewById(R.id.image);
            TextView nametext = row.findViewById(R.id.text1);
            TextView destext = row.findViewById(R.id.text2);

            image.setImageResource(images[position]);
            nametext.setText(name[position]);
            destext.setText(des[position]);

            return row;

        }
    }


}