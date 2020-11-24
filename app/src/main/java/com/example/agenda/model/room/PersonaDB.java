package com.example.agenda.model.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.agenda.model.dao.PersonaDao;
import com.example.agenda.model.entity.Persona;

@Database(entities = {Persona.class}, version = 1, exportSchema = false)
public abstract class PersonaDB extends RoomDatabase {

    public abstract PersonaDao getPersonaDao();

    private volatile static com.example.agenda.model.room.PersonaDB INSTANCE;

    public static PersonaDB getDb(final Context context) {
        if(INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), com.example.agenda.model.room.PersonaDB.class, "agenda").build();
        }
        return INSTANCE;
    }
}
