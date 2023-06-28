import java.time.LocalDate;

public class Main {

    public static void proveriajemPeczatajemGod(int god) {
        if (god % 4 == 0 && god % 100 != 0 || god % 400 == 0) {
            System.out.println(god + " год -  високосный год");
        } else {
            System.out.println(god + " год -  не високосный год");
        }
    }

    public static void proveriajemRecomendujemPrilogenie(int oS, int godVypuska) {
        int year1 = LocalDate.now().getYear();
        int iOS1 = 0;
        int android1 = 1;
        if (oS == iOS1) {
            if (godVypuska >= year1) {
                System.out.println("Установите версию приложения для iOS ");
            } else {
                System.out.println("Установите  облегченную версию приложения для iOS ");
            }
        } else if (oS == android1) {
            if (godVypuska >= year1) {
                System.out.println("Установите версию приложения для Android ");
            } else {
                System.out.println("Установите  облегченную версию приложения для Android ");
            }
        } else {
            System.out.println("Несовместимая операционная система");
        }
    }

    public static void sczytajemVremiaDostavki(int rasstojanie) {
        int deliveryTime = 1;
        if (rasstojanie <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (rasstojanie > 20 && rasstojanie < 60) {
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (rasstojanie >= 60 && rasstojanie <= 100) {
            deliveryTime = deliveryTime + 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }

    public static void main(String[] args) {

        // Задание номер 1
        int year = 2021;
        proveriajemPeczatajemGod(year);

        //Задание номер 2
        int clientOS1 = 1;
        int clientDeviceYear = 2022;
        proveriajemRecomendujemPrilogenie(clientOS1, clientDeviceYear);

        //Задание номер 3
        int deliveryDistance = 19;
        sczytajemVremiaDostavki(deliveryDistance);

    }

}