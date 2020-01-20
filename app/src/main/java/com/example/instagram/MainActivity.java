package com.example.instagram;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.valueOf;

public class MainActivity extends AppCompatActivity {

    ImageButton mystory, friend1, friend2, friend3, friend4, more;

    ArrayList<Person> personList = new ArrayList<>();

    ListView lvPersonList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final PersonAdapter personAdapter = new PersonAdapter(personList, this);
        lvPersonList = findViewById(R.id.person_list);

        for (int i = 0; i < 3; i++) {
            personList.add(new Person("friend1", "서울", "좋아요 3개", "friend1", "여행을 다녀왔어요!", ContextCompat.getDrawable(this, R.drawable.b), ContextCompat.getDrawable(this, R.drawable.a)));
            personList.add(new Person("friend2", "부산", "좋아요 4개", "friend2", "신나요!", ContextCompat.getDrawable(this, R.drawable.c), ContextCompat.getDrawable(this, R.drawable.b)));
            personList.add(new Person("friend3", "광주", "좋아요 2개", "friend3", "어디갈까요!", ContextCompat.getDrawable(this, R.drawable.d), ContextCompat.getDrawable(this, R.drawable.c)));
            personList.add(new Person("friend4", "대전", "좋아요 10개", "friend4", "즐거워요!", ContextCompat.getDrawable(this, R.drawable.e), ContextCompat.getDrawable(this, R.drawable.d)));
        }

        lvPersonList.setAdapter(personAdapter);

        mystory = findViewById(R.id.mystory);
        mystory.setBackground(new ShapeDrawable(new OvalShape()));
        mystory.setClipToOutline(true);
        friend1 = findViewById(R.id.friend1story);
        friend1.setBackground(new ShapeDrawable(new OvalShape()));
        friend1.setClipToOutline(true);
        friend2 = findViewById(R.id.friend2story);
        friend2.setBackground(new ShapeDrawable(new OvalShape()));
        friend2.setClipToOutline(true);
        friend3 = findViewById(R.id.friend3story);
        friend3.setBackground(new ShapeDrawable(new OvalShape()));
        friend3.setClipToOutline(true);
        friend4 = findViewById(R.id.friend4story);
        friend4.setBackground(new ShapeDrawable(new OvalShape()));
        friend4.setClipToOutline(true);

    }
}
