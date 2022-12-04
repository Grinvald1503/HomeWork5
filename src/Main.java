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



    }
}