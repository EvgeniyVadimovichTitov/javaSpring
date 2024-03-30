package org.example.models.servise;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.models.domen.Person;

public class MapperJson implements Mapper{

    @Override
    public Person map(String json) {
        //Десериализация
        Gson gson = new Gson();
        return gson.fromJson(json,Person.class);
    }

    @Override
    public String map(Person person) {
        //Сериализация
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        return gson.toJson(person);
    }
}
