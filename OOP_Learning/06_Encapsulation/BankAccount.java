/**
 * BankAccount — Demonstrates encapsulation with private fields and controlled access.
 * 
 * CONCEPTS:
 * • Encapsulation: hide internal state (private fields)
 * • Getters: read-only access to private fields
 * • Methods with validation: enforce business rules before state changes
 * • Prevents direct modification of sensitive data (balance)
 * • Enables consistent state management (no negative balance withdrawals)
 * 
 * LEARNING: Encapsulation protects data integrity through controlled access.
 */

public class BankAccount {
    
    // ========== SECTION 1: PRIVATE FIELDS (DATA HIDING) ==========
    // These fields are hidden from outside code
    // Direct access is prevented; only methods can modify them
    private String owner;
    private double balance;

    // ========== SECTION 2: CONSTRUCTOR ==========
    /**
     * Initialize a bank account with owner name and initial balance.
     * @param owner The name of the account owner
     * @param initialBalance The starting balance
     */
    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    // ========== SECTION 3: GETTERS (READ-ONLY ACCESS) ==========
    /**
     * Get owner name.
     * @return account owner's name
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Get current balance.
     * @return current account balance
     */
    public double getBalance() {
        return balance;
    }

    // ========== SECTION 4: METHOD WITH VALIDATION: DEPOSIT ==========
    /**
     * Deposit money into the account.
     * Validation: amount must be positive.
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        // Validate: only allow positive deposits
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    // ========== SECTION 5: METHOD WITH VALIDATION: WITHDRAW ==========
    /**
     * Withdraw money from the account.
     * Validation: amount must be positive and not exceed balance.
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        // Validate: amount must be positive AND not exceed available balance
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Error: Insufficient funds. Balance: $" + balance);
        } else {
            System.out.println("Error: Withdrawal amount must be positive.");
        }
    }

    // ========== SECTION 6: DEMONSTRATION ==========
    public static void main(String[] args) {
        
        // ========== SECTION 7: CREATE ACCOUNT ==========
        BankAccount account = new BankAccount("Alice", 1000.0);
        System.out.println("Account created for " + account.getOwner());
        System.out.println("Initial balance: $" + account.getBalance());
        
        // ========== SECTION 8: VALID TRANSACTIONS ==========
        System.out.println("\n--- Valid Transactions ---");
        account.deposit(500.0);      // Adds $500
        System.out.println("Balance: $" + account.getBalance());
        
        account.withdraw(200.0);     // Removes $200
        System.out.println("Balance: $" + account.getBalance());
        
        // ========== SECTION 9: INVALID TRANSACTION ==========
        System.out.println("\n--- Invalid Transaction ---");
        account.withdraw(5000.0);    // Tries to withdraw more than balance
        System.out.println("Balance: $" + account.getBalance());
        
        // ========== SECTION 10: FINAL STATE ==========
        System.out.println("\n" + account.getOwner() + "'s final balance: $" + account.getBalance());
        
        // ========== SECTION 11: KEY INSIGHTS ==========
        // 1. 'owner' and 'balance' are private — outside code cannot access directly
        // 2. getOwner() and getBalance() provide safe read access
        // 3. deposit() and withdraw() validate input before modifying balance
        // 4. Invalid operations (negative deposits, overdraft) are prevented
        // This is encapsulation: protecting internal state through controlled interfaces.
    }
}
