package ATM;

import java.util.Scanner;

public class ATM {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Please add Number Kart and PassWord");

        String pinCod = scanner.nextLine();
        int numKart = scanner.nextInt();
        start(pinCod,numKart);
    }

    public static void start(String pinCod, int numKart){
        for (AccountATM accountATM:Database.list) {
            if (numKart==accountATM.getNumKart()){
                if (pinCod.equals(accountATM.getPinCod())) {
                   menu();
                   chooseOption(accountATM);

                }
                else {
                    System.out.println("Error, No correct PinCode");

                }
            }
        }
    }

    public static void menu(){
        System.out.println("PRESS [1] TO CASH WITHDRAW\n" +
                "PRESS [2] TO WATCH BALANCE\n" +
                "PRESS [3] TO CHANCE PASSWORD\n" +
                "PRESS [4] TO TOP UP KART\n" +
                "PRESS [5] TO VIEW ACCOUNT DATA\n" +
                "PRESS [6] TO EXIT\n");

        }

    public static void chooseOption(AccountATM accountATM){
        int option = scanner.nextInt();
        int cash;
        String passWord;
        switch (option){
            case 1:
                System.out.println(accountATM.getBalance());
                System.out.println("HOW MONEY?");
                cash = scanner.nextInt();
                System.out.println(accountATM.getBalance() - cash);
                break;
            case 2:
                System.out.println(accountATM.getBalance());
                break;
            case 3:
                System.out.println("WHAT YOU WANT PASSWORD?");
                passWord = scanner.next();
                accountATM.setPinCod(passWord);
                System.out.println(accountATM.getPinCod());
                break;
            case 4:
                System.out.println(accountATM.getBalance());
                System.out.println("HOW MONEY ADD?");
                cash = scanner.nextInt();
                System.out.println(accountATM.getBalance() + cash);
                break;
            case 5:
                System.out.println(accountATM.getName());
                System.out.println(accountATM.getNumKart());
                System.out.println(accountATM.getBalance());
                System.out.println(accountATM.getPinCod());
                break;
            case 6:
                break;
            default:
                System.out.println("Чё это такое? Повторить, будь ласка!");

        }



    }
}
