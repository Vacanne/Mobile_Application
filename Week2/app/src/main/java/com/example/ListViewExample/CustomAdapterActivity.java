package com.example.ListViewExample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.week2.R;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {
    Button btnCustomAdapter;
    final List<Animal> animals = new ArrayList<Animal>();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);
        animals.add(new Animal("Ant", R.mipmap.bear));
        animals.add(new Animal("Bear", R.mipmap.bear));
        animals.add(new Animal("Bird", R.mipmap.bear));
        animals.add(new Animal("Cat", R.mipmap.bear));
        animals.add(new Animal("Dog", R.mipmap.bear));

        final ListView listView= (ListView) findViewById(R.id.listview);
        AnimalAdapter adapter = new AnimalAdapter(this, animals);
        listView.setAdapter(adapter);


        };
    }
