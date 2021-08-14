package library;

public class LibrarianAdministrator extends User implements Librarian, Administrator {
    public LibrarianAdministrator(String name) {
        super(name);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Administrator " + name + " found that the book is overdue to return by " + reader);
    }

    @Override
    public void orderBook(Supplier supplier) {
        System.out.println("Librarian " + name + " ordered books from a supplier " + supplier);
    }

    @Override
    public void receiveBook(Supplier supplier) {
        System.out.println("Librarian " + name + " received books from a supplier " + supplier);
    }
}
