package library;

public class Main {
    public static void main(String[] args) {
        UserAdministrator userAdministrator = new UserAdministrator("John");
        SupplierReader supplierReader = new SupplierReader("Bruce");
        LibrarianAdministrator librarianAdministrator = new LibrarianAdministrator("Angela");

        userAdministrator.overdueNotification(supplierReader);
        supplierReader.takeBook(userAdministrator);
        supplierReader.returnBook(userAdministrator);
        librarianAdministrator.orderBook(supplierReader);
    }
}