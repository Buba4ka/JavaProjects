package bankaccountapp;

public class Savings extends Account{
    //list properties specific to the savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;


    //constructor to initialize settings for savings properties
    public Savings (String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setBaseRate() {
        rate = getBaseRate() - .25;
    }

    public void setSafetyDepositBox() {
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
    }

    //list any methods specific to savings account
    public void showInfo () {
       super.showInfo();
        System.out.println("Your savings account features:" +
                "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                "\n Safety Deposit Box Key: " + safetyDepositBoxKey);
    }

}
