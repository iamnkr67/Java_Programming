package ChallengingQuestions;

import java.util.Scanner;

public class ATM {
    static Scanner sc = new Scanner(System.in);

    public static void choiceMade() {
        int choice;
        int deposit, withdraw = 0, balance = 80000;
        int[] transactions = new int[10];
        int transactionCount = 0;

        while (true) {
            System.out.println("1) View Account Balance");
            System.out.println("2) Withdraw Amount");
            System.out.println("3) Deposit Amount");
            System.out.println("4) Mini Statement");
            System.out.println("5) Exit\n");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.println("Your Account Balance: " + balance);
                    break;
                case 2:
                    System.out.print("Enter Withdraw Amount: ");
                    withdraw = sc.nextInt();

                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Please Collect Your Cash");
                        transactions[transactionCount] = -withdraw;
                        transactionCount++;
                    } else {
                        System.out.println("Insufficient Amount!");
                    }
                    break;
                case 3:
                    System.out.print("Enter Deposit Amount: ");
                    deposit = sc.nextInt();
                    balance += deposit;
                    transactions[transactionCount] = deposit;
                    transactionCount++;
                    break;
                case 4:
                    System.out.println("Mini Statement:");
                    for (int i = 0; i < transactionCount; i++) {
                        if (transactions[i] > 0) {
                            System.out.println("Deposited: " + transactions[i]);
                        } else {
                            System.out.println("Withdrawn: " + (-transactions[i]));
                        }
                    }
                    break;
                case 5:
                    System.out.println("          Thanks for visiting.");
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int correctPin = 8092;
        boolean pinEnteredCorrectly = false;
        System.out.println("********WELCOME TO********\n ********NKR ATM********");
        while (!pinEnteredCorrectly) {
            System.out.print("Enter PIN: ");
            int pinEnter = sc.nextInt();
            if (pinEnter == correctPin) {
                pinEnteredCorrectly = true;
                System.out.println("Account Authorized!\n");
                choiceMade();
            } else {
                System.out.println("Wrong PIN. Please enter correct PIN.");
            }
        }
        sc.close();
    }
}
