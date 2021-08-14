package bank_accounts;

public class CheckingAccount extends Account {

    public CheckingAccount(String accountName, int amount) {
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
        if (this.amount < amount) {
            System.out.println("Insufficient funds to pay");
            return false;
        }
        this.amount -= amount;
        System.out.println("Payment from: " + accountName + " in amount of " + amount + " $");
        return true;
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (this.amount < amount) {
            System.out.println("Insufficient funds to transfer");
            return false;
        }

        if (!account.add(amount)) {
            System.out.println("Transfer from: " + accountName + " to " + account + " failed");
            return false;
        }

        this.amount -= amount;
        System.out.println("Transfer succeeded from: " + accountName + " to " + account + " - " + amount + " y.e");
        return true;
    }
}