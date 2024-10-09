import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        /* Задача 1
        По условию задачи было необходимо определить переменную clientOs значением 0 либо 1,
        поскольку использую ввод с клавиатуры, я эту переменную не стал объявлять конкретным значением.
        Прошу этот момент не считать за ошибку...
        */

        System.out.print("Задача 1. Выберите операционную систему вашего устройства: \n 0 - IOS \n 1 - Android \nВаша операционная система: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String value1 = reader.readLine();            // считывание значения с клавиатуры
        int clientOs = Integer.parseInt(value1);       // преобразование строки в число



        switch (clientOs) {
            case 0 -> System.out.println("Установите версию приложения для iOS по ссылке");
            case 1 -> System.out.println("Установите версию приложения для Android по ссылке");
            default -> System.out.println("Выберите корректное значение (IOS либо Android)");
        }

        /* Задача 2
        По условию задачи было необходимо определить переменную clientDeviceYear значением 2015,
        поскольку использую ввод с клавиатуры, я эту переменную не стал объявлять конкретным значением.
        Прошу этот момент не считать за ошибку...
        */


        System.out.print("\nЗадача 2. Выберите операционную систему вашего устройства: \n 0 - IOS \n 1 - Android \nВаша операционная система: ");

        String value2 = reader.readLine();            // считывание значения с клавиатуры
        int osValue2 = Integer.parseInt(value2);       // преобразование строки в число

        System.out.print("Напишите год выпуска операционной системы: ");
        String value3 = reader.readLine();            // считывание значения с клавиатуры
        int clientDeviceYear = Integer.parseInt(value3);       // преобразование строки в число

        if(clientDeviceYear < 2015) {
            switch (osValue2) {
                case 0 -> System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                case 1 -> System.out.println("Установите облегченную версию приложения для Android по ссылке");
                default -> System.out.println("Выберите корректное значение (IOS либо Android)");
            }
        } else {
            switch (osValue2) {
                case 0 -> System.out.println("Установите версию приложения для iOS по ссылке");
                case 1 -> System.out.println("Установите версию приложения для Android по ссылке");
                default -> System.out.println("Выберите корректное значение (IOS либо Android)");
            }
        }

        // Задача 3
        System.out.print("\nЗадача 3. Напишите год в формате #### и мы определим является ли год високосным или нет: ");
        String value4 = reader.readLine();            // считывание значения с клавиатуры
        double year = Double.parseDouble(value4);          // преобразование строки в число

        double leapYearCheck1 = year / 4;                             // проверка деления на 4 (будет ли значение с плавающей точкой)
        double leapYearCheck2 = year / 400;                          // проверка деления на 400 (будет ли значение с плавающей точкой)
        double leapYearCheck3 = year / 100;
        double reminder1 = leapYearCheck1 - (int) leapYearCheck1;      // остаток после запятой после деления на 4
        double reminder2 = leapYearCheck2 - (int) leapYearCheck2;      // остаток после запятой после деления на 400
        double reminder3 = leapYearCheck3 - (int) leapYearCheck3;      // остаток после запятой после деления на 100
        boolean yearIsLeap1 = year > 1584 && (reminder1 == 0 || reminder2 == 0);
        boolean yearIsLeap2 = reminder3 != 0 || reminder2 == 0;



        if (yearIsLeap1) {
            if(yearIsLeap2) {
                System.out.println("Год является високосным");
            } else System.out.println("Год високосным не является");
        } else System.out.println("Год високосным не является");

        // Задача 4

        System.out.print("\nЗадача 4. Напишите расстояние от банка до адреса дома: ");

        String value5 = reader.readLine();                           // считывание значения с клавиатуры
        double deliveryDistance = Integer.parseInt(value5);          // преобразование строки в число

        if(deliveryDistance > 0 && deliveryDistance <= 20) {
            System.out.println("Для доставки карты потребуются сутки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Для доставки карты потребуются двое суток");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Для доставки карты потребуются трое суток");
        } else if (deliveryDistance > 100) {
            System.out.println("Свыше 100 км доставки нет");
        }

        // Задача 5

        System.out.print("\nЗадача 5. Напишите номер месяца: ");

        String value6 = reader.readLine();                           // считывание значения с клавиатуры
        int monthNumber = Integer.parseInt(value6);               // преобразование строки в число

        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println("Это зима");
            case 3, 4, 5 -> System.out.println("Это весна");
            case 6, 7, 8 -> System.out.println("Это лето");
            case 9, 10, 11 -> System.out.println("Это осень");
            default -> System.out.println("Такого месяца не существует");
        }
    }
}