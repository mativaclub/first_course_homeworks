public class HomeWork2_Conditions {

    public static void main(String[] args) {

        //        Homework 2.1

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Please install the app for iOS following the link");
        } else {
            System.out.println("Please install the app for Android following the link");
        }


        //        Homework 2.2

        int operationSystem = 1;
        int clientDeviceYear = 2015;
        if (operationSystem == 0 && clientDeviceYear >= 2015) {
            System.out.println("Please install the app for iOS following the link");
        } else if (operationSystem == 1 && clientDeviceYear >= 2015) {
            System.out.println("Please install the app for Android following the link");
        }
        if (operationSystem == 0 && clientDeviceYear < 2015) {
            System.out.println("Please install the light version of an app for iOS following the link");
        } else if (operationSystem == 1 && clientDeviceYear < 2015) {
            System.out.println("Please install the light version of an app for Android following the link");
        }

        //        Homework 2.3

        int year = 100;
        if ((year % 4 == 0) && (year % 100 !=0) || (year % 400 == 0)) {
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



        //        Homework 2.6
        int customerAge = 19;
        int customerSalary = 58000;
        double creditLimit = 1;
        if (customerAge >= 23) {
            creditLimit = customerSalary * 3;
        } else {
            creditLimit = customerSalary * 2;
        }
        if (customerSalary >= 50000 && customerSalary < 80000) {
            creditLimit = creditLimit * 1.2;
        } else if (customerSalary >= 80000) {
            creditLimit = creditLimit * 1.5;
        }
        System.out.println(creditLimit);


//        Homework 2.7

        int age = 25;
        int salary = 90000;
        int wantedSum = 330000;
        int creditLength = 12;
        double basePercent = 0.1;
        double baseOffer = wantedSum * basePercent;
        float maxMonthlyPayment = salary * 0.5f;
        if (age <= 23) {
            baseOffer += (baseOffer * 0.01);
        } else if (age <= 30) {
            baseOffer += (baseOffer * 0.05);
        }
        if (salary > 80000) {
            baseOffer -= (baseOffer * 0.07);
        }
        double monthlyPayment = (wantedSum + baseOffer)/creditLength;
        if (maxMonthlyPayment > monthlyPayment) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment +
                    " рублей." + "Платеж по кредиту " + monthlyPayment + " рублей. Одобрено».");
        } else if (maxMonthlyPayment < monthlyPayment) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment +
                    " рублей." + "Платеж по кредиту " + monthlyPayment + " рублей. Отказано».");
        }


    }
}
