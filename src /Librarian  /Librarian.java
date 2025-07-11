class Librarian {
    private String id;
    private String name;

    public Librarian(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addBookToLibrary(Library library, Book book) {
        library.addBook(book);
        System.out.println(name + " added " + book.getTitle() + " to the library.");
    }
}
