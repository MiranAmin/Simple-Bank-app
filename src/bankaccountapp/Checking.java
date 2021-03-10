package bankaccountapp;

public class Checking extends Account {

    private int debitCardNumber;
    private int pinNumber;

    public Checking(String name, String ssn, double initialDeposit) {
        super(name, ssn, initialDeposit);
        setAccNumber("2" + getAccNumber());
        setDebitCard();

    }

    @Override
    public void setRate() {

    }

    private void setDebitCard(){
        this.debitCardNumber = (int) (Math.random() * Math.pow(10,12));
        this.pinNumber = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Your Checking Account Features" +
                "\nDebit Card Number: " + this.debitCardNumber +
                "\nDebit Card Pin Number: " + this.pinNumber);
    }



    //specific methods
}
