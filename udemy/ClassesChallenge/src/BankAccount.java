public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    // constructor intro
    public BankAccount() {
        //constructor chaining
        this(12345678, 123, "Pascal",
                "pascal@home.gg", 987654);
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String customerEmail, int customerPhone) {
        System.out.println("Account constructor with parameters called");
//        this.accountNumber = accountNumber;
        setAccountNumber(accountNumber);
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phoneNumber;
    }

    public BankAccount(String customerName, String email, int phoneNumber) {
        this(9999999, 100.55, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //

    public void depositFund(double depositAmount) {

        balance += depositAmount;
        System.out.println("You deposit " + depositAmount + "$");
        System.out.println("Your new balance is " + balance + "$");
    }

    public void withdrawFund(double withdrawAmount) {
        if (balance - withdrawAmount < 0) {
            System.out.println("You only can withdraw " + balance + "$");
        } else {
            balance -= withdrawAmount;
            System.out.println("You withdraw " + withdrawAmount + "$");
            System.out.println("Your new balance is " + balance + "$");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}