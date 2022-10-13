public class HomeWork3_Cycles {


    public static void main(String[] args) {

        //        Homework 3.1

        int i1 = 0;
        while (i1 <= 10) {
            System.out.print(i1++ + " ");
        }

        System.out.println();

        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }

        //        Homework 3.2

        for (int friday = 1; friday <= 31; friday += 7) {
            System.out.println("Today is " + friday + " Friday, please prepare the statement");
        }

//        Homework 3.3

        int currentYear = 2022;
        int last200Years = currentYear - 200;
        int next100Years = currentYear + 100;
        for (int year = last200Years; year <= next100Years ; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }

        }

            //        Homework 3.4

            int month = 30;
            for (int day = 1; day <= month; day++) {
                if (day % 3 == 0 && day % 5 == 0) {
                    System.out.println(day + " ping-pong");
                } else if (day % 3 == 0) {
                    System.out.println(day + " ping");
                } else if (day % 5 == 0) {
                    System.out.println(day + " pong");
                } else  {
                    System.out.println(day);
                }
        }

            //        Homework 3.5

        int previous = 0;
        int next = 1;
        System.out.print(previous +  " " + next);
        for (int fibo = 2; fibo <=9; fibo++) {
            int nextNumber = previous + next;
            previous = next;
            next = nextNumber;
            System.out.print(" " + nextNumber);
        }

//        int evenNumber = 0;
////        int oddNumber = 1;
////        for (int nextNumber = 0; nextNumber < 5; nextNumber++) {
////            System.out.print(evenNumber + " " + oddNumber + " ");
////            evenNumber = evenNumber + oddNumber;
////            oddNumber = oddNumber + evenNumber;
////        }





    }
}
