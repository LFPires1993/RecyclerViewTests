package com.lfpires.recyclerviewtests.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.lfpires.recyclerviewtests.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerviewfilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerviewfilmes = findViewById(R.id.recyclerViewFilmes);

        // Configurações RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerviewfilmes.setLayoutManager(layoutManager);
        recyclerviewfilmes.setHasFixedSize(true); // Indicação do Google para tornar o layout melhor otimizado
        //recyclerviewfilmes.setAdapter();

    }
}
