import java.util.Scanner;

public class main {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
    // Java banking program for beginners
        double balance=0;
        boolean isRunning=true;
        int choice;
        while (isRunning){
            System.out.println("*******BANK PROGRAM*******");
            System.out.println("1. SHOW BALANCE");
            System.out.println("2. DEPOSIT");
            System.out.println("3. WITHDRAW");
            System.out.println("4. EXIT");
            // Declare Variables
            System.out.print("Enter Your Choice [1-4]: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE!!");
            }
        }
        System.out.println("Thanks for using this Program");
        scanner.close();
    }
    static void showBalance(double balance){
        System.out.printf("$%.2f\n",balance);
    }
    static double deposit(){
        double amount;
        System.out.print("Enter an amount : ");
        amount=scanner.nextDouble();

        if (amount<0){
            System.out.println("Amount invalid");
            return 0;
        }else{
            return amount;
        }
    }
    static double withdraw(double balance){
        double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount=scanner.nextDouble();
        if(amount>balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }else if(amount<0){
            System.out.println("Amount invalid");
            return 0;
        }else {
            return amount;
        }
    }
}
