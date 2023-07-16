import java.util.*;
public class BankApplicationSystem{
    public static void main(String[] args) {



            BankAccount b = new BankAccount("Arpita", "1");

            b.showMenu();


        }
}

class BankAccount {
    String customarName;
    String customarId;
    int balance;
    int previousTransaction;

    BankAccount(String cName, String cId) {
        customarName = cName;
        customarId = cId;
    }

    ///////////////////////// WHEN DEPOSIE TO THE MONEY ///////////////////////////////////////
    void deposite(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    ///////////////////////   withdraw Money //////////////////////////////////////////////////


    void withdrawn(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = amount;
        }
    }

    //////////////////// When Check To Previous Transaction //////////////////////////////////

    void previousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Last Time Deposite Money was:" + " " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Last Time Withdraw Money was:" + " " + previousTransaction);
        } else {
            System.out.println("Till No Transaction:");
        }
    }

    void showMenu() {
        System.out.println("Welcome" + " " + customarName);
        System.out.println("Your Id" + " " + customarId);
        System.out.println("A: You want to check Balance");
       System.out.println("B: You want to Deposite  Money");
       System.out.println("C: You want to see Previous Transaction");
       System.out.println("D: You want to Exit");
        System.out.println();

        int choice;
        do {
            System.out.println("Please Enter you Choice");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Your Balance is:" + " " + balance);
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("You pay amount:");
                    int amount = sc.nextInt();
                    deposite(amount);
                    System.out.println("Your amount deposite successfully!");
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("You withdraw Money");
                    int amount2 = sc.nextInt();
                    withdrawn(amount2);
                    System.out.println("Your amount withdrawn successfully!");
                    System.out.println();
                }
                case 4 -> {
                    System.out.println("You Check your previous Transacton:");
                    previousTransaction();
                    System.out.println();
                }
                case 5 -> {
                    System.out.println("You Exit Successfully!");
                    System.out.println();
                }
                default -> {
                    System.out.println("You choose a wrong option");
                    System.out.println();
                }
            }


        } while (choice != 5);
    }
}



