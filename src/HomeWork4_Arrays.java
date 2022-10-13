import java.util.Arrays;

public class HomeWork4_Arrays {


    public static void main(String[] args) {

        //        Homework 4.1
        int[] array01 = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(array01));

        double[] array02 = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(array02));

        int[] array03 = new int[3];
        array03[0] = 3;
        array03[1] = 7;
        array03[2] = 8;
        System.out.println(array03[0] + ", " + array03[1] + ", " + array03[2]);

        //        Homework 4.2

        int[] array001 = new int[]{1, 2, 3};
        for (int i = 0; i < array001.length; i++) {
            if (i == array001.length - 1) {
                System.out.print(array001[i]);
            } else {
                System.out.print(array001[i] + ", ");
            }
        }

        System.out.println();

        double[] array002 = {1.57, 7.654, 9.986};
        for (int i = 0; i < array002.length; i++) {
            if (i == array002.length - 1) {
                System.out.print(array002[i]);
            } else {
                System.out.print(array002[i] + ", ");
            }
        }

        System.out.println();

        int[] array003 = new int[3];
        array003[0] = 3;
        array003[1] = 7;
        array003[2] = 8;
        for (int i = 0; i < array003.length; i++) {
            if (i == array003.length - 1) {
                System.out.print(array003[i]);
            } else {
                System.out.print(array003[i] + ", ");
            }
        }

        //        Homework 4.3

        int[] arrayRev1 = new int[]{1, 2, 3};
        for (int i = arrayRev1.length - 1; i >= 0 ; i--) {
            if (i == 0) {
                System.out.print(arrayRev1[i]);
            } else {
                System.out.print(arrayRev1[i] + ", ");
            }
        }

        System.out.println();

        double[] arrayRev2 = {1.57, 7.654, 9.986};
        for (int i = arrayRev2.length - 1; i >= 0 ; i--) {
            if (i == 0) {
                System.out.print(arrayRev2[i]);
            } else {
                System.out.print(arrayRev2[i] + ", ");
            }
        }

        System.out.println();

        int[] arrayRev3 = new int[3];
        arrayRev3[0] = 3;
        arrayRev3[1] = 7;
        arrayRev3[2] = 8;
        for (int i = arrayRev3.length - 1; i >= 0 ; i--) {
            if (i == 0) {
                System.out.print(arrayRev3[i]);
            } else {
                System.out.print(arrayRev3[i] + ", ");
            }
        }

        //        Homework 4.4

        int[] arrayEven = new int[]{1, 2, 3};
        for (int i = 0; i < arrayEven.length; i++) {
            if (arrayEven[i] % 2 == 0) {
                System.out.print(arrayEven[i]);
            } else {
                System.out.print(arrayEven[i] + 1);
            }
            if (i == arrayEven.length - 1) {
                System.out.print(" ");
            } else {
                System.out.print(",");
            }
        }
        System.out.println();

        int[] arrayEvenVersion2 = new int[]{1, 2, 3};
        for (int i = 0; i < arrayEvenVersion2.length; i++) {
            if (arrayEvenVersion2[i] % 2 != 0) {
                arrayEvenVersion2[i]++;
            }
            if (i == arrayEvenVersion2.length - 1) {
                System.out.print(arrayEvenVersion2[i] + "");
            } else {
                System.out.print(arrayEvenVersion2[i] + ",");
            }
        }

//        Homework 5.1

        int [] paymentsSum = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < paymentsSum.length; i++) {
            sum += paymentsSum[i];
        }
        System.out.println("Payments sum for the month is " + sum);

//        Homework 5.2

        int [] sumPerDay = generateRandomArray();
        int max = sumPerDay[0];
        int min = sumPerDay[0];
        for (int i = 0; i < sumPerDay.length; i++) {
            if (sumPerDay[i] < min) {
                min = sumPerDay[i];
            }
            if (sumPerDay[i] > max) {
                max = sumPerDay[i];
            }
            System.out.println();
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");


//        Homework 5.3
        int[] averageSum = generateRandomArray();
        float sum1 = 0;
        for (int i = 0; i < averageSum.length; i++) {
            sum1 = sum1 + averageSum[i];
        }
        float average = sum1 / averageSum.length;
        System.out.println("Average sum of expenses during month is " + average);



    //        Homework 5.4

    char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
        System.out.print(reverseFullName[i]);
    }

        //        Homework 5.5.1

        int [][] array2D = new int [5][10];
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j]=1;
            }
        }
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }

        //        Homework 5.5.2

        int [][] matrix = new int [5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=1;
//                matrix[i][matrix.length - 1 - i] = 1;
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }


        System.out.println("задача 2.6");
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


    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
