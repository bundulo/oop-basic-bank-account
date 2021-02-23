public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        System.out.println(bankAccount.getBalance());
        bankAccount.depositFunds(1000);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdrawFunds(500);
        System.out.println(bankAccount.getBalance());



    }
}
