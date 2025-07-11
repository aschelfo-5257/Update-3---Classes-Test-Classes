public class Library {
    public static void main(String[] args) {
        // Main library
        Library myLibrary = new Library("City Public Library");

        // Create librarian
        Librarian librarian1 = new Librarian("L001", "Mr. Jones");

        // Create books
        Book book1 = new Book("1984");
        Book book2 = new Book("To Kill a Mockingbird");
        Book book3 = new Book("The Great Gatsby");

        // Add books
        librarian1.addBookToLibrary(myLibrary, book1);
        librarian1.addBookToLibrary(myLibrary, book2);
        myLibrary.addBook(book3); // Another way to add

        // Display books
        myLibrary.displayAllBooks();

        // Create users
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // Users borrow books
        user1.borrowBook(book1);
        user2.borrowBook(book2);
        user1.borrowBook(book2); // Already borrowed

        // Display borrowed books
        user1.displayBorrowedBooks();
        user2.displayBorrowedBooks();

        // Display all books after borrow
        myLibrary.displayAllBooks();

        // Return books
        user1.returnBook(book1);
        user1.returnBook(book3); // Not borrowed

        // Display all books after return
        myLibrary.displayAllBooks();
    }
}
