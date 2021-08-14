package library;

public class SupplierReader extends User implements Supplier, Reader {

    public SupplierReader(String name) {
        super(name);
    }

    @Override
    public void takeBook(Administrator administrator) {
        System.out.println("Supplier " + name + " took a book to read from the administrator " + administrator);
    }

    @Override
    public void returnBook(Administrator administrator) {
        System.out.println("Supplier " + name + " returned the book to the administrator " + administrator);
    }

    @Override
    public void bringBook(Librarian librarian) {
        System.out.println("Supplier " + name + " brought books to the librarian " + librarian);
    }
}