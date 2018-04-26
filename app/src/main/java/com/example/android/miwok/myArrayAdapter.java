package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class myArrayAdapter extends ArrayAdapter<Word> {
    public myArrayAdapter(Context context, ArrayList<Word> words)
    {
        super(context,0,words);
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
        TextView tEng = (TextView)  convertView.findViewById(R.id.idenglishword);

        tFaris.setText(mywords.getFarsiWord());
        tEng.setText(mywords.getEnglishWord());

        return convertView;
    }
}
