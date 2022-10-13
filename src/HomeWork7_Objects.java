public class HomeWork7_Objects {


    public static void main(String[] args) {

        //        Homework 7.1


//public class Author {
//
//   private final String nameOfAuthor;
//   private final String surnameOfAuthor;
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
//src/ru/skypro/Book.java
//Viewed
//@@ -0,0 +1,26 @@
//package ru.skypro;
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
//  18
//src/ru/skypro/Main.java
//Viewed
//@@ -3,8 +3,24 @@
//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here
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





//        public class Author {
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


//        public static void main(String[] args) {
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


    }
}
