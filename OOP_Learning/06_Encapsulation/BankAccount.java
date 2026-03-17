// ENCAPSULATION: hide internal data with private fields,
// and expose controlled access through public getter/setter methods.
// This prevents outside code from directly modifying sensitive state.

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    // Getters — read-only access to private fields
    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    // Methods that enforce rules before changing state
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 1000.0);

        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(5000.0); // should fail

        System.out.println(account.getOwner() + "'s balance: $" + account.getBalance());
    }
}
