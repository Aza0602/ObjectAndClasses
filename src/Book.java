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
}
