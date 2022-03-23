package bankaccountapp;

public abstract class Account implements IBaseRate {
    // List common properties for savings an checking accounts
    private String name;
    private String sSn;
    private double balance;
    private static int index = 10000;
    protected String accountNumber;
    protected double rate;

    //constractor to set base properties and initialize the account

    public Account(String name, String sSn, double initDeposit) {
        this.name = name;
        this.sSn = sSn;
        balance = initDeposit;

        // set account number
        index++;
        this.accountNumber = setAccountNumber();
        setBaseRate();


    }
    public abstract void setBaseRate();

    private String setAccountNumber () {
        String lastTwoOfSSN = sSn.substring(sSn.length()-2, sSn.length());
        int uniqueID= index;

        int rand = (int)(Math.random() * Math.pow(10,3));

        return lastTwoOfSSN + "" +uniqueID + rand;
    }
    public void compound () {
        double accruedInterest = balance * rate/100;
        System.out.println("Accrued interest: $" + accruedInterest);
        balance = balance + accruedInterest;
        printBalance();
    }
    //list common methods
    public void deposit (double amount) {
        balance = balance + amount;
        System.out.println("Amount of $" + amount + " was deposited on your account.");
        printBalance();
    }

    public void withdraw (double amount) {
        balance = balance - amount;
        System.out.println("Amount of $" + amount + " was withdrawn from your account." );
        printBalance();

    }

    public void transfer (double amount, String toWhere) {
        balance = balance - amount;
        System.out.println("Transferring amount of $" + amount + " to " + toWhere);
        printBalance();

    }
     public void printBalance () {
         System.out.println("Your balance is " + balance);
     }

    public void showInfo (){
        System.out.println("Name: " + name +
                "\nAccount number: " + accountNumber +
                "\nBalance: " + balance +
                "\nBase rate: " + rate + "%");
    }



}
