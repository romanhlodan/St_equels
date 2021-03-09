package Generics;

import reflect.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Person<Integer,String> integerStringPerson = new Person<>(2,"vasya");
        Person<String,String> stringStringPerson = new Person<>("Odin","Kolya");
        List<Person>people = new ArrayList<>();
        people.add(integerStringPerson);
        people.add(stringStringPerson);
//        System.out.println(people);

Saver saver = new Saver();
        File file = new File(System.getProperty("user.home") + File.separator + "test.txt");
        saver.save(file, new Person<>(145,"effefef"));

        Saver<User> userSaver = new Saver<>();
        userSaver.save(file,new User(78,"edddd"));


    }
}
