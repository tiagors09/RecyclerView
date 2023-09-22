package br.com.tiagors09.recyclerview.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import br.com.tiagors09.recyclerview.R;

// Criei um adapter Adapter que extende Adapter
// que é uma classe interna de RecyclerView e ela necessita que um tipo genérico
// que é o Adapter.MyViewHolder que foi criado internamente em Adapter
public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    // Chamado para criar as vizualizações
    @NonNull
    @Override
    // parent: Um objeto ViewGroup que representa o grupo de views pai onde a nova view será anexada.
    // viewType: Um inteiro que pode ser usado para determinar qual tipo de view deve ser criado com
    // base no tipo de dado que você está exibindo.
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Ele vai inflar o itemLista com o contexto do pai dele
        // vai usar layout criado e passar o parent como root
        // mas não vai adicionar ele automaticamente para realizar outras operações
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista, parent, false);

        return new MyViewHolder(itemLista);
    }

    // configura os atributos do Holder (MyViewHolder)
    // pode pegar os dados de uma lista
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.titulo.setText("Titulo de teste");
        holder.genero.setText("Gereno de teste");
        holder.ano.setText("Ano teste");
    }

    // número de items que vão ser exibidos
    @Override
    public int getItemCount() {
        return 5;
    }

    // Classe interna que é o Holder do adapter
    public class MyViewHolder extends RecyclerView.ViewHolder {
        // informações que serão exibidas
        TextView titulo;
        TextView ano;
        TextView genero;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            this.titulo = itemView.findViewById(R.id.textTitulo);
            this.ano = itemView.findViewById(R.id.textAno);
            this.genero = itemView.findViewById(R.id.textGenero);
        }
    }
}
