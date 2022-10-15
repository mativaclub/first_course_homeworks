package HomeWork7_Classes_Objects;

public class Book {

    private final Author nameOfAuthor;
    private final String nameOfBook;
    private int yearOfPublishing;

    public Book(Author nameOfAuthor, String nameOfBook, int yearOfPublishing) {
        this.nameOfAuthor = nameOfAuthor;
        this.nameOfBook = nameOfBook;
        this.yearOfPublishing = yearOfPublishing;
    }

    public Author getNameOfAuthor() {
        return nameOfAuthor;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
}

