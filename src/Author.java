import java.util.Objects;

public class Author {

    private final String nameOfAuthor;

    private final String lastNameOfAuthor;

    public Author(String nameOfAuthor, String lastNameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
        this.lastNameOfAuthor = lastNameOfAuthor;
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }

    public String getLastNameOfAuthor() {
        return lastNameOfAuthor;
    }

    @Override
    public String toString() {
        return nameOfAuthor + ' ' + lastNameOfAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameOfAuthor, author.nameOfAuthor) && Objects.equals(lastNameOfAuthor, author.lastNameOfAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfAuthor, lastNameOfAuthor);
    }
}
