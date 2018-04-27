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
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //create arralist
        //ArrayList<String> myList= new ArrayList<String>();
        ArrayList<Word> myList = new ArrayList<Word>();

        myList.add(new Word("Where are you going?", "minto wuksus"));
        myList.add(new Word("What is your name?", "tinnә oyaase'nә"));
        myList.add(new Word("My name is...", "oyaaset..."));
        myList.add(new Word("How are you feeling?", "michәksәs?"));
        myList.add(new Word("I’m feeling good.", "kuchi achit"));
        myList.add(new Word("Are you coming?", "әәnәs'aa?"));
        myList.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        myList.add(new Word("I’m coming.", "әәnәm"));
        myList.add(new Word("Let’s go.", "yoowutis"));
        myList.add(new Word("Come here.", "әnni'nem"));
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
        myArrayAdapter myAdapter = new myArrayAdapter(this,myList,R.color.category_phrases);
        ListView myview = (ListView) findViewById(R.id.idnumericlist);
        myview.setAdapter(myAdapter);
        Log.v("NumbersActivity",  "List0: " + myList.get(0) );
        Log.v("NumbersActivity",  "List1: " + myList.get(1) );
        //


    }
}
