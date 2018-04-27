/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create arralist
        //ArrayList<String> myList= new ArrayList<String>();
        ArrayList<Word> myList = new ArrayList<Word>();

        myList.add(new Word("red", "weṭeṭṭi", R.drawable.color_red));
        myList.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));
        myList.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        myList.add(new Word("green", "chokokki", R.drawable.color_green));
        myList.add(new Word("brown", "ṭakaakki", R.drawable.color_brown));
        myList.add(new Word("gray", "ṭopoppi", R.drawable.color_gray));
        myList.add(new Word("black", "kululli", R.drawable.color_black));
        myList.add(new Word("white", "kelelli", R.drawable.color_white));
            /*
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myList);
        ListView myListView = (ListView) findViewById(R.id.idrootLayout);
        myListView.setAdapter(myAdapter);
        */

//        LinearLayout nrootview = (LinearLayout) findViewById(R.id.idrootLayout);w
//        for (int x=0; x<myList.size(); ++x )
//        {
//            TextView listview = new TextView(this);
//            listview.setText(myList.get(x));
//            nrootview.addView(listview);
//        }
        myArrayAdapter myAdapter = new myArrayAdapter(this,myList,R.color.category_colors);
        ListView myview = (ListView) findViewById(R.id.idnumericlist);
        myview.setAdapter(myAdapter);
        Log.v("NumbersActivity",  "List0: " + myList.get(0) );
        Log.v("NumbersActivity",  "List1: " + myList.get(1) );
        //


    }
}
