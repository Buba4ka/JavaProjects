package bankaccountapp;

public class Cheking extends Account{
    //list properties specific to checking account
    private String debitCardNumber;
    private int debitCardPin;


    //constructor to initialize checking account properties


    public Cheking(String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();

    }
    private String setDebitCardNumber (){
        int debitCardNumberPart1 = (int)(Math.random() * Math.pow(10,4));
        int debitCardNumberPart2 = (int)(Math.random() * Math.pow(10,4));
        int debitCardNumberPart3 = (int)(Math.random() * Math.pow(10,4));

        return debitCardNumberPart1 + " " +debitCardNumberPart2 + " " + debitCardNumberPart3;
    }
    @Override
    public void setBaseRate () {
        rate = getBaseRate() * .15;
    }
    private void setDebitCard () {
        debitCardNumber = setDebitCardNumber();
        debitCardPin = (int)(Math.random() * Math.pow(10,4));

    }
    public void showInfo () {
        super.showInfo();
        System.out.println("Your checking account features: " +
                "\nDebit card number: " + debitCardNumber +
                "\nDebit card pin: " +  debitCardPin);
    }


    //list any methods specific to the checking account
}
