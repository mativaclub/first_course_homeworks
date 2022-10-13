import java.util.Arrays;

public class HomeWork5_String {

    public static void main(String[] args) {

        //        Homework 5.1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("The name of an employee is - " + fullName);


        //        Homework 5.2

        String upperCase = fullName.toUpperCase();
        System.out.println(upperCase);


        //        Homework 5.3

        String nameFormat = fullName.replace(" ", "; ");
        System.out.println(nameFormat);


       //        Homework 5.4.1
        String fullNameNew = "Иванов Семён Семёнович";
        String[] splitting = fullNameNew.split("");
        System.out.println(Arrays.toString(splitting));
        String replacing = fullNameNew.replace('ё', 'е');
        System.out.println(replacing);


        //        Homework 5.4.2


        String fullNameNew1 = "Иванов Семён Семёнович";
        String[] letterChange = fullNameNew1.split(" ");
        System.out.print("Данные ФИО сотрудника — ");
        for (String letter : letterChange) {
            if (letter.contains("ё")) {
                letter = letter.replace('ё', 'е');
            }
            System.out.print(letter + " ");
        }



    }

}
