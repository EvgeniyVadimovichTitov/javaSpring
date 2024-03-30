package org.example.models.servise;

import org.example.models.domen.Person;

public interface Mapper {
    Person map(String json);
    String map(Person person);
}
