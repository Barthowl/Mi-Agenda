package com.example.agenda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.agenda.model.entity.Persona;
import com.example.agenda.viewmodel.ViewModelActivity;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class listar extends AppCompatActivity {

    private Button btcancelar, btlistar;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private ViewModelActivity viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);
        viewModel = new ViewModelProvider(this,ViewModelProvider.AndroidViewModelFactory.getInstance(this.getApplication())).get(ViewModelActivity.class);
        init();
    }

    private void init() {
        radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(checkedRadioButtonId);
            }
        });

        btcancelar = findViewById(R.id.btcancelar4);
        btlistar = findViewById(R.id.btlistar2);


        btcancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(listar.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btlistar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor = radioButton.getText().toString();
                Intent i = new Intent(listar.this, MainActivity.class);
                i.putExtra("key", valor);
                startActivity(i);
            }
        });
    }
}