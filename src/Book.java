import java.util.Objects;

public class Book {
    private final String nameOfBook;

    private int dateOfPublisher;

    private final Author author;

    public Book(String nameOfBook, int dateOfPublisher, Author author) {
        this.nameOfBook = nameOfBook;
        this.dateOfPublisher = dateOfPublisher;
        this.author = author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public int getDateOfPublisher() {
        return dateOfPublisher;
    }

    public Author getAuthor() {
        return author;
    }

    public void setDateOfPublisher(int dateOfPublisher) {
        this.dateOfPublisher = dateOfPublisher;
    }


    @Override
    public String toString() {
        return "Название: " + nameOfBook + ", " + "год издания: " +
                dateOfPublisher + ", " + "автор: " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return dateOfPublisher == book.dateOfPublisher && Objects.equals(nameOfBook, book.nameOfBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, dateOfPublisher, author);
    }
}
