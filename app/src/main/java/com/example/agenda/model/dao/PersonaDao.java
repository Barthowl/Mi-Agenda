package com.example.agenda.model.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.agenda.model.entity.Persona;

import java.util.List;

@Dao
public interface PersonaDao {

    @Query("delete from persona where id = :id")
    int delete(long id);

    @Query("select * from persona where id = :id")
    Persona get(long id);

    @Insert
    long insert(Persona persona);

    @Query("select * from persona order by id")
    LiveData<List<Persona>> getAll();

    @Query("select * from persona order by nombre")
    LiveData<List<Persona>> listarNombre();

    @Query("select * from persona order by apellidos")
    LiveData<List<Persona>> listarApellido();

    @Query("select * from persona order by telefono")
    LiveData<List<Persona>> listarTelefono();

    @Query("select * from persona order by fecha")
    LiveData<List<Persona>> listarFecha();

    @Query("select * from persona order by localidad")
    LiveData<List<Persona>> listarLocalidad();

    @Query("select * from persona order by calle")
    LiveData<List<Persona>> listarCalle();

    @Query("select * from persona order by numero")
    LiveData<List<Persona>> listarNumero();

    @Query("update persona set nombre = :nombrenuevo where id = :id")
    int updateNombre(String nombrenuevo, int id);

    @Query("update persona set apellidos = :apellidonuevo where id = :id")
    int updateApellido(String apellidonuevo, int id);

    @Query("update persona set telefono = :telefononuevo where id = :id")
    int updateTelefono(int telefononuevo, int id);

    @Query("update persona set fecha = :fechanuevo where id = :id")
    int updateFecha(String fechanuevo, int id);

    @Query("update persona set localidad = :localidadnuevo where id = :id")
    int updateLocalidad(String localidadnuevo, int id);

    @Query("update persona set calle = :callenuevo where id = :id")
    int updateCalle(String callenuevo, int id);

    @Query("update persona set numero = :numeronuevo where id = :id")
    int updateNumero(int numeronuevo, int id);

}
