package HomeworksForFirstCourse.HomeWork7_Classes_Objects;

public class Book {

    private final Author author;
    private final String title;
    private int publisherYear;

    public Book(Author author, String title, int publisherYear) {
        this.author = author;
        this.title = title;
        this.publisherYear = publisherYear;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublisherYear() {
        return publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }
}

