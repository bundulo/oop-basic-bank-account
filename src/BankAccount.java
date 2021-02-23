public class BankAccount {

    private int bankAccountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber; //?


    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int amount){
        if (amount > 0){
            this.balance += amount;
        }
    }

    public void withdrawFunds(int amount){
        if (amount > 0){
            this.balance -= amount;
        }
    }


}
