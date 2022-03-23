package bankaccountapp;


import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) throws FileNotFoundException {

        List<Account> accounts = new LinkedList<>();


        // read a CSV file then create new accounts based on that data

        String file = "/Users/oksana/Desktop/Java programming/utilitiesFiles/NewBankAccounts.csv";

        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder: newAccountHolders) {
            String name = accountHolder[0];
            String sSn = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            if (accountType.equals("Savings")) {
                accounts.add(new Savings(name, sSn, initDeposit));
            }else if (accountType.equals("Checking")) {
                accounts.add(new Cheking(name, sSn, initDeposit));
            }else{
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }
        for (Account acc: accounts) {
            System.out.println("\n*************");
            acc.showInfo();
        }
//        Cheking chkacc1 = new Cheking("Tom Wilson", "123456789", 1500);
//        Savings savacc1 = new Savings ("Rich Lowe", "345981234", 2500);
//
//        chkacc1.compound();
//        chkacc1.showInfo();
//
//
//        System.out.println("***********************");
//        savacc1.compound();
//        savacc1.showInfo();

    }



}
