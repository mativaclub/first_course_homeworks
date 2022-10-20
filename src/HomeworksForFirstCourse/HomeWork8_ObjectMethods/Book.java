package HomeworksForFirstCourse.HomeWork8_ObjectMethods;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublishing == book.yearOfPublishing && Objects.equals(nameOfAuthor, book.nameOfAuthor) && Objects.equals(nameOfBook, book.nameOfBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfAuthor, nameOfBook, yearOfPublishing);
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfAuthor=" + nameOfAuthor +
                ", nameOfBook='" + nameOfBook + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                '}';
    }
}

