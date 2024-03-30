package org.example;

import org.example.models.domen.Person;
import org.example.models.servise.Mapper;
import org.example.models.servise.MapperJson;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Антон", "Бобров", 34);
        Person p2 = new Person("Антон", "Бобров", 34);
        Person p3 = new Person("Виктор", "Бобров", 34);
        Mapper m = new MapperJson();
        String jsonP2 = m.map(p2);

        System.out.println("toString: "+p);
        System.out.println("hashCode: "+p.hashCode());
        System.out.println("equals res true: "+p.equals(p2));
        System.out.println("equals res false: "+p.equals(p3));
        System.out.println("p to JSON : "+m.map(p));
        System.out.println("JSON to p2: "+m.map(jsonP2));


        System.out.println("Hello world!");
    }
}