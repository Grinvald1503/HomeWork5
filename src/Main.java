import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        byte clientOS = 0;
        short clientDeviceYear = 2015;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Советуем установить облегченную версию приложения для IOS по ссылке");
            }
        }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Советуем установить облегченную версию приложения для Android по ссылке");
            }
        }
        System.out.println("Здание 3");
        int year = 2021;
        if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }
        else if (year % 4 == 0) {
            if (year % 100 == 0) {
                System.out.println(year + " год не является високосным");
            }
            else {
                System.out.println(year + " год является високосным");
            }
        }
        else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int dayAdded = (deliveryDistance - 20) / 40 + 1;
        int daysForDelivery = dayAdded + 1;
        if (deliveryDistance <= 20)
        {System.out.println("Потребуется дней: 1");
        } else {
            System.out.println("Потребуется дней: " + daysForDelivery);
        }
        System.out.println("Задача 5");
        byte monthNumber = 3;
        String season;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
            season = "Зима";
            break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;
            default:
                season = "Введён несуществующий месяц";


        }
        System.out.println(season);
    }
}