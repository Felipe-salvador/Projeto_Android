package com.example.srbaguete.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.srbaguete.R;
import com.example.srbaguete.adapter.PostagemAdapter;
import com.example.srbaguete.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getWindow().setStatusBarColor(this.getResources().getColor(R.color.black));

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        //Para separar por colunas do lado da outra
        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);

        //Define adapter
        prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter( postagens );
        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagens(){
        Postagem p = new Postagem("SMASH", "#sanduiche", R.drawable.smash2);
        this.postagens.add(p);

        p = new Postagem("PSG BURGER", "#O melhor", R.drawable.psg2);
        this.postagens.add(p);

        p = new Postagem("NANTES BURGER", "#Irresistível", R.drawable.nantes);
        this.postagens.add(p);

        p = new Postagem("DIJON", "#Preferido", R.drawable.dijon2);
        this.postagens.add(p);
    }
}