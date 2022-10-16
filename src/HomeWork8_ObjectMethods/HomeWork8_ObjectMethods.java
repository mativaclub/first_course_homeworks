package HomeWork8_ObjectMethods;

public class HomeWork8_ObjectMethods {

    private static boolean addBook(Book[] books, Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return true;
            }
        }
        return false;
    }

    private static void printBook(Book book) {
        System.out.println(String.join("; ", book.getNameOfBook(),
                book.getNameOfAuthor().getNameOfAuthor(),
                book.getNameOfAuthor().getLastNameOfAuthor(),
                String.valueOf(book.getYearOfPublishing())));
    }


    public static void main(String[] args) {


        Book book1 = new Book(new Author("Грегори Дэвид ", "Робертс"),
                "Шантарам - Тень горы", 2017);
        Book book2 = new Book(new Author("Халед ", "Хоссейни"),
                "Тысяча сияющих солнц", 2007);
        Book book3 = new Book(new Author("Джим", "Лоулесс"),
                "Иди туда где страшно", 2017);
        Book book4 = new Book(new Author("Джон", "Перкинс"),
                "Исповедь экономического убийцы", 2018);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);

        book1.setYearOfPublishing(2018);
        System.out.println(book1);

        System.out.println(book1.equals(book3));
        System.out.println(book2.equals(book3));

        System.out.println(new Author("John", "Perkins").hashCode());
//        System.out.println(new Book("Исповедь экономического убийцы",
//                new Author("John", "Perkins"),
//                2018).hashCode());

//        Book[] books = new Book[4];
//        addBook(books, book1);
//        addBook(books, book2);
//        addBook(books, book3);
//        addBook(books, book4);
//
//        for (int i = 0; i < books.length; i++) {
//            if (books[i] != null) {
//                printBook(books[i]);
//            } else {
//                System.out.println("Not enough space");
//            }
//                }
//
//






    }
}
