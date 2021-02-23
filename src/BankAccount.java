public class BankAccount {

    private int number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber; //?


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount){
        if (amount <= 0){
            System.out.println("You can't deposit lesser amount than 1 HUF");
        }
        if (amount > 0){
            this.balance += amount;
            System.out.println("You successfully added " + amount + " HUF to your balance \n Your current Balance is " + balance + " HUF");

        }
    }

    public void withdrawFunds(double amount){
        if (amount <= 0){
            System.out.println("You can't withdraw lesser amount than 1 HUF");
        }
        if (amount > 0){
            this.balance -= amount;
            System.out.println("You successfully withdraw " + amount + " HUF to your balance \n Your current Balance is " + balance + " HUF");

        }
    }


}
