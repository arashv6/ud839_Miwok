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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //create arralist
        //ArrayList<String> myList= new ArrayList<String>();
        ArrayList<Word> myList = new ArrayList<Word>();

        myList.add(new Word("father", "әpә", R.drawable.family_father));
        myList.add(new Word("mother", "әṭa", R.drawable.family_mother));
        myList.add(new Word("son", "angsi", R.drawable.family_son));
        myList.add(new Word("daughter", "tune", R.drawable.family_daughter));
        myList.add(new Word("older brother", "taachi", R.drawable.family_older_brother));
        myList.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother));
        myList.add(new Word("older sister", "teṭe", R.drawable.family_older_sister));
        myList.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister));
        myList.add(new Word("grandmother ", "ama", R.drawable.family_grandmother));
        myList.add(new Word("grandfather", "paapa", R.drawable.family_grandfather));
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
        myArrayAdapter myAdapter = new myArrayAdapter(this,myList,R.color.category_family);
        ListView myview = (ListView) findViewById(R.id.idnumericlist);
        myview.setAdapter(myAdapter);
        Log.v("NumbersActivity",  "List0: " + myList.get(0) );
        Log.v("NumbersActivity",  "List1: " + myList.get(1) );
        //


    }
}
