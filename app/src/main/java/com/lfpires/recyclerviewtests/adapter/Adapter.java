package com.lfpires.recyclerviewtests.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lfpires.recyclerviewtests.R;
import com.lfpires.recyclerviewtests.model.Filmes;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Filmes> listaFilmes;

    public Adapter(List<Filmes> lista) {
        this.listaFilmes = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemListaFilmes = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.adapter_lista_filmes, parent, false);

        return new MyViewHolder(itemListaFilmes);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Filmes filme = listaFilmes.get(position);

        holder.titulo.setText(filme.getTitulo());
        holder.ano    .setText(filme.getAno());
        holder.genero.setText(filme.getTitulo());

    }

    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView titulo, genero, ano;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.textTitulo);
            genero = itemView.findViewById(R.id.textGenero);
            ano    = itemView.findViewById(R.id.textAno);

        }
    }
}
