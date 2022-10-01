package com.example.ListViewExample;

import android.annotation.SuppressLint;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.week2.R;


public class ArrayAdapterActivity extends ListActivity {
    static final String[] Animals = new String[]{"Ant", "Bear", "Bird", "Cat", "Dog", "Donkey", "Elephant", "Giraffe", "Goat",
            "Monkey", "Pig", "Rat", "Snake", "Spider"};

    Button btnArrayAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //(setContentView(R.layout.activity_array_adapter);
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_array_adapter,Animals));

        ListView listView = getListView();
        listView.setTextFilterEnabled(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),((TextView) view).getText(), Toast.LENGTH_SHORT).show();

            }
        });
    }


}