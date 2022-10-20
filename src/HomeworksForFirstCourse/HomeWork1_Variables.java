package HomeworksForFirstCourse;

public class HomeWork1_Variables {

    public static void main(String[] args) {

//        Homework 1.1

        byte b = 127;
        short s = 29999;
        int i = 299999;
        long l = 299_999_999L;
        float f = 3.143_586_346f;

        double d = 2999.9;
        char c = 33;
        boolean bo = 10 > 5;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.printf("%.2f", f); // if you want to print only 2 or other qty of numbers
        System.out.println();
        System.out.println(d);
        System.out.println(c);
        System.out.println(bo);

        int number = 10;
        System.out.println(number);
        number += 5; // number = number + 5
        System.out.println(number);
        number -= 3; // number = number -3
        System.out.println(number);
        number /= 4; // number = number / 4
        System.out.println(number);
        number *= 5; // number = number * 5
        System.out.println(number);

        int num = 10;
        num %= 4;
//        int remainderOfDivision = num % 4;
//        System.out.println(remainderOfDivision);
        System.out.println(num);

        System.out.println();

//        Homework 1.2
        System.out.println();

        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        System.out.println("Total weight of Boxers is " + (boxer1 + boxer2));
        System.out.println("Difference of the weight of Boxers is " + Math.abs(boxer1 - boxer2));


//        Homework 1.3
        System.out.println();

        int kgToGr = 1000;
        int bananaWeightGr = 80;
        int bananas = 5;
        int bananaTotalWeight = bananaWeightGr * bananas;

        int milkWeight100MlToGr = 105;
        int milkAmount = 2;
        int milkTotalWeight = milkWeight100MlToGr * milkAmount;

        int iceCreamWeight = 100;
        int iceCreamQty = 2;
        int iceCreamTotalWeight = iceCreamWeight * iceCreamQty;

        int eggsWeight = 70;
        int eggsPcs = 4;
        int eggsTotalWeight = eggsWeight * eggsPcs;

        int totalBreakfastWeight = bananaTotalWeight + milkTotalWeight + iceCreamTotalWeight + eggsTotalWeight;
//        float grToKg = totalBreakfastWeight / (kgToGr * 1.0f);
        float grToKg = (float) totalBreakfastWeight / kgToGr;

        System.out.println(totalBreakfastWeight);
        System.out.println(grToKg);

//        Homework 1.4
        System.out.println();

        int needToLooseKg = 7;
        int gramInKg = 1000;
        int grToKG = needToLooseKg * gramInKg;
        int looseKgPerDay250gr = 250;
        int looseKgPerDay500gr = 500;
        int daysNeededFor250Gr = grToKG / looseKgPerDay250gr;
        int daysNeededFor500Gr = grToKG / looseKgPerDay500gr;
        int averageDays = (daysNeededFor250Gr + daysNeededFor500Gr) / 2;

        System.out.println(daysNeededFor250Gr);
        System.out.println(daysNeededFor500Gr);
        System.out.println(averageDays);

        //        Homework 1.5
        System.out.println();


        int percent = 10;
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int monthsPerYear = 12;
        float salaryMultiplier = percent / 100f;
//        float salaryMultiplier = 1 + (percent / 100f);

        int mashaSalaryBeforePerYear = mashaSalary * monthsPerYear;
        int denisSalaryBeforePerYear = denisSalary * monthsPerYear;
        int kristinaSalaryBeforePerYear = kristinaSalary * monthsPerYear;

        System.out.println("Yearly salary of Masha before was " + mashaSalaryBeforePerYear);
        System.out.println("Yearly salary of Denis before was " + denisSalaryBeforePerYear);
        System.out.println("Yearly salary of Kristina before was " + kristinaSalaryBeforePerYear);

        System.out.println();

        float increaseOfSalaryMashaPerMonth = (mashaSalary + (mashaSalary * salaryMultiplier));
//        float increaseOfSalaryMashaPerMonth = mashaSalary * salaryMultiplier;
//        float increaseOfSalaryMashaPerMonth = mashaSalary * (1 + (percent / 100f));

        int increaseOfSalaryDenisPerMonth = (denisSalary + (denisSalary * percent) / 100);
        int increaseOfSalaryKristinaPerMonth = (kristinaSalary + (kristinaSalary * percent) / 100);

        System.out.println("Increase Of Masha's Salary Per Month is " + increaseOfSalaryMashaPerMonth);
        System.out.println("Increase Of Denis's Salary Per Month is " + increaseOfSalaryDenisPerMonth);
        System.out.println("Increase Of Kristina's Salary Per Month is " + increaseOfSalaryKristinaPerMonth);

        System.out.println();


        float increaseOfSalaryMashaPerYear = increaseOfSalaryMashaPerMonth * monthsPerYear;
        int increaseOfSalaryDenisPerYear = increaseOfSalaryDenisPerMonth * monthsPerYear;
        int increaseOfSalaryKristinaPerYear = increaseOfSalaryKristinaPerMonth * monthsPerYear;

        System.out.println("Increase Of Masha's Salary Per Year is " + increaseOfSalaryMashaPerYear);
        System.out.println("Increase Of Denis's Salary Per Year is " + increaseOfSalaryDenisPerYear);
        System.out.println("Increase Of Kristina's Salary Per Year is " + increaseOfSalaryKristinaPerYear);

        System.out.println();

        float differenceOfSalaryMashaBeforeAndNowPerYear = increaseOfSalaryMashaPerYear - mashaSalaryBeforePerYear;
        int differenceOfSalaryDenisBeforeAndNowPerYear = increaseOfSalaryDenisPerYear - denisSalaryBeforePerYear;
        int differenceOfSalaryKristinaBeforeAndNowPerYear = increaseOfSalaryKristinaPerYear - kristinaSalaryBeforePerYear;

        System.out.println("Difference of Masha's Salary per year is " + differenceOfSalaryMashaBeforeAndNowPerYear);
        System.out.println("Difference of Denis's Salary per year is " + differenceOfSalaryDenisBeforeAndNowPerYear);
        System.out.println("Difference of Kristina's Salary per year is " + differenceOfSalaryKristinaBeforeAndNowPerYear);

        //        Homework 1.6

        int a1 = 12;
        int b1 = 27;
        int c1 = 44;
        int d1 = 15;
        int e1 = 9;
        int result = a1 * (b1 + (c1 - d1 * e1));
        System.out.println(Math.abs(result));

//        Homework 1.7

        int k = 5;
        int p = 7;
        k = k + p; // k = 5 + 7, k = 12
        p = k - p; //p = 12 - 7. p = 5;
        k = k - p; // k = 12 - 5, k = 7
        System.out.println("k = " + k);
        System.out.println("p = " + p);

//        Homework 1.8
        int m = 256;
        int middle = (m % 100)/10;
        System.out.println(middle);





    }
}
