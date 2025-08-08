import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void issueBook(int bookId, int userId, String issueDate) {
        for (Book book : books) {
            if (book.getBookId() == bookId && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println(" Book ID " + bookId + " issued to User ID " + userId + " on " + issueDate);
                return;
            }
        }
        System.out.println("Book not available or not found.");
    }

    public void returnBook(int bookId, int userId, String returnDate) {
        for (Book book : books) {
            if (book.getBookId() == bookId && !book.isAvailable()) {
                book.setAvailable(true);
                System.out.println("Book ID " + bookId + " returned by User ID " + userId + " on " + returnDate);
                return;
            }
        }
        System.out.println("Book was not issued or not found.");
    }

    //  MAIN method with menu and Scanner
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n === Library Management Menu ===");
            System.out.println("1. Add Book");
            System.out.println("2. Add User");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print(" Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Book Author: ");
                    String author = sc.nextLine();

                    library.addBook(new Book(bookId, title, author,true));
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter User Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();

                    library.addUser(new User(userId, name, phone));
                    System.out.println("User added successfully!");
                    break;

                case 3:
                    System.out.print("Enter Book ID to issue: ");
                    int issueBookId = sc.nextInt();
                    System.out.print("Enter User ID: ");
                    int issueUserId = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Issue Date (yyyy-mm-dd): ");
                    String issueDate = sc.nextLine();

                    library.issueBook(issueBookId, issueUserId, issueDate);
                    break;

                case 4:
                    System.out.print("Enter Book ID to return: ");
                    int returnBookId = sc.nextInt();
                    System.out.print("Enter User ID: ");
                    int returnUserId = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Return Date (yyyy-mm-dd): ");
                    String returnDate = sc.nextLine();

                    library.returnBook(returnBookId, returnUserId, returnDate);
                    break;

                case 5:
                    System.out.println("Exiting system. Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println(" Invalid choice. Try again.");
            }
        }
    }
}