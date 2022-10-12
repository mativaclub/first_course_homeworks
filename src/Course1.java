public class Course1 {


    public static void main(String[] args) {

        //




//public class main {
//
//    public static void main(String[] args) {
//        System.out.println("Задача 1");
//
//        int clientOperS = 1;
//        if (clientOperS == 1) {
//            System.out.println("Установите версию приложения для Android по ссылке.");
//        } else {
//            System.out.println("Установите версию приложения для iOS по ссылке.");
//        }
//        System.out.println();
//
//        System.out.println("Задача 2");
//        int clientOS = 1;
//        int clientDeviceYear = 2015;
//        if (clientOS == 1 && clientDeviceYear >= 2015) {
//            System.out.println("Установите версию приложения для Android по ссылке.");
//        } else if (clientOS == 0 && clientDeviceYear >= 2015){
//            System.out.println("Установите версию приложения для iOS по ссылке.");
//        }
//        if (clientOS == 1 && clientDeviceYear < 2015) {
//            System.out.println("Установите облегченную версию приложения для Android по ссылке");
//        } else if (clientOS == 0 && clientDeviceYear < 2015){
//            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
//        }
//        System.out.println();
//
//        System.out.println("Задача 3");
//
//        int year = 400;
//        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//            System.out.println("год является високосным");
//        } else {
//            System.out.println("год не является високосным");
//        }
//
//        System.out.println();
//
//        System.out.println("Задача 4");
//
//        int deliveryDistance = 95;
//        int deliveryDay = 1;
//        if (deliveryDistance <= 20) {
//            System.out.println("Потребуется дней " + deliveryDay);
//        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
//            System.out.println("Потребуется дней " + ++deliveryDay);
//        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
//            System.out.println("Потребуется дней " + (deliveryDay+2));
//        }
//
//        System.out.println();
//
//        System.out.println("Задача 5");
//        int monthNumber = 12;
//        switch (monthNumber) {
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("Winter");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Spring");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("Summer");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("Autumn");
//                break;
//            default:
//                System.out.println("There is no such number");
//        }
//
//        System.out.println();
//
//        System.out.println("Задача 6");
//
//        int age1 = 19;
//        int salary1 = 58_000;
//        double limit = 1;
//        if (age1 >= 23) {
//            limit = salary1 * 3;
//        } else if (age1 < 23) {
//            limit = salary1 * 2;
//        }
//        if (salary1 >= 50000 && salary1 < 80000) {
//            limit = limit * 1.2;
//        } else if (salary1 >= 80000) {
//            limit = limit * 1.5;
//        }
//        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
//
//        System.out.println();
//
//        System.out.println("Задача 7");
//
//        int age = 25;
//        int salary = 60000;
//        int wantedSum = 330000;
//        int creditLength = 12;
//        double basePercent = 0.1;
//        double baseOffer = wantedSum * basePercent;
//        float maxMonthlyPayment = salary * 0.5f;
//        if (age <= 23) {
//            baseOffer = baseOffer + (baseOffer * 0.01);
//        } else if (age <= 30) {
//            baseOffer = baseOffer + (baseOffer * 0.05);
//        }
//        if (salary > 80000) {
//            baseOffer = baseOffer - (baseOffer * 0.07);
//        }
//        double monthlyPayment = (wantedSum + baseOffer)/creditLength;
//        if (maxMonthlyPayment > monthlyPayment) {
//            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment +
//                    " рублей." + "Платеж по кредиту " + monthlyPayment + " рублей. Одобрено».");
//        } else if (maxMonthlyPayment < monthlyPayment) {
//            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment +
//                    " рублей." + "Платеж по кредиту " + monthlyPayment + " рублей. Отказано».");
//        }
//
//
//    }
//
//}
// 62  
//src/homework_3_Cycles/cycles/main.java
//Viewed
//@@ -0,0 +1,62 @@
//package homework_3_Cycles.cycles;
//
//public class main {
//    public static void main(String[] args) {
//
//        System.out.println("Задание 1");
//        int a = 1;
//        while (a <= 10) {
//            System.out.print(a++);
//        }
//        System.out.println();
//        for (int i = 10; i >=1 ; i--) {
//            System.out.print(i);
//        }
//        System.out.println();
//        System.out.println();
//
//        System.out.println("Задание 2");
//        for (int day = 5; day <= 31; day+=7) {
//            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
//        }
//
//        System.out.println();
//
//        System.out.println("Задание 3");
//        int currentYear = 2021;
//        int yearsBefore = currentYear - 200;
//        int yearsAfter = currentYear + 100;
//        for (int cometYear = yearsBefore; cometYear <= yearsAfter; cometYear++) {
//            if (cometYear % 79 == 0) {
//                System.out.println(cometYear);
//            }
//        }
//        System.out.println();
//
//        System.out.println("Задание 4");
//        for (int day = 1; day <= 30; day++) {
//            if (day % 3 == 0 && day % 5 == 0) {
//                System.out.println(day + ":ping pong");
//            } else if (day % 3 == 0) {
//                System.out.println(day + ":ping");
//            } else if (day % 5 == 0) {
//                System.out.println(day + ":pong");
//            } else {
//                System.out.println(day + ":");
//            }
//        }
//
//        System.out.println();
//
//        System.out.println("Задание 5");
//        int evenNumber = 0;
//        int oddNumber = 1;
//        for (int nextNumber = 0; nextNumber < 5; nextNumber++) {
//            System.out.print(evenNumber + " " + oddNumber + " ");
//            evenNumber = evenNumber + oddNumber;
//            oddNumber = oddNumber + evenNumber;
//        }
//
//
//}
//}
// 268  
//src/homework_4_5_Arrays/Arrays/main.java
//Viewed
//@@ -0,0 +1,268 @@
//package homework_4_5_Arrays.Arrays;
//
//import java.util.Arrays;
//
//public class main {
//    public static void main(String[] args) {
//
//        System.out.println("задача 1");
//
//        int[] arr1 = new int[]{1, 2, 3};
//        double[] arr2 = new double[]{1.57, 7.654, 9.986};
//        int[] arr3 = {4, 5, 6, 7, 8, 9};
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));
//
//        System.out.println();
//
//        System.out.println("задача 2");
//        int[] arr4 = new int[]{1, 2, 3};
//        for (int i = 0; i < arr4.length; i++) {
//            if (i == arr4.length - 1) {
//                System.out.print(arr4[i]);
//            } else {
//                System.out.print(arr4[i] + ", ");
//            }
//        }
//        System.out.println();
//        double[] arr5 = new double[]{1.57, 7.654, 9.986};
//        for (int i = 0; i < arr5.length; i++) {
//            if (i == arr5.length - 1) {
//                System.out.print(arr5[i]);
//            } else {
//                System.out.print(arr5[i] + ", ");
//            }
//        }
//        System.out.println();
//        int[] arr6 = {4, 5, 6, 7, 8, 9};
//        for (int i = 0; i < arr6.length; i++) {
//            if (i == arr6.length - 1) {
//                System.out.print(arr6[i]);
//            } else {
//                System.out.print(arr6[i] + ", ");
//            }
//        }
//        System.out.println();
//        System.out.println();
//
//        System.out.println("задача 3");
//        int[] arr4Rev = new int[]{1, 2, 3};
//        for (int i = arr4Rev.length-1; i >=0; i--) {
//            if (i == 0) {
//                System.out.print(arr4Rev[i]);
//            } else if (i < arr4Rev.length)  {
//                System.out.print(arr4Rev[i] + ", ");
//            }
//        }
//        System.out.println();
//        double[] arr5Rev = new double[]{1.57, 7.654, 9.986};
//        for (int i = arr5Rev.length-1; i >=0; i--) {
//            if (i == 0) {
//                System.out.print(arr5Rev[i]);
//            } else if (i < arr5Rev.length) {
//                System.out.print(arr5Rev[i] + ", ");
//            }
//        }
//        System.out.println();
//        int[] arr6Rev = {4, 5, 6, 7, 8, 9};
//        for (int i = arr6Rev.length-1; i >=0; i--) {
//            if (i == 0) {
//                System.out.print(arr6Rev[i]);
//            } else if (i < arr6Rev.length) {
//                System.out.print(arr6Rev[i] + ", ");
//            }
//        }
//
//        System.out.println();
//        System.out.println();
//
//        System.out.println("задача 4");
//        int[] arr4even = new int[]{1, 2, 3};
//        for (int i = 0; i < arr4even.length; i++) {
//            if (arr4even[i] % 2 !=0) {
//                System.out.print(arr4even[i] + 1 + " ");
//            } else {
//                System.out.print(arr4even[i] + " ");
//            }
//        }
//        System.out.println();
//        System.out.println();
//
//        System.out.println("задача 2.1");
//
//        int[] payments = generateRandomArray();
//        int sum = 0;
//        for (int i = 0; i < payments.length; i++) {
//            sum = sum + payments[i];
//        }
//        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
//
//        System.out.println();
//
//        System.out.println("задача 2.2");
//        int[] expenses = generateRandomArray();
//        int max = expenses[0];
//        int min = expenses[0];
//        for (int i = 0; i < expenses.length; i++) {
//            if (expenses[i] > max) {
//                max = expenses[i];
//            }
//        }
//        for (int i = 0; i < expenses.length; i++) {
//            if (expenses[i] < min) {
//                min = expenses[i];
//            }
//        }
//        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
//        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
//
//        System.out.println();
//
//        System.out.println("задача 2.3");
//        int[] sumPerMonth = generateRandomArray();
//        float daySum = 0;
//        for (int i = 0; i < sumPerMonth.length; i++) {
//            daySum = daySum + sumPerMonth[i];
//        }
//        float average = daySum / (float) sumPerMonth.length;
//        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
//
//        System.out.println();
//
//        System.out.println("задача 2.4");
//        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
//        for (int i = reverseFullName.length-1; i >=0; i--) {
//            System.out.print(reverseFullName[i]);
//        }
//        System.out.println();
//        System.out.println();
//
//        System.out.println("задача 2.5");
//        int[][] array2D = new int[3][5];
//        for (int i = 0; i < array2D.length; i++) {
//            for (int j = 0; j < array2D[i].length; j++) {
//                array2D[i][j] = 1;
//            }
//        }
//        for (int i = 0; i < array2D.length; i++) {
//            for (int j = 0; j < array2D[i].length; j++) {
//                System.out.print(array2D[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        System.out.println("задача 2.5.1");
//        int[][] matrix = new int[5][5];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = 1;
//                // matrix[i][matrix.length - 1 - i] = 1;
//            }
//        }
//        for (int[] row : matrix) {
//            for (int column : row) {
//                System.out.print(column + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//        System.out.println("задача 2.6");
//        int[] array2 = {5, 4, 3, 2, 1};
//        int[] buffer = new int[array2.length];
//        for (int i = 0; i < array2.length; i++) {
//            buffer[i] = array2[array2.length - 1 - i];
//        }
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(buffer));
//
//        System.out.println();
//
//        System.out.println("задача 2.7");
//        int[] array3 = {5, 4, 3, 2, 1};
//        System.out.println(Arrays.toString(array2));
//        int leftIndex1 = 0;
//        int rightIndex1 = array3.length-1;
//        while (leftIndex1 < rightIndex1) {
//            int tmp = array3[leftIndex1];
//            array3[leftIndex1] = array3[rightIndex1];
//            array3[rightIndex1] = tmp;
//            leftIndex1++;
//            rightIndex1--;
//        }
//        System.out.println(Arrays.toString(array3));
//        System.out.println();
//        System.out.println();
//
//        System.out.println("задача 2.8");
//        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
//        int numberToFind1 = -2;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                int firstNumber = arr[i];
//                int secondNumber = arr[j];
//                if (firstNumber + secondNumber == -2) {
//                    System.out.println("Found " + firstNumber + " and " + secondNumber);
//                }
//            }
//        }
//        System.out.println("задача 2.8.1");
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int leftIndex = 0;
//        int rightIndex = arr.length-1;
//        while (leftIndex < rightIndex) {
//            int sum2 = arr[leftIndex] + arr[rightIndex];
//            if (sum2 == numberToFind1) {
//                System.out.println("Found " + arr[leftIndex] + " " + arr[rightIndex]);
//                break;
//            } else if (sum2 > numberToFind1) {
//                rightIndex--;
//            } else {
//                leftIndex++;
//            }
//        }
//
//        System.out.println();
//
//        System.out.println("задача 2.9");
//        int[] array = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
//        int numberToFind = -2;
//        Arrays.sort(array);
//        int first = 0;
//        int last = array.length-1;
//        while (first < last) {
//            int sum1 = array[first] + array[last];
//            if (sum1 == numberToFind) {
//                System.out.println("Found " + array[first++] + " and " + array[last--]);
//            } else if (sum1 > numberToFind) {
//                last--;
//            }  else {
//                first++;
//            }
//        }
//
//
//
//
//
//
//
//
//
//    }
//
//
//        public static int[] generateRandomArray() {
//            java.util.Random random = new java.util.Random();
//            int[] arr = new int[30];
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = random.nextInt(100_000) + 100_000;
//            }
//            return arr;
//        }
//
//}
// 112  
//src/homework_6_String/String/main.java
//Viewed
//@@ -0,0 +1,112 @@
//package homework_6_String.String;
//
//public class main {
//
//    public static void main(String[] args) {
//
//        System.out.println("Задание 1");
//        String firstName = "Ivan";
//        firstName = " " + firstName;
//        String middleName = "Ivanovich";
//        middleName = " " + middleName;
//        String lastName = "Ivanov";
//        String fullName = lastName + firstName + middleName;
//        System.out.println("ФИО сотрудника — " + fullName);
//
//        System.out.println("Задание 2");
//        String firstNameUp = firstName.toUpperCase();
//        String middleNameUp = middleName.toUpperCase();
//        String lastNameUp = lastName.toUpperCase();
//        String fullNameUp = lastNameUp + firstNameUp + middleNameUp;
//        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUp);
//
//        System.out.println("Задание 3");
//        fullNameUp = fullNameUp.replace(" ", "; ");
//        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUp);
//
//        System.out.println("Задание 4.1");
//        String fullNameNew = fullName.replace("Ivanov Ivan Ivanovich", "Иванов Семён Семёнович");
//        fullNameNew = fullNameNew.replace("ё", "е");
//        System.out.println("Данные ФИО сотрудника — " + fullNameNew);
//
//        System.out.println("Задание 4.2");
//        String fullNameNew1 = "Иванов Семён Семёнович";
//        String[] letterChange = fullNameNew1.split(" ");
//        System.out.print("Данные ФИО сотрудника — ");
//        for (int i = 0; i < letterChange.length; i++) {
//            if (letterChange[i].contains("a")) {
//                letterChange[i] = letterChange[i].replace('ё', 'е');
//            }
//        }
//        String result1 = String.join(" ", letterChange);
//        System.out.println(result1);
//
//        System.out.println("Задание 5");
//        String fullName2 = "Ivanov Ivan Ivanovich";
//        int index = fullName2.indexOf(" ");
//        int lastIndex = fullName2.lastIndexOf(" ");
//        String lastName2 = fullName2.substring(0,fullName2.indexOf(" "));
//        String firstName2 = fullName2.substring(fullName2.indexOf(" ") + 1, fullName2.lastIndexOf(" "));
//        String middleName2 = fullName2.substring(fullName2.lastIndexOf(" ") + 1);
//        System.out.println("Last name " + lastName2);
//        System.out.println("First name " + firstName2);
//        System.out.println("Middle name " + middleName2);
//
//        System.out.println("Задание 6.1");
//        String fullName3 = "Ivanov Ivan Ivanovich";
//        String[] words = fullName3.split(" ");
//        for (int i = 0; i < words.length; i++) {
//            char [] chars = words[i].toCharArray();
//            if (Character.isLowerCase(chars[0])) {
//                chars[0] = Character.toUpperCase(chars[0]);
//                words[i] = new String(chars);
//            }
//        }
//        System.out.println(String.join(" ", words));
//
//
//        System.out.println("Задание 6.2");
//        String fullName11 = "ivanov ivan ivanovich";
//        String fullName111 = "";
//        char[] s = fullName.toCharArray();
//        for (int i = 0; i < s.length; i++) {
//            if (i == 0 || s[i - 1] == ' ') {
//                s[i] = Character.toUpperCase(s[i]);
//            }
//        }
//        for (int i = 0; i < s.length; i++) {
//            fullName11 = fullName11 + s[i];
//        }
//        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв  " + fullName11);
//
//
//        System.out.println("Задание 7");
//        String s1 = "135";
//        String s2 = "246";
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < s1.length(); i++) {
//            sb.append(s1.charAt(i));
//            sb.append(s2.charAt(i));
//        }
//        String result = sb.toString();
//        System.out.println(sb);
//
//
//
//        System.out.println("Задание 8");
//        StringBuilder sb1 = new StringBuilder();
//        String message = "aabccddefgghiijjkk";
//        char duplicate = ' ';
//        char[] letters = message.toCharArray();
//        for (int i = 0; i < letters.length-1; i++) {
//            if(letters[i] == letters[i + 1] && duplicate != letters[i]) {
//                sb.append(letters[i]);
//                duplicate = letters[i + 1];
//            }
//            System.out.println(sb.toString());
//        }
//
//
//
//    }
//}
// 148  
//src/homework_7_Methods/Methods/main.java
//Viewed
//@@ -0,0 +1,148 @@
//package homework_7_Methods.Methods;
//
//import java.util.Arrays;
//
//public class main {
//
//    //Homework 1
//    public static boolean isLeapYear(int year) {
//        return (year % 4 == 0) && (year % 100 !=0) || (year % 400 == 0);
//    }
//    private static void printIsLeapYear(int year) {
//        if (isLeapYear(year)) {
//            System.out.println("номер года — " + year + " високосный год");
//        } else {
//            System.out.println("номер года — " + year + " не високосный год");
//        }
//    }
//
////===============================================================================================
////Homework 2
//
//    public static void getClientOS(int clientOS, int currentYear) {
//        if ((clientOS == 1) && currentYear < 2015) {
//            System.out.println("Установите облегченную версию приложения для " + clientOS + " по ссылке");
//        } else if ((clientOS == 1) && currentYear > 2015) {
//            System.out.println("Установите версию приложения для " + clientOS + " по ссылке");
//        } else if ((clientOS == 0) && currentYear < 2015) {
//            System.out.println("Установите облегченную версию приложения для " + clientOS + " по ссылке");
//        } else {
//            System.out.println("Установите версию приложения для " + clientOS + " по ссылке");
//        }
//    }
////===============================================================================================
////Homework 3
//
//    public static int deliveryDistance(int distance) {
//        int deliveryDay = 1;
//        if (distance <= 20) {
//            System.out.println("Потребуется дней " + deliveryDay);
//        } else if(distance > 20 && distance <= 60) {
//            System.out.println("Потребуется дней " + ++deliveryDay);
//        } else if (distance > 60 && distance <= 100) {
//            System.out.println("Потребуется дней " + (deliveryDay + 2));
//        }
//        return(deliveryDay);
//    }
//
//
////===============================================================================================
////Homework 4
//
//    public static void findDuplicates(String duplicates) {
//        char [] letters = duplicates.toCharArray();
//        System.out.print("Found Duplicate: ");
//        for(int i = 1; i < letters.length; i++) {
//            if (letters[i] == letters[i-1]) {
//                System.out.print(letters[i] + " ");
//            }
//        }
//    }
//
//    //===============================================================================================
//    //homework 5
//    public static void reverse (char[] reverseArr) {
//        for(int i = reverseArr.length-1; i>=0; i--){
//            System.out.print(reverseArr[i] + " ");
//        }
//    }
//
//    public static void reverseArray (int[] reverseArr) {
//        int leftIndex = 0;
//        int rightIndex = reverseArr.length -1;
//        while (leftIndex < rightIndex) {
//            int letter = reverseArr[leftIndex];
//            reverseArr[leftIndex] = reverseArr[rightIndex];
//            reverseArr[rightIndex] = letter;
//            leftIndex++;
//            rightIndex--;
//        }
//        System.out.println(Arrays.toString(reverseArr));
//    }
//
//
//
////===============================================================================================
//
//    public static void main(String[] args) {
//
////Homework 1
//        printIsLeapYear(2022);
//
////===============================================================================================
////Homework 2
//        getClientOS(0, 2015);
//
////===============================================================================================
////Homework 3
//        deliveryDistance(100);
//
////===============================================================================================
////Homework 4
//        String signs = "aabccddefgghiijjkk";
//        findDuplicates(signs);
//        System.out.println();
//
//
////===============================================================================================
////Homework 5
//
//        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
//        reverse(reverseFullName);
//
//        System.out.println();
//
//        int[] reverseArr = {5, 3, 6, 8, 9};
//        reverseArray(reverseArr);
////===============================================================================================
////Homework 6
//
////Снова вспоминаем домашнее задание по массивам. В нем была задача, которая
//// требовала высчитать среднюю выплату за день.
////Нужно написать программу, которая посчитает среднее значение трат за месяц
//// (то есть сумму всех трат за месяц поделить на количество дней), и
//// вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
////Важно помнить: подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).
////Нужно сгенерировать массив, подать его в наш метод, а внутри метода
//// подсчитать сумму элементов и вычислить среднее значение, которое
//// нужно вернуть из метода в виде результата.
////Сложность в том, что метод нужно не просто написать, но еще и декомпозировать.
////То есть для работы этого метода нужно будет создать еще методы
//// (1 или более), которые его будут обслуживать и вычислять промежуточные результаты.
//// Среднее значение нужно вычислять в дробном виде, так как результат должен быть точным.
//
//
//
//    }
//
//    public static int[] generateRandomArray() {
//        java.util.Random random = new java.util.Random();
//        int[] arr = new int[30];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(100_000) + 100_000;
//        }
//        return arr;
//    }
//
//}
//
// 19  
//src/homework_8_Objects/Objects/Author.java
//Viewed
//@@ -0,0 +1,19 @@
//package homework_8_Objects.Objects;
//
//public class Author {
//    private final String nameOfAuthor;
//    private final String surnameOfAuthor;
//
//    public Author(String nameOfAuthor, String surnameOfAuthor) {
//        this.nameOfAuthor = nameOfAuthor;
//        this.surnameOfAuthor = surnameOfAuthor;
//    }
//
//    public String getNameOfAuthor() {
//        return this.nameOfAuthor;
//    }
//
//    public String getSurnameOfAuthor() {
//        return this.surnameOfAuthor;
//    }
//}
// 26  
//src/homework_8_Objects/Objects/Book.java
//Viewed
//@@ -0,0 +1,26 @@
//package homework_8_Objects.Objects;
//
//public class Book {
//
//    private final String titleOfBook;
//    private final Author author;
//    private int yearOfPublication;
//
//    public Book(String titleOfBook, Author author, int yearOfPublication) {
//        this.titleOfBook = titleOfBook;
//        this.author = author;
//        this.yearOfPublication = yearOfPublication;
//    }
//    public String getTitleOfBook() {
//        return this.titleOfBook;
//    }
//    public Author getAuthor() {
//        return this.author;
//    }
//    public int getYearOfPublication() {
//        return this.yearOfPublication;
//    }
//    public void setYearOfPublication(int yearOfPublication) {
//        this.yearOfPublication = yearOfPublication;
//    }
//}
// 27  
//src/homework_8_Objects/Objects/main.java
//Viewed
//@@ -0,0 +1,27 @@
//package homework_8_Objects.Objects;
//
//public class main {
//
//    public static void main(String[] args) {
//
//        Book book1 = new Book("Иди туда где страшно",
//                new Author("Джим", "Лоулесс"), 2017);
//        System.out.println("book1.titleOfBook = " + book1.getTitleOfBook());
//        System.out.println("book1.nameOfAuthor = "
//                + book1.getAuthor().getNameOfAuthor() + " "
//                + book1.getAuthor().getSurnameOfAuthor());
//        System.out.println("book1.yearOfPublication = " + book1.getYearOfPublication());
//        book1.setYearOfPublication(2020);
//        System.out.println("book1.getYearOfPublication() = " + book1.getYearOfPublication());
//
//        Book book2 = new Book("Исповедь экономического убийцы",
//                new Author("Джон", "Перкинс"), 2018);
//        System.out.println("book2.titleOfBook = " + book2.getTitleOfBook());
//        System.out.println("book2.nameOfAuthor = "
//                + book2.getAuthor().getNameOfAuthor() + " "
//                + book2.getAuthor().getSurnameOfAuthor());
//        System.out.println("book2.yearOfPublication = " + book2.getYearOfPublication());
//
//
//    }
//}
// 19  
//src/homework_8_Objects_Hard/AuthorHard.java
//Viewed
//@@ -0,0 +1,19 @@
//package homework_8_Objects_Hard;
//
//public class AuthorHard {
//
//    private final String nameOfAuthor;
//    private final String surnameOfAuthor;
//
//    public AuthorHard(String nameOfAuthor, String surnameOfAuthor) {
//        this.nameOfAuthor = nameOfAuthor;
//        this.surnameOfAuthor = surnameOfAuthor;
//    }
//
//    public String getNameOfAuthor() {
//        return this.nameOfAuthor;
//    }
//    public String getSurnameOfAuthor() {
//        return this.surnameOfAuthor;
//    }
//}
// 30  
//src/homework_8_Objects_Hard/BookHard.java
//Viewed
//@@ -0,0 +1,30 @@
//package homework_8_Objects_Hard;
//
//public class BookHard {
//
//    private final String titleOfBook;
//    private final AuthorHard author;
//    private int yearOfPublication;
//
//    public BookHard(String titleOfBook, AuthorHard author, int yearOfPublication) {
//        this.titleOfBook = titleOfBook;
//        this.author = author;
//        this.yearOfPublication = yearOfPublication;
//    }
//
//    public String getTitleOfBook() {
//        return this.titleOfBook;
//    }
//
//    public AuthorHard getAuthor() {
//        return this.author;
//    }
//
//    public int getYearOfPublication() {
//        return this.yearOfPublication;
//    }
//
//    public void setYearOfPublication(int yearOfPublication) {
//        this.yearOfPublication = yearOfPublication;
//    }
//}
// 32  
//src/homework_8_Objects_Hard/LibraryHard.java
//Viewed
//@@ -0,0 +1,32 @@
//package homework_8_Objects_Hard;
//
//public class LibraryHard {
//
//    private final BookHard[] books;
//
//    public LibraryHard(int size){
//        books = new BookHard[size];
//    }
//
//    public boolean addBook(BookHard newBook) {
//        for (int i = 0; i < books.length; i++) {
//            if (books[i] == null) {
//                books[i] = newBook;
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public void printBookInfo(BookHard bookName) {
//        for (BookHard newBook : books) {
//            if (newBook != null && newBook.getTitleOfBook().equals(bookName)) {
//                System.out.println(newBook.getTitleOfBook() +  " by" + newBook.getAuthor().getNameOfAuthor() +
//                        newBook.getAuthor().getSurnameOfAuthor() + " was published in " +
//                        newBook.getYearOfPublication());
//                return;
//            }
//        }
//        System.out.println("Book " + bookName + " was not found");
//    }
//}
// 60  
//src/homework_8_Objects_Hard/Main.java
//Viewed
//@@ -0,0 +1,60 @@
//package homework_8_Objects_Hard;
//
//public class Main {
//
//
//    public static void main(String[] args) {
//        LibraryHard library = new LibraryHard(5);
//
//        BookHard newBook1 = new BookHard("Title1",
//                new AuthorHard("Name1", "Surname1"), 2001);
//        BookHard newBook2 = new BookHard("Title2",
//                    new AuthorHard("Name2", "Surname2"), 2002);
//        BookHard newBook3 = new BookHard("Title3",
//                    new AuthorHard("Name3", "Surname3"), 2003);
//        BookHard newBook4 = new BookHard("Title4",
//                    new AuthorHard("Name4", "Surname4"), 2004);
//        BookHard newBook5 = new BookHard("Title5",
//                    new AuthorHard("Name5", "Surname5"), 2005);
//
//        BookHard[] books = new BookHard[5];
//        library.addBook(new BookHard("Title5",
//                new AuthorHard("Name5", "Surname5"), 2005));
////        LibraryHard.addBook(books, newBook2);
////        LibraryHard.addBook(books, newBook3);
////        LibraryHard.addBook(books, newBook4);
////        LibraryHard.addBook(books, newBook5);
////        LibraryHard.addBook(new BookHard("Title6", new AuthorHard("Name6",
////                    "Surname6"), 2006));
//
//        for (int i = 0; i < books.length; i++) {
//                if (books[i] != null) {
//                    library.printBookInfo(books[i]);
//                } else {
//                }
//    }
//    }
//}
//
//
////Сложный уровень
////Создать класс Library, который будет иметь своим полем массив из прошлого уровня.
////Учесть, что доступ к нему должен быть только из Library (private поле),
//// а сеттеры и геттеры отсутствуют. Работать с массивом можно только через
//// внутренние нестатические методы класса Library.
////2. Конструктор класса должен получать в качестве параметра размер массива и
//// инициализировать в себе поле массива тем размером, что пришел параметром.
////3. Перенести методы из прошлого уровня в класс Library, сделать их нестатическими.
////4. Создать новые нестатические методы в классе Library:
////Напечатать информацию о книге по ее названию, которое приходит в метод в качестве параметра.
////       Формат: “The Stand by Stephen King was published in 1978”
////Изменить год публикации книги по ее названию.
////       В метод подаются два параметра, а именно: название и новый год публикации.
////       Нужно найти книгу и изменить ее год публикации.
////Критерии оценки
////Класс Library создан корректно.
////Массив корректно перенесен в виде поля в класс Library.
////Конструктор класса Library написан корректно.
////Корректно перенесены методы, модификатор static удален.
////Объявлены новые методы.
////Методы корректно справляются со своей задачей.
// 19  
//src/homework_8_Objects_Middle/AuthorMiddle.java
//Viewed
//@@ -0,0 +1,19 @@
//package homework_8_Objects_Middle;
//
//    public class AuthorMiddle {
//    private final String nameOfAuthor;
//    private final String surnameOfAuthor;
//
//    public AuthorMiddle(String nameOfAuthor, String surnameOfAuthor) {
//        this.nameOfAuthor = nameOfAuthor;
//        this.surnameOfAuthor = surnameOfAuthor;
//    }
//
//    public String getNameOfAuthor() {
//        return this.nameOfAuthor;
//    }
//
//    public String getSurnameOfAuthor() {
//        return this.surnameOfAuthor;
//    }
//}
// 28  
//src/homework_8_Objects_Middle/BookMiddle.java
//Viewed
//@@ -0,0 +1,28 @@
//package homework_8_Objects_Middle;
//
//public class BookMiddle {
//
//    private final String titleOfBook;
//    private final AuthorMiddle author;
//    private int yearOfPublication;
//
//    public BookMiddle(String titleOfBook, AuthorMiddle author, int yearOfPublication) {
//        this.titleOfBook = titleOfBook;
//        this.author = author;
//        this.yearOfPublication = yearOfPublication;
//    }
//    public String getTitleOfBook() {
//        return this.titleOfBook;
//    }
//
//    public AuthorMiddle getAuthor() {
//        return this.author;
//    }
//
//    public int getYearOfPublication() {
//        return this.yearOfPublication;
//    }
//    public void setYearOfPublication(int yearOfPublication) {
//        this.yearOfPublication = yearOfPublication;
//    }
//}
// 59  
//src/homework_8_Objects_Middle/Main.java
//Viewed
//@@ -0,0 +1,59 @@
//package homework_8_Objects_Middle;
//import homework_8_Objects_Middle.AuthorMiddle;
//import homework_8_Objects_Middle.BookMiddle;
//
//public class Main {
//
//    private static boolean addBook(BookMiddle[] books, BookMiddle newBook) {
//        for (int i = 0; i < books.length; i++) {
//            if (books[i] == null) {
//                books[i] = newBook;
//                return true;
//            }
//        }
//        return false;
//    }
//
//    private static void printBook(BookMiddle books) {
//        System.out.println(String.join("; ", books.getAuthor().getNameOfAuthor() + " " +
//                        books.getAuthor().getSurnameOfAuthor(), books.getTitleOfBook(),
//                String.valueOf(books.getYearOfPublication())));
//    }
//
//
//    public static void main(String[] args) {
//        BookMiddle newBook1 = new BookMiddle("Title1",
//                new AuthorMiddle("Name1", "Surname1"), 2001);
//        BookMiddle newBook2 = new BookMiddle("Title2",
//                new AuthorMiddle("Name2", "Surname2"), 2002);
//        BookMiddle newBook3 = new BookMiddle("Title3",
//                new AuthorMiddle("Name3", "Surname3"), 2003);
//        BookMiddle newBook4 = new BookMiddle("Title4",
//                new AuthorMiddle("Name4", "Surname4"), 2004);
//        BookMiddle newBook5 = new BookMiddle("Title5",
//                new AuthorMiddle("Name5", "Surname5"), 2005);
//
//
//        BookMiddle[] books = new BookMiddle[5];
//        addBook(books, newBook1);
//        addBook(books, newBook2);
//        addBook(books, newBook3);
//        addBook(books, newBook4);
//        addBook(books, newBook5);
//        addBook(books, new BookMiddle("Title6", new AuthorMiddle("Name6",
//                "Surname6"), 2006));
//
//        for (int i = 0; i < books.length; i++) {
//            if (books[i] != null) {
//                printBook(books[i]);
//            } else {
//                System.out.println("Not enough space");
//            }
//        }
////          for (BookMiddle book : books) {
////            if (book != null) {
////                printBook(book);
////            }
////        }
//    }
//}
// 45  
//src/homework_9_Objects_Methods/Objects/Methods/Author.java
//Viewed
//@@ -0,0 +1,45 @@
//package homework_9_Objects_Methods.Objects.Methods;
//
//import java.util.Objects;
//
//public class Author {
//    private final String nameOfAuthor;
//    private final String surnameOfAuthor;
//
//    @Override
//    public String toString() {
//        return "Name Of Author - " + nameOfAuthor + "; " + "Surname Of Author - " +
//                surnameOfAuthor + "; ";
//    }
//
//    @Override
//    public boolean equals(Object other) {
//        if (this == other) return true;
//        if (this.getClass() != other.getClass()) {
//            return false;
//        }
//        Author author = (Author) other;
//        return nameOfAuthor.equals(author.nameOfAuthor)
//                && surnameOfAuthor.equals(author.surnameOfAuthor);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(nameOfAuthor, surnameOfAuthor);
//    }
//
//    public Author(String nameOfAuthor, String surnameOfAuthor) {
//        this.nameOfAuthor = nameOfAuthor;
//        this.surnameOfAuthor = surnameOfAuthor;
//    }
//
//    public String getNameOfAuthor() {
//        return this.nameOfAuthor;
//    }
//
//    public String getSurnameOfAuthor() {
//        return this.surnameOfAuthor;
//
//
//    }
//}
// 50  
//src/homework_9_Objects_Methods/Objects/Methods/Book.java
//Viewed
//@@ -0,0 +1,50 @@
//package homework_9_Objects_Methods.Objects.Methods;
//
//import java.util.Objects;
//
//public class Book {
//    private final String titleOfBook;
//    private final Author author;
//    private int yearOfPublication;
//
//    @Override
//    public String toString() {
//        return "Title Of Book - " + titleOfBook + "; " + author + "Year Of Publication - "
//                + yearOfPublication;
//    }
//
//    @Override
//    public boolean equals(Object other) {
//        if (this == other) return true;
//        if (this.getClass() != other.getClass()) {
//            return false;
//        }
//        Book book = (Book) other;
//        return titleOfBook.equals(book.titleOfBook)
//                && author.equals(book.author)
//                && yearOfPublication == (book.yearOfPublication);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(titleOfBook, author, yearOfPublication);
//    }
//
//    public Book(String titleOfBook, Author author, int yearOfPublication) {
//        this.titleOfBook = titleOfBook;
//        this.author = author;
//        this.yearOfPublication = yearOfPublication;
//    }
//    public String getTitleOfBook() {
//        return this.titleOfBook;
//    }
//    public Author getAuthor() {
//        return this.author;
//    }
//    public int getYearOfPublication() {
//        return this.yearOfPublication;
//    }
//    public void setYearOfPublication(int yearOfPublication) {
//        this.yearOfPublication = yearOfPublication;
//    }
//}
// 31  
//src/homework_9_Objects_Methods/Objects/Methods/main.java
//Viewed
//@@ -0,0 +1,31 @@
//package homework_9_Objects_Methods.Objects.Methods;
//
//public class main {
//
//
//
//    public static void main(String[] args) {
//
//        Book book1 = new Book("Иди туда где страшно",
//                new Author("Джим", "Лоулесс"), 2017);
//        book1.setYearOfPublication(2020);
//        System.out.println(book1);
//
//        Book book2 = new Book("Исповедь экономического убийцы",
//                new Author("Джон", "Перкинс"), 2018);
//        System.out.println(book2);
//
//
//        Book book3 = new Book("Исповедь экономического убийцы",
//                new Author("Джон", "Перкинс"), 2018);
//        System.out.println(book3);
//
//        System.out.println(book1.equals(book3));
//        System.out.println(book2.equals(book3));
//
//        System.out.println(new Author("John", "Perkins").hashCode());
//        System.out.println(new Book("Исповедь экономического убийцы",
//                new Author("John", "Perkins"),
//                2018).hashCode());
//    }
//}
// 110  
//src/homewrok_1_Variables/Variables/Main.java
//Viewed
//@@ -1,2 +1,110 @@
//package homewrok_1_Variables.Variables;public class Main {
//package homewrok_1_Variables.Variables;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        System.out.print("Задача 1");
//        byte by = 10;
//        short s = 32_767;
//        int i = 2_147_483_647;
//        long l = 9_223_372_036_854_775_807L;
//        float f = 9_999_999_999_999_999_997.77777777f;
//        double db = 9_999_999_999_999_999_999_997.9777777777;
//        char ch = 20000;
//        int age = 20;
//        boolean adult = age > 18;
//        System.out.println("\n" + by + " " + s + "\n");
//
//        System.out.println("Задача 2");
//        float boxer1 = 78.2f;
//        float boxer2 = 82.7f;
//        float totalWeight = boxer1 + boxer2;
//        float weightDifference = Math.abs(boxer1 - boxer2);
//        System.out.println("Total Weight is " + totalWeight);
//        System.out.println("Weight Difference is " + weightDifference);
//        System.out.println();
//
//        System.out.println("Задача 3");
//        int bananasWeightGr = 80;
//        byte bananasQty = 5;
//        int totalBananasWeight = bananasWeightGr * bananasQty;
//        int milkVolumeGrPer100Ml = 105;
//        int milkVolumePerML = 200;
//        int totalMilkVolume = (milkVolumeGrPer100Ml * milkVolumePerML)/100;
//        int iceCreamWeightGr = 100;
//        int iceCreamQty = 2;
//        int totalIceCreamWeight = iceCreamWeightGr * iceCreamQty;
//        int eggsWeight = 70;
//        int eggsQty = 4;
//        int totalEggsWeightWeight = eggsWeight * eggsQty;
//        float totalBreakfastWeight = totalBananasWeight + totalMilkVolume +
//                totalIceCreamWeight + totalEggsWeightWeight;
//        float grToKg = totalBreakfastWeight/1000;
//        System.out.println("Breakfast weight is " + grToKg + " kg");
//        System.out.println();
//
//        System.out.println("Задача 4");
//        int weightToLooseKg = 7;
//        int kgToGr = weightToLooseKg * 1000;
//        int loose250GrPerDay = 250;
//        int loose500GrPerDay = 500;
//        int howManyDaysIf250Gr = kgToGr / loose250GrPerDay;
//        int howManyDaysIf500Gr = kgToGr / loose500GrPerDay;
//        System.out.println("Will take " + howManyDaysIf250Gr + " days");
//        System.out.println("Will take " + howManyDaysIf500Gr + " days");
//        int totalApproximateDays = (howManyDaysIf250Gr + howManyDaysIf500Gr)/2;
//        System.out.println("Approximate days " + totalApproximateDays);
//        System.out.println();
//
//        System.out.println("Задача 5");
//        int months = 12;
//        float percentPerMonth = 0.1f;
//        int mashaOldSalary = 67760;
//        float mashaNewSalary = mashaOldSalary + (mashaOldSalary * percentPerMonth);
//        float mashaSalaryDifference = mashaNewSalary - mashaOldSalary;
//        float mashaSalaryDifferencePerYear = mashaSalaryDifference * months;
//        int denisOldSalary = 83690;
//        float denisNewSalary = denisOldSalary + (denisOldSalary * percentPerMonth);
//        float denisSalaryDifference = denisNewSalary - denisOldSalary;
//        float denisSalaryDifferencePerYear = denisSalaryDifference * months;
//        int kristinaOldSalary = 76230;
//        float kristinaNewSalary = kristinaOldSalary + (kristinaOldSalary * percentPerMonth);
//        float kristinaSalaryDifference = kristinaNewSalary - kristinaOldSalary;
//        float kristinaSalaryDifferencePerYear = kristinaSalaryDifference * months;
//        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. " +
//                " Годовой доход вырос на " + mashaSalaryDifferencePerYear + " рублей");
//        System.out.println("Denis теперь получает " + denisNewSalary + " рублей. " +
//                " Годовой доход вырос на " + denisSalaryDifferencePerYear + " рублей");
//        System.out.println("Kristina теперь получает " + kristinaNewSalary + " рублей. " +
//                " Годовой доход вырос на " + kristinaSalaryDifferencePerYear + " рублей");
//        System.out.println();
//
//        System.out.println("Задача 6");
//        int aa = 12;
//        int bb = 27;
//        int c = 44;
//        int d = 15;
//        int e = 9;
//        int result = (aa * (bb + (c - d * e))) * (-1);
//        int result1 = Math.abs(aa * (bb + (c - d * e)));
//        System.out.println(result);
//        System.out.println(result1);
//        System.out.println();
//
//        System.out.println("Задача 7");
//        int a = 5;
//        int b = 7;
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println("a = " + a + " b = " + b);
//        System.out.println();
//
//        System.out.println("Задача 8");
//        int a1 = 256;
//        int b1 = (a1 % 100)/10;
//        System.out.println(b1);
//
//    }
//}
// 6  
//src/ru/skypro/Main.java
//Viewed
//@@ -1,8 +1,8 @@
//package ru.skypro;
//
//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here
//
//
//    }
//}
//}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        package ru.skypro;
//
//import java.util.Objects;
//
//public class Employee {
//    private final String firstName;
//    private final String lastName;
//    private final String middleName;
//    private float salary;
//    private int department;
//    private final int id;
//   private static int counter = 1;
//
//    public Employee(String firstName, String lastName, String middleName, float salary, int department) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.middleName = middleName;
//        this.salary = salary;
//        this.department = department;
//        this.id = counter++;
//    }
//
//    @Override
//    public String toString() {
//        return "FirstName: " + firstName + ",  LastName: " + lastName + ",  MiddleName: "
//                + middleName + ",  Salary: " + salary + ", Department: " + department + ", ID: " + id;
//    }
//    public static int getId() {
//        return 0;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//    public String getLastName() {
//        return lastName;
//    }
//    public String getMiddleName() {
//        return middleName;
//    }
//    public float getSalary() {
//        return salary;
//    }
//    public int getDepartment() {
//        return department;
//    }
//
//    public void setSalary(float salary) {
//        this.salary = salary;
//    }
//    public void setDepartment(int department) {
//        this.department = department;
//    }
//
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return Float.compare(employee.salary, salary) == 0 && department == employee.department && id == employee.id && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(middleName, employee.middleName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(firstName, lastName, middleName, salary, department, id);
//    }
//}
// 181
//src/ru/skypro/Main.java
//Viewed
//@@ -1,8 +1,185 @@
//package ru.skypro;
//
//import java.util.Arrays;
//
//public class Main {
//    //1.1 Получить список всех сотрудников со всеми имеющимися по ним данными
//    // Add employees
//    public static boolean addEmployee(Employee[] employees, Employee newEmployee) {
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i] == null) {
//                employees[i] = newEmployee;
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//	// write your code here
//    //1.2 Получить список всех сотрудников со всеми имеющимися по ним данными
//    // (вывести в консоль значения всех полей (toString)).
//    public static void printAllEmployees(Employee[] employees) {
//        System.out.println("List of All employees");
//        for (Employee employee : employees) {
//            if (employee != null) {
//                System.out.println(employee);
//            }
//        }
//    }
//
////2. Посчитать сумму затрат на зарплаты в месяц.
//    private static float calculateTotalSalary(Employee[] employees) {
//        float sum = 0;
//        for (Employee employee : employees) {
//            if (employee != null) {
//                sum += employee.getSalary();
//            }
//        }
//        System.out.println("Сумма затрат на зарплаты в месяц составляет " + sum);
//        return sum;
//    }
//
//    //3. Найти сотрудника с минимальной зарплатой.
//    private static Employee minimumSalaryEmployee(Employee[] employees) {
//        Employee result = employees[0];
//        float min = employees[0].getSalary();
//           int index = 0;
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i] != null && employees[i].getSalary() < min) {
//                min = employees[i].getSalary();
//                index = i;
//            }
//            }
//        System.out.println("Сумма минимальной зарплаты в месяц составляет " + min +
//                " и это сотрудник " + employees[index]);
//        return employees[index];
//    }
//
//    //4. Найти сотрудника с максимальной зарплатой.
//    private static Employee maximumSalary(Employee[] employees) {
//        float max = employees[0].getSalary();
//        int index = 0;
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i] != null && employees[i].getSalary() > max) {
//                max = employees[i].getSalary();
//                index = i;
//            }
//        }
//        System.out.println("Сумма максимальной зарплаты в месяц составляет " + max +
//                " и это сотрудник " + employees[index]);
//        return employees[index];
//    }
//
//    //5. Подсчитать среднее значение зарплат.
//    private static float printAverageSalaries(Employee[] employees) {
//        float sum = 0;
//        int employeesQty = 0;
//        for (int i=0; i < employees.length; i ++){
//            if (employees[i] != null) {
//                sum += employees[i].getSalary();
//            }
//}
//        for (int i=0; i < employees.length; i ++){
//            if (employees[i] != null) {
//                employeesQty = i + 1;
//            }
//        }
//        float average = sum / employeesQty;
//        System.out.println("Средняя сумма затрат на зарплаты в месяц составляет " + average);
//        return sum;
//    }
//
//    //6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
//    private static void printEmployeeName(Employee[] employeeNames) {
//        System.out.println("Ф. И. О. всех сотрудников ");
//        for (Employee employeeName : employeeNames) {
//            if (employeeName != null) {
//                System.out.println("Ф. И. О. сотрудникa " + employeeName.getFirstName() + " " +
//                        employeeName.getLastName() + " " + employeeName.getMiddleName());
//            } else if (employeeName == null) {
//                System.out.println("EMPTY");
//            }
//        }
//    }
//
//
//    //7.Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников
//    // на величину аргумента в %).
//
//    //8.Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
//    //8.1. Сотрудника с минимальной зарплатой.
//    //8.2. Сотрудника с максимальной зарплатой.
//    //8.3. Сумму затрат на зарплату по отделу.
//    //8.4. Среднюю зарплату по отделу (учесть, что количество людей в
//    // отделе отличается от employees.length).
//    //8.5. Проиндексировать зарплату всех сотрудников отдела на процент,
//    // который приходит в качестве параметра.
//    //9. Напечатать всех сотрудников отдела (все данные, кроме отдела).
//    //Получить в качестве параметра число и найти:
//    //9.1. Всех сотрудников с зарплатой меньше числа
//    // (вывести id, Ф. И. О. и зарплатой в консоль).
//    //9.2. Всех сотрудников с зарплатой больше (или равно)
//    // числа (вывести id, Ф. И. О. и зарплатой в консоль).
//
//    //С помощью **шести** методов можно вывести данные:
//    //
//    //- сотрудник с минимальной зарплатой,
//    //- сотрудник с максимальной зарплатой,
//    //- сумма затрат на зарплату по отделу,
//    //- средняя зарплата по отделу,
//    //- индексация зарплаты на %,
//    //- печать всех данных всех сотрудников одного отдела, кроме номера отдела.
//
//
//
//    public static void printEmployees(Employee[] employees) {
//        System.out.println("List of All employees");
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i] != null) {
//            System.out.println(employees[i].toString());
//        }else if (employees[i] == null) {
//                System.out.println("EMPTY");
//            }
//    }
//    }
//
//    public static void main(String[] args) {
//
//        Employee[] employees = new Employee[10];
//        addEmployee(employees, new Employee("Ivan", "Ivanov", "Ivanovich", 100000, 1));
//        addEmployee(employees, new Employee("Pavel", "Pavlov", "Pavlovich", 20000, 2));
//        addEmployee(employees, new Employee("Oleg", "Ivanov", "Olegovich", 30000, 3));
//        addEmployee(employees, new Employee("Ruslan", "Ruslanov", "Ruslanovich", 40000, 4));
//        addEmployee(employees, new Employee("Denis", "Denisov", "Denisovich", 50000, 5));
//        addEmployee(employees, new Employee("Karina", "Markovna", "Olegovna", 60000, 1));
//        addEmployee(employees, new Employee("Kristina", "Mikhalkova", "Ivanovna", 70000, 2));
//        addEmployee(employees, new Employee("Anna", "Petrova", "Pavlovna", 80000, 3));
//        addEmployee(employees, new Employee("Marina", "Ivanova", "Ruslanovna", 90000, 4));
//        addEmployee(employees, new Employee("Diana", "Pavlova", "Denisovna", 250000, 5));
//
//       //1. Получить список всех сотрудников со всеми имеющимися по ним данными (toString)
//        printAllEmployees(employees);
//        System.out.println();
//
//        //2. Посчитать сумму затрат на зарплаты в месяц.
//        calculateTotalSalary(employees);
//        System.out.println();
//
//        //3. Найти сотрудника с минимальной зарплатой.
//        minimumSalaryEmployee(employees);
//        System.out.println();
//
//        //4. Найти сотрудника с максимальной зарплатой.
//        maximumSalary(employees);
//        System.out.println();
//
//        //5. Подсчитать среднее значение зарплат.
//        printAverageSalaries(employees);
//        System.out.println();
//
//        //6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
//        printEmployeeName(employees);
//
//
//   }
//}









    }
}
