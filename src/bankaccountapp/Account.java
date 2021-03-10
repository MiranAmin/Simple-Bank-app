package bankaccountapp;

public abstract class Account implements IBaseRate {

    private final String sSN;
    private final String name;
    private double balance;

    private static int counter = 10000;
    private String accNumber;
    private double rate;



    public Account(String name, String sSN, double initialDeposit) {
        this.name = name;
        this.sSN = sSN;
        this.balance = initialDeposit;
        this.accNumber = setAccountNumber();
        counter++;
        setRate();
    }

    public void setRate() {
        setRate(getBaseRate() * .15);
    }

    private String setAccountNumber() {
        String lastTwoOfSsn = this.sSN.substring(sSN.length() - 2);
        int uniqueId = this.counter;
        int randomNum = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSsn + uniqueId + randomNum;
    }

    public void compound(){
        double accruedInterest = this.balance * (this.rate/100);
        this.balance += accruedInterest;
        System.out.println("Accrued interest " + accruedInterest);
    }


    public void showInfo() {
        System.out.println("NAME: " + this.name +
                "\nACCOUNT NUMBER: " + this.accNumber +
                "\nBALANCE: " + this.balance + "\nRate: " + this.rate + "%");
    }


    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        System.out.println("Withdrawing " + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        this.balance -= amount;
        System.out.println("Transferring " + amount + "to " + toWhere);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your balance is " + this.balance);
    }


    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public String getsSN() {
        return sSN;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }


}
