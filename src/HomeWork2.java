public class HomeWork2 {

    public static void main(String[] args) {

        //        Homework 2.1

        int operationSystem = 1;
        if (operationSystem == 0) {
            System.out.println("Please install the app for iOS following the link");
        } else {
            System.out.println("Please install the app for Android following the link");
        }


        //        Homework 2.2

        int operation_System = 1;
        int clientDeviceYear = 202;
        if (operation_System == 0 && clientDeviceYear >= 2015) {
            System.out.println("Please install the app for iOS following the link");
        } else if (operation_System == 1 && clientDeviceYear >= 2015) {
            System.out.println("Please install the app for Android following the link");
        }
        if (operation_System == 0 && clientDeviceYear < 2015) {
            System.out.println("Please install the light version of an app for iOS following the link");
        } else if (operation_System == 1 && clientDeviceYear < 2015) {
            System.out.println("Please install the light version of an app for Android following the link");
        }

        //        Homework 2.3

        int year = 2024;
        if ((year % 4 == 0) || (year % 400 == 0 && year % 100 != 0)) {
            System.out.println("The year is leap");
        } else {
            System.out.println("The year is not leap");
        }

        //        Homework 2.4

        int deliveryDistance = 60;
        int deliveryDays = 1;
        if (deliveryDistance < 20) {
            System.out.println("Days required " + deliveryDays);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Days required " + ++deliveryDays);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Days required " + (++deliveryDays + 1));
        }

        //        Homework 2.5

        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("There is no such month");
        }

    }
}
