package ru.geekbrains.homework5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private int salary;
    private int age;

    Employee(String name, String position, String email, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.salary = salary;
        if (age > 0) {
            this.age = age;
        }
    }

    public void info(){
        System.out.println(name + " " + position + " " + email + " " + salary +  " " + age);
    }
}

