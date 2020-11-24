package com.example.agenda.model;

import android.content.Context;

import androidx.lifecycle.LiveData;

import com.example.agenda.model.dao.PersonaDao;
import com.example.agenda.model.entity.Persona;
import com.example.agenda.model.room.PersonaDB;

import java.util.List;

public class Repository {

    private PersonaDao personadao;
    private LiveData<List<Persona>> lista;

    public Repository(Context context){
        PersonaDB bdd = PersonaDB.getDb(context);
        personadao = bdd.getPersonaDao();
    }

    public LiveData<List<Persona>> getLista() {
        lista = personadao.getAll();
        return lista;
    }

    public LiveData<List<Persona>> listarNombre() {
        lista = personadao.listarNombre();
        return lista;
    }

    public LiveData<List<Persona>> listarApellido() {
        lista = personadao.listarApellido();
        return lista;
    }

    public LiveData<List<Persona>> listarTelefono() {
        lista = personadao.listarTelefono();
        return lista;
    }

    public LiveData<List<Persona>> listarFecha() {
        lista = personadao.listarFecha();
        return lista;
    }

    public LiveData<List<Persona>> listarLocalidad() {
        lista = personadao.listarLocalidad();
        return lista;
    }

    public LiveData<List<Persona>> listarCalle() {
        lista = personadao.listarCalle();
        return lista;
    }

    public LiveData<List<Persona>> listarNumero() {
        lista = personadao.listarNumero();
        return lista;
    }

    public void insert(Persona p){
        new Thread(){
            @Override
            public void run() {
                personadao.insert(p);
            }
        }.start();
    }

    public void delete(long id){
        new Thread(){
            @Override
            public void run() {
                personadao.delete(id);
            }
        }.start();
    }

    public void get(long id){
        new Thread(){
            @Override
            public void run() {
                personadao.get(id);
            }
        }.start();
    }

    public void updateNombre(String nombre,int id){
        new Thread(){
            @Override
            public void run() {
                personadao.updateNombre(nombre,id);
            }
        }.start();
    }

    public void updateApellidos(String apellido,int id){
        new Thread(){
            @Override
            public void run() {
                personadao.updateApellido(apellido,id);
            }
        }.start();
    }

    public void updateTelefono(int telefono,int id){
        new Thread(){
            @Override
            public void run() {
                personadao.updateTelefono(telefono,id);
            }
        }.start();
    }

    public void updateFecha(String fecha,int id){
        new Thread(){
            @Override
            public void run() {
                personadao.updateFecha(fecha,id);
            }
        }.start();
    }

    public void updateLocalidad(String localidad,int id){
        new Thread(){
            @Override
            public void run() {
                personadao.updateLocalidad(localidad,id);
            }
        }.start();
    }

    public void updateCalle(String calle,int id){
        new Thread(){
            @Override
            public void run() {
                personadao.updateCalle(calle,id);
            }
        }.start();
    }

    public void updateNumero(int numero,int id){
        new Thread(){
            @Override
            public void run() {
                personadao.updateNumero(numero,id);
            }
        }.start();
    }
}
