package org.example.IfElse;

import java.util.Scanner;

public class IfElseTasks {
    //1. Определение четности числа: Напиши программу,
    //которая запрашивает у пользователя целое число и выводит сообщение о том,
    // является ли число четным или нечетным.

    public void ifElseTask1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number " + number + " is integer.");
        } else {
            System.out.println("Current number is not integer");
        }
    }

    //2. Определение налога на доход: Запроси у пользователя его доход.
    // В зависимости от введенной суммы, выведи налог, который должен заплатить пользователь.
    // Например, для дохода до $10,000 налог составляет 10%, для дохода от $10,001 до $50,000 налог составляет 20%

    public void ifElseTask2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your profit: ");
        int profit = scanner.nextInt();

        if (profit <= 10000) {
            System.out.println("You must pay a tax of 10% of the profit: " + profit * 0.1);
        } else if (profit < 50000) {
            System.out.println("You must pay a tax of 20% of the profit: " + profit * 0.2);
        } else {
            System.out.println("You must pay a tax of 30% of the profit: " + profit * 0.3);
        }
    }

    //3. Определение возрастной категории: Спроси у пользователя его возраст.
    // Выведи сообщение о его возрастной категории: "ребенок", "подросток", "взрослый" или "пенсионер".

    public void ifElseTask3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you? Enter you age: ");

        short age = scanner.nextByte();

        if (age < 12) {
            System.out.println("You are " + age + " years old. It means you are a kid.");
        } else if (age < 18) {
            System.out.println("You are " + age + " years old. It means you are a teenager.");
        } else if (age < 60) {
            System.out.println("You are " + age + " years old. It means you are a adult.");
        } else {
            System.out.println("You are " + age + " years old. It means you are a pensioner.");
        }
    }
}
