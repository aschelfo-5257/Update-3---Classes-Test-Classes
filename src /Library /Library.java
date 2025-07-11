public class Library {
  public static void main(String[] args) {
    // Main library
      Library myLibrary = new Library("City Public Library");
    // Create a librarian
        Librarian librarian1 = new Librarian("L001", "Mr. Jones");

    // Librarian adds books to the library
        librarian1.addBookToLibrary(myLibrary, book1);
        librarian1.addBookToLibrary(myLibrary, book2);
        myLibrary.addBook(book3); // Another way to add
    
    // Display all books in the library
        myLibrary.displayAllBooks();

    // Users borrow books
        user1.borrowBook(book1);
        user2.borrowBook(book2);
        user1.borrowBook(book2); // Trying to borrow an already borrowed book

    // Display borrowed books for users
        user1.displayBorrowedBooks();
        user2.displayBorrowedBooks();

    // Display all books in the library after borrowing
        myLibrary.displayAllBooks();

    // User returns a book
        user1.returnBook(book1);
        user1.returnBook(book3); // Trying to return a book not borrowed

    // Display all books in the library after returning
        myLibrary.displayAllBooks();
  }
}
