package library;

public class UserAdministrator extends User implements Administrator {

    public UserAdministrator(String name) {
        super(name);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Administrator " + name + " found that the book is overdue to return by " + reader);
    }
}