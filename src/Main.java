public class Main {
    public static void verifyYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void verifyOS(int os, int clientDeviceYear) {
        if (os == 0) {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (os == 1) {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Неизвестная OS");
        }

    }

    public static int calculateDelivery(int deliveryDistance) {
        int days = 0;
        if (deliveryDistance <= 20) {
            days += 1;
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days += 2;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days += 3;
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
        return days;
    }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2021;
        verifyYear(year);

        System.out.println("Задача 2");
        int os = 1;
        int clientDeviceYear = 2014;
        verifyOS(os, clientDeviceYear);

        System.out.println("Задача 3");
        int deliveryDistance = 2;
        int deliveryDays = calculateDelivery(deliveryDistance);
        System.out.println("Потребуется дней " + deliveryDays);
    }
}

