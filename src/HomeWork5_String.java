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

        //        Homework 5.4.3

        String fullNew = "Иванов Семён Семёнович";
        String[] letter = fullNew.split(" ");
        System.out.print("Данные ФИО сотрудника — ");
        for (int i = 0; i < letter.length; i++) {
            if (letter[i].contains("ё")) {
                letter[i] = letter[i].replace('ё', 'е');
            }
        }
        String result = String.join(" ", letter);
        System.out.println(result);


        //        Homework 5.5

        String fullName2 = "Ivanov Ivan Ivanovich";
        int index = fullName2.indexOf(" ");
        int lastIndex = fullName2.lastIndexOf(" ");
        String lastName2 = fullName2.substring(0, fullName2.indexOf(" "));
        String firstName2 = fullName2.substring(fullName2.indexOf(" ") + 1, fullName2.lastIndexOf(" "));
        String middleName2 = fullName2.substring(fullName2.lastIndexOf(" ") + 1);
        System.out.println("Last name " + lastName2);
        System.out.println("First name " + firstName2);
        System.out.println("Middle name " + middleName2);


        //        Homework 5.6

        String fullName3 = "Ivanov Ivan Ivanovich";
        String[] words = fullName3.split(" ");
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            if (Character.isLowerCase(chars[0])) {
                chars[0] = Character.toUpperCase(chars[0]);
                words[i] = new String(chars);
            }
        }
        System.out.println(String.join(" ", words));


        //        Homework 5.7

        String fullName11 = "ivanov ivan ivanovich";
        String fullName111 = "";
        char[] s = fullName.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (i == 0 || s[i - 1] == ' ') {
                s[i] = Character.toUpperCase(s[i]);
            }
        }
        for (int i = 0; i < s.length; i++) {
            fullName11 = fullName11 + s[i];
        }
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв  " + fullName11);


        //        Homework 5.8

        String s1 = "135";
        String s2 = "246";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(i));
        }
//        String result1 = sb.toString();
        System.out.println(sb);



        //        Homework 5.9

        StringBuilder sb1 = new StringBuilder();
        String message = "aabccddefgghiijjkk";
        char duplicate = ' ';
        char[] letters = message.toCharArray();
        for (int i = 0; i < letters.length-1; i++) {
            if (letters[i] == letters[i + 1] && duplicate != letters[i]) {
                sb.append(letters[i]);
                duplicate = letters[i + 1];
            }
            System.out.println(sb1.toString());
        }


    }

}
