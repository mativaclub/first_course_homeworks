package HomeWork7_Classes_Objects;

public class HomeWork7_Classes {

    private static boolean addBook(Book[] books, Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return true;
            }
        } return false;
    }

    private static void printBook(Book book) {
        System.out.println(String.join("; ", book.getNameOfBook(),
                book.getNameOfAuthor().getNameOfAuthor(),
                book.getNameOfAuthor().getLastNameOfAuthor(),
                String.valueOf(book.getYearOfPublishing())));
    }


    public static void main(String[] args) {


//Light Version
//        Book book1 = new Book(new Author("Грегори Дэвид ", "Робертс"),
//                "Шантарам - Тень горы", 2017);
//        Book book2 = new Book(new Author("Халед ", "Хоссейни"),
//                "Тысяча сияющих солнц", 2007);
//        Book book3 = new Book(new Author("Джим", "Лоулесс"),
//                "Иди туда где страшно", 2017);
//        Book book4 = new Book(new Author("Джон", "Перкинс"),
//                "Исповедь экономического убийцы", 2018);
//        System.out.println(book1.getNameOfBook() + "; " + book1.getNameOfAuthor().getNameOfAuthor()
//                + "; " + book1.getNameOfAuthor().getLastNameOfAuthor() + "; " + book1.getYearOfPublishing());
//        System.out.println(book2.getNameOfBook() + "; " + book2.getNameOfAuthor().getNameOfAuthor()
//                + "; " + book2.getNameOfAuthor().getLastNameOfAuthor() + "; " + book2.getYearOfPublishing());
//        book1.setYearOfPublishing(2018);
//        System.out.println(book1.getYearOfPublishing());


        Book book1 = new Book(new Author("Грегори Дэвид ", "Робертс"),
                "Шантарам - Тень горы", 2017);
        Book book2 = new Book(new Author("Халед ", "Хоссейни"),
                "Тысяча сияющих солнц", 2007);
        Book book3 = new Book(new Author("Джим", "Лоулесс"),
                "Иди туда где страшно", 2017);
        Book book4 = new Book(new Author("Джон", "Перкинс"),
                "Исповедь экономического убийцы", 2018);


        Book[] books = new Book[4];
        addBook(books, book1);
        addBook(books, book2);
        addBook(books, book3);
        addBook(books, book4);

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                printBook(books[i]);
            } else {
                System.out.println("Not enough space");
            }
        }







//    public LibraryHard(int size){
//        books = new BookHard[size];
//    }
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

//public class Main {

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




    }
}
