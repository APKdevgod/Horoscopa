package com.example.minlay.zodiac;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ZodiacAdapter extends ArrayAdapter<Zodiac>{

    public ZodiacAdapter(Context context, ArrayList zodiacList){
        super(context,R.layout.row_layout,zodiacList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Zodiac zodiac = getItem(position);
        if(convertView == null){
            convertView =  LayoutInflater.from(getContext()).inflate(R.layout.row_layout, parent, false);
        }
        TextView textView = convertView.findViewById(R.id.textView);
        TextView textView2 = convertView.findViewById(R.id.textView2);
        ImageView imgView = convertView.findViewById(R.id.imageView);

        imgView.setImageResource((int)zodiac.pic);
        textView.setText(zodiac.name);
        textView2.setText(zodiac.date);



        return convertView;
    }
}
