package com.example.agenda.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.agenda.model.Repository;
import com.example.agenda.model.entity.Persona;

import java.util.List;

public class ViewModelActivity extends AndroidViewModel {

    public Repository rep;

    public ViewModelActivity(@NonNull Application application) {
        super(application);
        rep = new Repository(application);
    }

    public LiveData<List<Persona>> getLista() {
        return rep.getLista();
    }

    public LiveData<List<Persona>> listarNombre() {
        return rep.listarNombre();
    }

    public LiveData<List<Persona>> listarApellido() {
        return rep.listarApellido();
    }

    public LiveData<List<Persona>> listarTelefono() {
        return rep.listarTelefono();
    }

    public LiveData<List<Persona>> listarFecha() {
        return rep.listarFecha();
    }

    public LiveData<List<Persona>> listarLocalidad() {
        return rep.listarLocalidad();
    }

    public LiveData<List<Persona>> listarCalle() {
        return rep.listarCalle();
    }

    public LiveData<List<Persona>> listarNumero() {
        return rep.listarNumero();
    }


    public void insert(Persona p) {
        rep.insert(p);
    }

    public void delete(long id) {
        rep.delete(id);
    }

    public void get(long id) {
        rep.get(id);
    }


    public void updateNombre2(String nombre, int id){
        rep.updateNombre(nombre,id);
    }

    public void updateApellido(String apellido, int id){
        rep.updateApellidos(apellido,id);
    }

    public void updateTelefono(int telefono, int id){
        rep.updateTelefono(telefono,id);
    }

    public void updateFecha(String fecha, int id){
        rep.updateFecha(fecha,id);
    }

    public void updateLocalidad(String localidad, int id){
        rep.updateLocalidad(localidad,id);
    }

    public void updateCalle(String calle, int id){
        rep.updateCalle(calle,id);
    }

    public void updateNumero(int numero, int id){
        rep.updateNumero(numero,id);
    }
}
