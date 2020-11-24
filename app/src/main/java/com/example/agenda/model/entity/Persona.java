package com.example.agenda.model.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "persona")
public class Persona {

    public Persona(){}


    public Persona(@NonNull String nombre, @NonNull String apellidos, int telefono, @NonNull String fecha, @NonNull String localidad, @NonNull String calle, int numero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.fecha = fecha;
        this.localidad = localidad;
        this.calle = calle;
        this.numero = numero;
    }

    @PrimaryKey(autoGenerate = true)
    public int id;

    @NonNull
    @ColumnInfo(name = "nombre")
    private String nombre;

    @NonNull
    @ColumnInfo(name = "apellidos")
    private String apellidos;

    @NonNull
    @ColumnInfo(name = "telefono")
    private int telefono;

    @NonNull
    @ColumnInfo(name = "fecha")
    private String fecha;

    @NonNull
    @ColumnInfo(name = "localidad")
    private String localidad;

    @NonNull
    @ColumnInfo(name = "calle")
    private String calle;

    @NonNull
    @ColumnInfo(name = "numero")
    private int numero;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @NonNull
    public String getNombre() {
        return nombre;
    }

    public void setNombre(@NonNull String nombre) {
        this.nombre = nombre;
    }

    @NonNull
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(@NonNull String apellidos) {
        this.apellidos = apellidos;
    }

    @NonNull
    public String getFecha() {
        return fecha;
    }

    public void setFecha(@NonNull String fecha) {
        this.fecha = fecha;
    }

    @NonNull
    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(@NonNull String localidad) {
        this.localidad = localidad;
    }

    @NonNull
    public String getCalle() {
        return calle;
    }

    public void setCalle(@NonNull String calle) {
        this.calle = calle;
    }

    @NonNull
    public int getNumero() {
        return numero;
    }

    public void setNumero(@NonNull int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "| " +
                "id: " + id +
                ", nombre: " + nombre  +
                ", apellidos: " + apellidos +
                ", telefono: " + telefono +
                ", fecha: " + fecha  +
                ", localidad: " + localidad +
                ", calle: " + calle  +
                ", numero: " + numero + " |";
    }
}
