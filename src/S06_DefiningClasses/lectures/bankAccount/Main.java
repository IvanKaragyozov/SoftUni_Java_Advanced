package S06_DefiningClasses.lectures.bankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] lineArguments = scanner.nextLine().split("\\s+");

        Map<Integer, BankAccount> accounts = new HashMap<>();

        String command = lineArguments[0];
        while (!command.equals("End")){

            String result = "";

            switch (command){

                case "Create":
                    BankAccount bankAccountID = new BankAccount();
                    accounts.put(bankAccountID.getID(), bankAccountID);
                    result = String.format("Account ID%d created", bankAccountID.getID());
                    break;
                case "Deposit":
                    int accountID = Integer.parseInt(lineArguments[1]);
                    double money = Double.parseDouble(lineArguments[2]);

                    if(accounts.containsKey(accountID)){
                        BankAccount bankAccountDeposit = accounts.get(accountID);
                        bankAccountDeposit.deposit(money);
                        accounts.put(accountID, bankAccountDeposit);
                        result = String.format("Deposited %.0f to ID%d", money, accountID);
                    } else result = "Account does not exist";
                    break;
                case "SetInterest":
                    double interestRate = Double.parseDouble(lineArguments[1]);
                    BankAccount.setInterestRate(interestRate);
                    break;
                case "GetInterest":
                    int accountId = Integer.parseInt(lineArguments[1]);
                    int years = Integer.parseInt(lineArguments[2]);

                    if(accounts.containsKey(accountId)){
                        BankAccount bankAccountInterest = accounts.get(accountId);
                        double totalInterest = bankAccountInterest.getInterest(years);
                        result = String.format("%.2f", totalInterest);
                    } else result = "Account does not exist";
                    break;
            }
            System.out.println(result);
            lineArguments = scanner.nextLine().split("\\s+");
            command = lineArguments[0];
        }
    }
}
