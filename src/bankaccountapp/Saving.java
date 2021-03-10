package bankaccountapp;

public class Saving extends Account {
    private int safetyDepositBoxId;
    private int safetyDepositBoxKey;


    public Saving(String name, String ssn, double initialDeposit) {
        super(name, ssn,initialDeposit);
        setAccNumber("1" + getAccNumber());
        setSafetyDepositBox();

    }

    public void setRate() {
        setRate(getBaseRate() - .25);
    }


    private void setSafetyDepositBox(){
        this.safetyDepositBoxId = (int) (Math.random() * Math.pow(10,3));
        this.safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Your Savings Account Features " +
                "\nSafety Deposit Box ID: " + this.safetyDepositBoxId +
                "\nSafety Deposit Box Key: " + this.safetyDepositBoxKey
        );
    }
}
