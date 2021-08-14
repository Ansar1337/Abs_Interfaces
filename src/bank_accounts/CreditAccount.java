package bank_accounts;

public class CreditAccount extends Account {

    public CreditAccount(String accountName, int amount) {
        super(accountName, amount);
    }

    @Override
    public boolean add(int amount) {
        if (this.amount + amount > 0) {
            System.out.println("Error! You cannot top up a credit card for this amount");
            return false;
        }
        this.amount += amount;
        System.out.println("To the account: " + accountName + " has been deposited - " + amount + " $");
        return true;
    }

    @Override
    public boolean pay(int amount) {
        this.amount -= amount;
        System.out.println("Payment from: " + accountName + " in amount of " + amount + " $");
        return true;
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (!account.add(amount)) {
            System.out.println("Transfer from: " + accountName + " to " + account + " failed");
            return false;
        }
        this.amount -= amount;
        System.out.println("Transfer succeeded from: " + accountName + " to " + account + " - " + amount + " y.e");
        return true;
    }
}