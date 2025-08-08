public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean available;

    // Constructor
    public Book(int bookId, String title, String author, boolean avaliable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available= available;
    }

    // Getters and Setters
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

   

    // Display Book Info
    public void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("available : " + (available ? "Yes" : "No"));
    
    }
}
