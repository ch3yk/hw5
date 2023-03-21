public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS = 1;
        switch (clientOS) {
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void task2 () {
        System.out.println("Задача  2");
        int clientOS = 1;
        int yearOfSystem = 2015;
        if (yearOfSystem>2015){
            switch (clientOS){
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        else {
            switch (clientOS){
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                case 0:
                    System.out.println("становите облегченную версию приложения для iOS по ссылке");
            }
        }
    }

    public static void task3 () {
        System.out.println("Задача  3");
        int year = 2021;
        if (year%4==0 && year%100!=0 || year%400==0){
            System.out.println(year+ " год является високосным");
        }
        else {
            System.out.println(year+ " год не является високосным");
        }
    }
    public static void task4 () {
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance<20){
            System.out.println("Нужно дней: " + deliveryTime);
        } else if (deliveryDistance<60) {
            System.out.println("Нужно дней: " + (deliveryTime+1));
        } else if (deliveryDistance<100) {
            System.out.println("Нужно дней: " + (deliveryTime+2));
        } else {
            System.out.println(" Нет доставки свыше 100 км ");
        }
    }
    public static void task5 () {
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("неверно указан месяц");
                break;
        }
    }
}