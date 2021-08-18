package ru.geekbrains.homework5;

public class MainApp {
    public static void main(String[] args) {
        Employee[] person = {
                new Employee("Max", "Ingineer", "Max@mail.ru", 50000, 35 ),
                new Employee("Katrin", "Manager", "Katya@gmail.com", 35000, 20 ),
                new Employee("Jac If Custo", "Director", "Jac@yanex.ru", 150000, 70 )
        };
        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < i; j++) {
                for (person[i][j] = 40);{
                   person[i].info();
                }
            }
        }
    }


}
