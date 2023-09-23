package br.com.tiagors09.recyclerview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import br.com.tiagors09.recyclerview.R;
import br.com.tiagors09.recyclerview.activity.adapter.Adapter;
import br.com.tiagors09.recyclerview.activity.model.Filme;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Filme> filmes = new ArrayList<Filme>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.recyclerView = findViewById(R.id.recyclerViewFilmes);

        this.criarFilmes();

        // Configurar adapter
        Adapter adapter = new Adapter(filmes);

        // Configurar RecyclerView
        // Criando LayoutManager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        // Settando LayoutManager
        recyclerView.setLayoutManager(layoutManager);
        // Define verdadeiro para um tamanho fixo de itens que irão aparecer na RecyclerView
        recyclerView.setHasFixedSize(true);
        // Configurando um divider
        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayout.VERTICAL));
        // Settando adapter
        recyclerView.setAdapter(adapter);
    }

    public void criarFilmes() {
        Filme filme1 = new Filme("Matrix", "Ficção Científica", "1999");
        filmes.add(filme1);

        Filme filme2 = new Filme("O Senhor dos Anéis: A Sociedade do Anel", "Fantasia", "2001");
        filmes.add(filme2);

        Filme filme3 = new Filme("Gladiador", "Ação", "2000");
        filmes.add(filme3);

        Filme filme4 = new Filme("Pulp Fiction", "Crime", "1994");
        filmes.add(filme4);

        Filme filme5 = new Filme("Titanic", "Romance", "1997");
        filmes.add(filme5);

        Filme filme6 = new Filme("Interestelar", "Ficção Científica", "2014");
        filmes.add(filme6);

        Filme filme7 = new Filme("Pantera Negra", "Ação", "2018");
        filmes.add(filme7);

        Filme filme8 = new Filme("A Origem", "Ficção Científica", "2010");
        filmes.add(filme8);

        Filme filme9 = new Filme("Forrest Gump", "Drama", "1994");
        filmes.add(filme9);

        Filme filme10 = new Filme("Jurassic Park", "Aventura", "1993");
        filmes.add(filme10);
    }
}