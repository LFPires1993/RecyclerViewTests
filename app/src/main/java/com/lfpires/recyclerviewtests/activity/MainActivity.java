package com.lfpires.recyclerviewtests.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.lfpires.recyclerviewtests.R;
import com.lfpires.recyclerviewtests.adapter.Adapter;
import com.lfpires.recyclerviewtests.model.Filmes;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerviewfilmes;
    private List<Filmes> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerviewfilmes = findViewById(R.id.recyclerViewFilmes);

        // Listagem de Filmes
        this.criarFilmes();

        // Configurações do Adapter
        Adapter adapter = new Adapter();

        // Configurações RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerviewfilmes.setLayoutManager(layoutManager);
        recyclerviewfilmes.setHasFixedSize(true); // Indicação do Google para tornar o layout melhor otimizado
        recyclerviewfilmes.setAdapter(adapter);

    }

    public void criarFilmes(){

    }

}
