package U5T3_JavaDocs;

/**
 * This class represents a bank account.
 * 
 * @author Jeffrey Ding
 */

public class BankAccount{
    /** The accountType of this bank account. */
    private String accountType = "";
    /** The balance of this bank account. */
    private double balance = 0.0;
    /** Test publicField */
    public int publicField;

    /** 
     * Instantiates a bankAccount object.
     * 
     * @param accountType the account type
     * @param balance the balance
     */
    public BankAccount(String accountType, double balance) {
      this.accountType = accountType;
      this.balance = balance;
    }
 
    /** 
     * Returns the current balance of this bank account.
     * 
     * @return the balance of this bank account.
     */
    public double getBalance() {
      return balance;
    }
 
    /** 
     * Adds an amount to the balance and then rounds the balance.
     * 
     * @param amount the amount to be added to the balance
     */
    public void deposit(double amount) {
      balance += amount;
      balance = Math.round(balance * 100.0) / 100.0;
    }

    /** 
     * Subtracts an amount to the balance if the amount isn't greater than the balance.
     * 
     * @param amount the amount to be subtracted to the balance
     */
    public void withdraw(double amount) {
      if (!(amount > balance)) {
        balance -= amount;
        balance = Math.round(balance * 100.0) / 100.0;
      }
    }

    /** 
     * Calls the getBalance() method to return a balance
     * 
     * @return the returned double from the getBalance() method
     */
    public double checkBalance() {
      return getBalance();
    }
 
}
