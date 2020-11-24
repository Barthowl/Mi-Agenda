package com.example.agenda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.agenda.viewmodel.ViewModelActivity;

public class edit extends AppCompatActivity {

    private Button btcancelar, bteditar;
    private EditText etid, etnombre, etapellidos, ettelefono, etfecha, etlocalidad, etcalle, etnumero;

    private ViewModelActivity viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        viewModel = new ViewModelProvider(this,ViewModelProvider.AndroidViewModelFactory.getInstance(this.getApplication())).get(ViewModelActivity.class);
        init();
    }

    private void init() {
        etid = findViewById(R.id.etid2);
        etnombre = findViewById(R.id.etnombre2);
        etapellidos = findViewById(R.id.etapellido2);
        ettelefono = findViewById(R.id.ettelefono2);
        etfecha = findViewById(R.id.etfecha2);
        etlocalidad = findViewById(R.id.etlocalidad2);
        etcalle = findViewById(R.id.etcalle2);
        etnumero = findViewById(R.id.etnumero2);

        btcancelar = findViewById(R.id.btcancelar3);
        bteditar = findViewById(R.id.bteditar2);

        btcancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(edit.this, MainActivity.class);
                startActivity(intent);
            }
        });

        bteditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // control de errores
                if(etid.getText().toString().isEmpty()){
                    etid.setError("Introduzca la id que va a editar");
                }
                if(!etnombre.getText().toString().isEmpty() && !etid.getText().toString().isEmpty()){
                    String nombre = etnombre.getText().toString();
                    viewModel.updateNombre2(nombre,Integer.parseInt(etid.getText().toString()));
                }
                if(!etapellidos.getText().toString().isEmpty() && !etid.getText().toString().isEmpty()){
                    String apellido = etapellidos.getText().toString();
                    viewModel.updateApellido(apellido,Integer.parseInt(etid.getText().toString()));
                }
                if(!ettelefono.getText().toString().isEmpty() && !etid.getText().toString().isEmpty()){
                    int telefono = Integer.parseInt(ettelefono.getText().toString());
                    viewModel.updateTelefono(telefono,Integer.parseInt(etid.getText().toString()));
                }
                if(!etfecha.getText().toString().isEmpty() && !etid.getText().toString().isEmpty()){
                    String fecha = etfecha.getText().toString();
                    viewModel.updateFecha(fecha,Integer.parseInt(etid.getText().toString()));
                }
                if(!etlocalidad.getText().toString().isEmpty() && !etid.getText().toString().isEmpty()){
                    String localidad = etlocalidad.getText().toString();
                    viewModel.updateLocalidad(localidad,Integer.parseInt(etid.getText().toString()));
                }
                if(!etcalle.getText().toString().isEmpty() && !etid.getText().toString().isEmpty()){
                    String calle = etcalle.getText().toString();
                    viewModel.updateCalle(calle,Integer.parseInt(etid.getText().toString()));
                }
                if(!etnumero.getText().toString().isEmpty() && !etid.getText().toString().isEmpty()){
                    int numero = Integer.parseInt(etnumero.getText().toString());
                    viewModel.updateNumero(numero,Integer.parseInt(etid.getText().toString()));
                }
                if(!etid.getText().toString().isEmpty()){
                    Intent intent = new Intent(edit.this, MainActivity.class);
                    startActivity(intent);
                }

                }

        });
    }
}