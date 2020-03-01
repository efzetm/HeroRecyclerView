package com.example.herorecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import static java.util.Collections.addAll;


public class MainActivity extends AppCompatActivity {

    private RecyclerView rvHero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHero = findViewById(R.id.aktivitimain);
        rvHero.setHasFixedSize(true);
        addAll(HeroesData.getHeroList());

        showRecyclerList();



    }

    private void showRecyclerList() {
        rvHero.setLayoutManager(new LinearLayoutManager(this));
        HeroesAdapter heroesAdapter = new HeroesAdapter(HeroesData.getHeroList(),getApplicationContext());
        rvHero.setLayoutManager(new LinearLayoutManager(this));
        rvHero.setAdapter(heroesAdapter);

    }
}