package ru.geekbrains.homework5;
// 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
// 2. Конструктор класса должен заполнять эти поля при создании объекта.
// 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
// 4. Создать массив из 5 сотрудников.
// 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

public class MainApp {
    public static void main(String[] args) {
        Employee[] emplArray = {
                new Employee("male", "Max Champ", "Ingineer", "Max@mail.ru", 50000, 35),
                new Employee("female", "Katrin Novara", "Manager", "Katya@gmail.com", 35000, 20),
                new Employee("male", "Jac If Custo", "Director", "Jac@yanex.ru", 150000, 70),
                new Employee("male", "Nikolay Shustin", "Manager", "Nick@gmail.com", 30000, 25),
                new Employee("female", "Natalia Oray", "Senior Manager", "Nat@gmail.com", 95000, 40),
        };

//        Employee[] emplArray2 = {
//                new Employee("Jora", "Driver", 50000)
//        };

        for (int i = 0; i < emplArray.length; i++) {
            int n = 40;
            if (emplArray[i].getAge() > n) {
                System.out.print("сотрудники старше " + n + ": " + '\n');
                emplArray[i].info();
                System.out.println();
            }
            if ((emplArray[i].getAge() < 50) && (emplArray[i].getSalary() > 50000)) {
                System.out.print("Второе лицо компании " + n + ": " + '\n');
                emplArray[i].info();
                System.out.println();
            }
        }

        for (int i = 0; i < emplArray.length; i++) {
            if (emplArray[i].getGender().equals("female")) {
                System.out.print("Женский коллектив: " + '\n');
                emplArray[i].info();
            }
        }

        System.out.println();

        for (int i = 0; i < emplArray.length; i++) {
            if (emplArray[i].getPosition().equals("Manager")) {
                System.out.print("Лучший работник: " + '\n');
                emplArray[i].info();
            }
        }

        System.out.println();

    }
}



