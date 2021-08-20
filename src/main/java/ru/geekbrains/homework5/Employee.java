package ru.geekbrains.homework5;

public class Employee {
    private String gender;
    private String name;
    private String position;
    private String email;
    private int salary;
    private int age;

    protected Employee(String gender, String name, String position, String email, int salary, int age) {
        this.gender = gender;
        this.name = name;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void info() {
        System.out.println(gender + ", " + name + ", " + position + ", " + email + ", " + salary + ", " + age + ";");
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

