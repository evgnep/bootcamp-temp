package ru.otus.oop1.ex4;

public class Student {
    private String name;
    private String surname;
    private String group;
    private int course;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Student(String group, int course) {
        this.group = group;
        this.course = course;
    }

    public Student(String nameAndSurname) {
        this(nameAndSurname.split(" "));
    }

    public Student(String[] parts) {
        this(parts[0], parts[1]);
    }

    /*
    public Student(String group) {
        this.group = group;
    }*/


}
