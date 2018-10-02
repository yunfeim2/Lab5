import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         *
         */
        CHECKINGS,
        /**
         *
         */
        SAVINGS,
        /**
         *
         */
        STUDENT,
        /**
         *
         */
        WORKPLACE
    }

    /**
     *
     */
    private int accountNumber;
    /**
     *
     */
    private BankAccountType accountType;
    /**
     *
     */
    private double accountBalance;
    /**
     *
     */
    private String ownerName;
    /**
     *
     */
    private double interestRate;
    /**
     *
     */
    private double interestEarned;

    /**
     *
     * @param name good
     * @param accountCategory very
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        Bank.getNumberOfAccount();
        ownerName = name;
        accountType = accountCategory;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     *
     * @return d
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     *
     * @param number hha
     */
    public void setAccountNumber(final int number) {
        accountNumber = number;
    }

    /**
     *
     * @return
     */
    public BankAccountType getBankAccountType() {
        return accountType;
    }

    /**
     *
     * @param aType good one
     */
    public void setBankAccountType(final BankAccountType aType) {
        accountType = aType;
    }

    /**
     *
     * @return
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     *
     * @param accountBalance good
     */
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     *
     * @return
     */
    public String getOwnerName() {
        return  ownerName;
    }

    /**
     *
     * @param ownerName1 good
     */
    public void setOwnerName(final String ownerName1) {
        ownerName = ownerName1;
    }

    /**
     *
     * @return
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     *
     * @param interestRate1 good
     */
    public void setInterestRate(final double interestRate1) {
        interestRate = interestRate1;
    }

    /**
     *
     * @return
     */
    public double getInterestEarned() {
        return interestEarned;
    }

}
