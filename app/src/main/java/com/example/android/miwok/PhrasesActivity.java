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

        myList.add(new Word("salam","Hello"));
        myList.add(new Word("doo","two"));
        myList.add(new Word("seh","three"));
        myList.add(new Word("doo","four"));
        myList.add(new Word("doo","five"));
        myList.add(new Word("doo","six"));
        myList.add(new Word("doo","seven"));
        myList.add(new Word("doo","eight"));
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
        myArrayAdapter myAdapter = new myArrayAdapter(this,myList);
        ListView myview = (ListView) findViewById(R.id.idnumericlist);
        myview.setAdapter(myAdapter);
        Log.v("NumbersActivity",  "List0: " + myList.get(0) );
        Log.v("NumbersActivity",  "List1: " + myList.get(1) );
        //


    }
}
