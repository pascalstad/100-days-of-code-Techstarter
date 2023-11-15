public class Main {

    public static void main(String[] args) {
        // challenge
//        BankAccount bankAccount = new BankAccount();

        // constructor intro
//        BankAccount bankAccount = new BankAccount(12345678, 123, "Pascal",
//                "pascal@home.gg", 987654);

        BankAccount bankAccount = new BankAccount();

        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getBalance());
        //

        // not needed for constructor above
//        bankAccount.setAccountNumber(12345678);
//        bankAccount.setBalance(123);
//        bankAccount.setCustomerName("Pascal");
//        bankAccount.setEmail("pascal@home.gg");
//        bankAccount.setPhoneNumber(987654);

        bankAccount.depositFund(1);
        bankAccount.withdrawFund(124);

        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", 12345);
        System.out.println("AccountNo: " + timsAccount.getAccountNumber() + "; name " + timsAccount.getCustomerName());
    }


}
