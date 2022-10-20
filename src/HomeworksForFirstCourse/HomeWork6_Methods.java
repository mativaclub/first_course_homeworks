package HomeworksForFirstCourse;

import java.util.Arrays;

public class HomeWork6_Methods {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    //        Homework 6.1
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
    private static void printIsLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.println("The Year is Leap " + year);
        } else {
            System.out.println("The year is not Leap " + year);
        }
    }


    //        Homework 6.2
    public static void clientOS(int clientOS, int deviceYear) {
        if ((clientOS == 1) && deviceYear < 2015) {
            System.out.println("Please install the light version for " + clientOS);
        } else if ((clientOS == 1) && deviceYear > 2015) {
            System.out.println("Please install the version for " + clientOS);
        } else if ((clientOS == 0) && deviceYear < 2015) {
            System.out.println("Please install the light version for " + clientOS);
        } else {
            System.out.println("Please install the version for " + clientOS);
        }
    }

    //        Homework 6.3

    public static int deliveryDistance(int distance) {
        int deliveryDay = 1;
        if (distance <= 20) {
            System.out.println(deliveryDay + " days required");
        } else if (distance > 20 && distance <= 60) {
            System.out.println(++deliveryDay + " days required");
        } else if (distance > 60 && distance <= 100) {
            System.out.println((deliveryDay+2) + " days required");
        }
        return deliveryDay;
    }



    //        Homework 6.4

    public static void findDuplicates(String duplicates) {
        char[] letters = duplicates.toCharArray();
        for (int i = 0; i < letters.length-1; i++) {
            if (letters[i] == letters[i + 1]) {
                System.out.println(letters[i] + " is duplicated");
            }
        }
    }


    //        Homework 6.5

    public static void reverseArr(int[] reverseArr) {
        int leftInd = 0;
        int rightInd = reverseArr.length - 1;
        while (leftInd < rightInd) {
            int letter = reverseArr[leftInd];
            reverseArr[leftInd] = reverseArr[rightInd];
            reverseArr[rightInd] = letter;
            leftInd++;
            rightInd--;
        }
        System.out.print(Arrays.toString(reverseArr));
    }

    public static void reverseName(char[] reverseName) {
        for (int i = reverseName.length-1; i >= 0; i--) {
            System.out.print(reverseName[i] + " ");
        }
    }


    //        Homework 6.6

    private static void averageSumPerMonth() {
        int [] average = generateRandomArray();
        double sum = 0;
        for (int i = 0; i < average.length; i++) {
            sum = sum + average[i];
        }
        double averSum = sum / average.length;
        System.out.println("Average sum of expenses during month is " + averSum);
    }





        public static void main (String[]args){

            //        Homework 6.1
            printIsLeapYear(2022);

            //        Homework 6.2
            clientOS(1, 2020);

            //        Homework 6.3
            deliveryDistance(100);

            //        Homework 6.4
            String letters = "aabccddefgghiijjkk";
            findDuplicates(letters);

            //        Homework 6.5

            int[] reverseArr = {5, 3, 6, 8, 9};
            reverseArr(reverseArr);

            char[] reverseName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            reverseName(reverseName);

            //        Homework 6.6
            averageSumPerMonth();





        }
    }
