package com.example.instagram;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class HideFolerActivity extends AppCompatActivity {

    ImageButton mystory, friend1, friend2, friend3, friend4, more;

    ArrayList<Person> personList = new ArrayList<>();

    ListView lvPersonList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hide_folder);

        final PersonAdapter personAdapter = new PersonAdapter(personList, this);
        lvPersonList = findViewById(R.id.person_list);

        lvPersonList.setAdapter(personAdapter);

    }
}
