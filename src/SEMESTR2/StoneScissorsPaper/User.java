package SEMESTR2.StoneScissorsPaper;

import java.util.Scanner;

public class User {
 private Scanner scanner;
 public User(){
     scanner = new Scanner(System.in);
 }
    public Move getMove(){
        System.out.print("Камінь, ножиці або папір?");
        String m = scanner.nextLine();
        m = m.toUpperCase();
        char c = m.charAt(0);
        if (c == 'S'|| c== 'P'|| c=='R'){
            switch (c){
                case 'S': return Move.SCISSORS;
                case 'P': return Move.PAPER;
                case 'R': return Move.ROCK;
            }

        }

        return getMove();
    }
    public boolean PlayAgain(){
     System.out.println("Do you want play again? Yes or No");
     String p = scanner.nextLine();
     p = p.toUpperCase();
        return p.charAt(0)== 'Y';
    }
}
