import java.util.Objects;

public class book {
   private String name;
   private Author author;
   private int year;

    public book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }
    public String getName() {
        return this.name;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getYear() {
        return this.year;
    }
    @Override
    public String toString() {
        return "Название книги: " + name + ", автор: " + author + ", год издания: " + year;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        book book = (book) o;
        return Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }
}