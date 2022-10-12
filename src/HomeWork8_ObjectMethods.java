public class HomeWork8_ObjectMethods {

    public static void main(String[] args) {

        //        Homework 8.1



//import java.util.Objects;
//
//public class Author {
//
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
// 52
//src/ru/skypro/Book.java
//Viewed
//@@ -0,0 +1,52 @@
//package ru.skypro;
//
//import java.util.Objects;
//
//public class Book {
//
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
//    }
//
//  26
//src/ru/skypro/Main.java
//Viewed
//@@ -3,6 +3,30 @@
//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here
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










    }
}
