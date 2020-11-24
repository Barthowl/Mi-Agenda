package com.example.agenda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.agenda.model.entity.Persona;
import com.example.agenda.viewmodel.ViewModelActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public TextView tvresult;
    private Button btadd, btborrar, bteditar, btlistar;
    private ViewModelActivity viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = new ViewModelProvider(this,ViewModelProvider.AndroidViewModelFactory.getInstance(this.getApplication())).get(ViewModelActivity.class);
        init();
        }


    private void init() {
        Intent intent = getIntent();
        String valor = intent.getStringExtra("key");
        if(valor != null) {
            if(valor.equals("ID")) {
                viewModel.getLista().observe(MainActivity.this, new Observer<List<Persona>>() {
                    @Override
                    public void onChanged(List<Persona> personas) {
                        tvresult.setText("");
                        for(Persona p: personas){
                            tvresult.append(p.toString() + "\n");
                        }
                    }
                });
            } else if (valor.equals("NOMBRE")) {
                viewModel.listarNombre().observe(MainActivity.this, new Observer<List<Persona>>() {
                    @Override
                    public void onChanged(List<Persona> personas) {
                        tvresult.setText("");
                        for (Persona p : personas) {
                            tvresult.append(p.toString() + "\n");
                        }
                    }
                });
            } else if (valor.equals("APELLIDO")){
                viewModel.listarApellido().observe(MainActivity.this, new Observer<List<Persona>>() {
                    @Override
                    public void onChanged(List<Persona> personas) {
                        tvresult.setText("");
                        for(Persona p: personas){
                            tvresult.append(p.toString() + "\n");
                        }
                    }
                });
            } else if (valor.equals("TELEFONO")){
                viewModel.listarTelefono().observe(MainActivity.this, new Observer<List<Persona>>() {
                    @Override
                    public void onChanged(List<Persona> personas) {
                        tvresult.setText("");
                        for(Persona p: personas){
                            tvresult.append(p.toString() + "\n");
                        }
                    }
                });
            } else if (valor.equals("FECHA")){
                viewModel.listarFecha().observe(MainActivity.this, new Observer<List<Persona>>() {
                    @Override
                    public void onChanged(List<Persona> personas) {
                        tvresult.setText("");
                        for(Persona p: personas){
                            tvresult.append(p.toString() + "\n");
                        }
                    }
                });
            } else if (valor.equals("LOCALIDAD")){
                viewModel.listarLocalidad().observe(MainActivity.this, new Observer<List<Persona>>() {
                    @Override
                    public void onChanged(List<Persona> personas) {
                        tvresult.setText("");
                        for(Persona p: personas){
                            tvresult.append(p.toString() + "\n");
                        }
                    }
                });
            } else if (valor.equals("CALLE")){
                viewModel.listarCalle().observe(MainActivity.this, new Observer<List<Persona>>() {
                    @Override
                    public void onChanged(List<Persona> personas) {
                        tvresult.setText("");
                        for(Persona p: personas){
                            tvresult.append(p.toString() + "\n");
                        }
                    }
                });
            } else if (valor.equals("NÚMERO")){
                viewModel.listarNumero().observe(MainActivity.this, new Observer<List<Persona>>() {
                    @Override
                    public void onChanged(List<Persona> personas) {
                        tvresult.setText("");
                        for(Persona p: personas){
                            tvresult.append(p.toString() + "\n");
                        }
                    }
                });
            }
        }



        tvresult = findViewById(R.id.tvresultado);
        btadd = findViewById(R.id.btadd);
        btborrar = findViewById(R.id.btborrar);
        bteditar = findViewById(R.id.bteditar);
        btlistar = findViewById(R.id.btlistar);

        btadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, add.class);
                startActivity(intent);
            }
        });

        btborrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, remove.class);
                startActivity(intent);
            }
        });

        btlistar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, listar.class);
                startActivity(intent);

            }
        });

        bteditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, edit.class);
                startActivity(intent);
            }
        });
    }
}