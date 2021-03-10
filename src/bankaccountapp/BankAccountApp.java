package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();

        //reading a CSV file and creating an account based on the read data
        String file = "c:\\Users\\miran\\Downloads\\NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double deposit = Double.parseDouble(accountHolder[3]);
            System.out.println(name + " " + sSN+ " " + accountType+ " " + deposit);
            if (accountType.equals("Savings")) {
                accounts.add(new Saving(name,sSN,deposit));
            } else if (accountType.equals("Checking")) {
                accounts.add(new Saving(name,sSN,deposit));
            } else {
                System.out.println("Error reading account type!");
            }
        }


        for (Account account : accounts) {
            System.out.println("\n********************");
            account.showInfo();
        }

    }
}
