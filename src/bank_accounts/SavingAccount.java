package bank_accounts;

public class SavingAccount extends Account {

    public SavingAccount(String accountName, int amount) {
        super(accountName, amount);
    }

    @Override
    public boolean add(int amount) {
        this.amount += amount;
        System.out.println("To the account: " + accountName + " has been deposited - " + amount + " $");
        return true;
    }

    @Override
    public boolean pay(int amount) {
        System.out.println("Error! You cannot pay from a savings account");
        return false;
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (this.amount < amount) {
            System.out.println("Insufficient funds to complete the transfer");
            return false;
        }

        if (!account.add(amount)) {
            System.out.println("Transfer from: " + accountName + " to " + account + " failed");
            return false;
        }

        this.amount -= amount;
        System.out.println("Transfer succeeded from: " + accountName + " to " + account + " - " + amount + " $");
        return true;
    }
}