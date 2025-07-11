// Book Class
class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false; // Initially not borrowed

    // Getters
    public String getTitle() {
      return title;
    }

    public String getAuthor() {
      return author;
    }

    public String getIsbn() {
      return isbn;
    }

    public String isBorrowed() {
      return isBorrowed;
    }

    // Setters (if needed, e.g., to mark a book as borrowed)
    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
  
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Status: " + (isBorrowed ? "Borrowed" : "Available"));
    }
}
