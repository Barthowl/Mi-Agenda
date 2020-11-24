package com.example.agenda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.agenda.model.dao.PersonaDao;
import com.example.agenda.model.entity.Persona;
import com.example.agenda.model.room.PersonaDB;
import com.example.agenda.viewmodel.ViewModelActivity;

public class add extends AppCompatActivity {

    private Button btvolver, btaceptar;
    private EditText etnombre, etapellidos, ettelefono, etfecha, etlocalidad, etcalle, etnumero;

    private PersonaDB bdd;
    private PersonaDao personadao;
    private Persona p;

    private ViewModelActivity viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        viewModel = new ViewModelProvider(this,ViewModelProvider.AndroidViewModelFactory.getInstance(this.getApplication())).get(ViewModelActivity.class);
        init();
    }

    private void init() {
        etnombre = findViewById(R.id.etnombre);
        etapellidos = findViewById(R.id.etapelllidos);
        ettelefono = findViewById(R.id.ettelefono);
        etfecha = findViewById(R.id.etfecha);
        etlocalidad = findViewById(R.id.etlocalidad);
        etcalle = findViewById(R.id.etcalle);
        etnumero = findViewById(R.id.etnumero);

        btvolver = findViewById(R.id.btcancelar);
        btaceptar = findViewById(R.id.btaceptar);


        btvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(add.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btaceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // control de errrores
                if(etnombre.getText().toString().isEmpty()){
                    etnombre.setError("Debe introducir un nombre");
                } else if(etapellidos.getText().toString().isEmpty()){
                    etapellidos.setError("Debe introducir un apellido");
                } else if(ettelefono.getText().toString().isEmpty()){
                    ettelefono.setError("Debe introducir un teléfono");
                } else if(etfecha.getText().toString().isEmpty()){
                    etfecha.setError("Debe introducir una fecha");
                } else if(etlocalidad.getText().toString().isEmpty()){
                    etlocalidad.setError("Debe introducir una localidad");
                } else if(etcalle.getText().toString().isEmpty()){
                    etcalle.setError("Debe introducir una calle");
                } else if(etnumero.getText().toString().isEmpty()){
                    etnumero.setError("Debe introducir un número");
                } else {
                    String nombre = etnombre.getText().toString();
                    String apellido = etapellidos.getText().toString();
                    int telefono = Integer.parseInt(ettelefono.getText().toString());
                    String fecha = etfecha.getText().toString();
                    String localidad = etlocalidad.getText().toString();
                    String calle = etcalle.getText().toString();
                    int numero = Integer.parseInt(etnumero.getText().toString());

                    p = new Persona(nombre, apellido, telefono, fecha, localidad, calle, numero);
                    viewModel.insert(p);
                    Intent intent = new Intent(add.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}