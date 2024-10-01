package com.example.recycler;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        ArrayList<Groups> listGroups = new ArrayList<Groups>();
        listGroups.add(new Groups("Котик", R.drawable.kotik, "ЫЫЫЫЫ КОТИК ЫЫЫЫЫ"));
        listGroups.add(new Groups("Задрот", R.drawable.zadrot, "О САЩА БАБСКИЙ"));
        listGroups.add(new Groups("Обезьяна", R.drawable.obez, "Мурашов до первой эволюции"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new RecyclerAdapter(this, listGroups));

    }
}