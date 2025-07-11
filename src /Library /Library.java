import java.util.*;

class Library {
    private String name;
    private List<Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAllBooks() {
        System.out.println("Books in " + name + ":");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
