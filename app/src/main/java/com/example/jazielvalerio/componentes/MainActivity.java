package com.example.jazielvalerio.componentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lista = (ListView) findViewById(R.id.lvEquipes);
        final ArrayList<String> equipes = preencherDados();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, equipes );
        lista.setAdapter(arrayAdapter);
        lista.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Equipe:" + equipes.get(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private ArrayList<String> preencherDados() {
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Chamando Chuva");
        dados.add("Erro 404");
        dados.add("Cervejetariano");
        dados.add("Turma do Asilo");
        dados.add("Area 51");
        return dados;
    }
}
