package bank_accounts;

public abstract class Account {
    protected String accountName;
    protected int amount;

    public Account(String accountName, int amount) {
        this.accountName = accountName;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public abstract boolean add(int amount);

    public abstract boolean pay(int amount);

    public abstract boolean transfer(Account account, int amount);

    public String toString() {
        return accountName;
    }
}