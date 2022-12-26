package projects.studentRegistrationWithFile.bean;

import java.io.Serializable;

public abstract class Person implements Serializable {

    private String name;
    private String surname;
    private int age;

    Person() {
    }

    Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname(String name) {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge(int age) {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
