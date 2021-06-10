package com.lfpires.recyclerviewtests.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

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
        Adapter adapter = new Adapter(listaFilmes);

        // Configurações RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerviewfilmes.setLayoutManager(layoutManager);
        recyclerviewfilmes.setHasFixedSize(true); // Indicação do Google para tornar o layout melhor otimizado
        recyclerviewfilmes.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayout.VERTICAL));
        recyclerviewfilmes.setAdapter(adapter);

    }

    public void criarFilmes(){

        for (int x = 0; x < 20; x++){
            Filmes filme = new Filmes("Filme " + (x + 1), "Ano " + (x + 1), "Genero " + (x + 1));
            this.listaFilmes.add(filme);
        }

    }

}
