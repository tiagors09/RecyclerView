package br.com.tiagors09.recyclerview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import br.com.tiagors09.recyclerview.R;
import br.com.tiagors09.recyclerview.activity.adapter.Adapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.recyclerView = findViewById(R.id.recyclerViewFilmes);

        // Configurar adapter
        Adapter adapter = new Adapter();

        // Configurar RecyclerView
        // Criando LayoutManager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        // Settando LayoutManager
        recyclerView.setLayoutManager(layoutManager);
        // Define verdadeiro para um tamanho fixo de itens que irão aparecer na RecyclerView
        recyclerView.setHasFixedSize(true);
        // Settando adapter
        recyclerView.setAdapter(adapter);
    }
}