package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class myArrayAdapter extends ArrayAdapter<Word> {
    private int backcolor;
    public myArrayAdapter(@NonNull Context context, ArrayList<Word> words, int backcolor) {
        super(context, 0, words);
        this.backcolor = backcolor;
    }

    public myArrayAdapter(@NonNull Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent)
    {
        // Get the data item for this position
        Word mywords=getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
       if (convertView == null) {
           convertView = LayoutInflater.from(getContext()).inflate(R.layout.mycostumview, parent, false);
        }

        // lookup view for ...
        TextView tFaris = (TextView)  convertView.findViewById(R.id.idpersianword);
        tFaris.setText(mywords.getFarsiWord());

        TextView tEng = (TextView)  convertView.findViewById(R.id.idenglishword);
        tEng.setText(mywords.getEnglishWord());

        ImageView tImage = (ImageView) convertView.findViewById(R.id.idIcon);
        if (mywords.hasImage()==1) {
            tImage.setImageResource(mywords.getmImageResourceID());
            tImage.setVisibility(View.VISIBLE);
        }
        else{
            tImage.setVisibility(View.GONE);
        }
        //change background color
        View textContainer = convertView.findViewById(R.id.idTextBackColor);
        int color = ContextCompat.getColor(getContext(),backcolor);
        textContainer.setBackgroundColor(color);

        return convertView;
    }
}
