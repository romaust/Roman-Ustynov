import java.util.Scanner;
import java.util.Random;
class BankAccount {
    //for making random balance on accounts
    static Random rand = new Random();

    //accounts balance
    private static int balance = rand.nextInt(10000);
    static int transfer_balance = rand.nextInt(10000);

    //take money in account
    public static void deposit() {
        System.out.print("Input deposit amount: ");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        if (amount <= 5000) {
            balance += amount;
            System.out.println("Operation completed. Balance now: "+ balance);

        } else {
            System.out.println("Operation uncompleted. Max deposit limit is 5000");
        }
    }
    //take money from account
    public static void withdraw() {
        System.out.print("Input withdraw amount: ");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Operation completed. Balance now: "+ balance);

        } else {
            System.out.println("Operation uncompleted. Not enough value on balance");
        }
    }
    public static void transfer_from() {
        System.out.print("Input transfer amount: ");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        if (amount <= transfer_balance) {
            transfer_balance -= amount;
            balance += amount;
            System.out.println("Operation completed. Balance now: "+ balance);
            System.out.println("Transfer balance now: "+ transfer_balance);

        } else {
            System.out.println("Operation uncompleted. Not enough value on transfer balance");
        }
    }

    public static void main(String[] args) {
        System.out.println("Balance on account: " + balance);
        System.out.println("");
        System.out.println("Deposit");
        deposit();
        System.out.println("");
        System.out.println("Withdraw");
        withdraw();
        System.out.println("");
        System.out.println("Transfer");
        System.out.println("Balance on transfer account: " + transfer_balance);
        transfer_from();
    }

}



