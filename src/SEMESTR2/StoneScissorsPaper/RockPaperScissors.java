package SEMESTR2.StoneScissorsPaper;

public class RockPaperScissors {
   private User user;
   private Computer computer;
   int UserScore;
   int ComputerScore;
   int CountOfGame;

    public RockPaperScissors() {
        user = new User();
        computer = new Computer();
        UserScore = 0;
        ComputerScore = 0;
        CountOfGame = 0;
    }
    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors();
        game.startGame();
    }
    public void startGame(){
        System.out.println("--- Game Starting ---");
        Move userMove = user.getMove();
        Move computerMove = computer.getMove();
        System.out.println("Your move " + userMove);
        System.out.println("Computer move " + computerMove);
        int compareMove = userMove.compareMoves(computerMove);
        switch (compareMove){

            case 0 :
                System.out.println("Draw");
                break;
            case 1:
                System.out.println(userMove + " hit " + computerMove);
                System.out.println("--- You win ---");
                UserScore++;
                break;
            case 2:
                System.out.println(computerMove + " hit " + userMove);
                System.out.println("--- Computer win ---");
                ComputerScore++;
                break;
        }
        CountOfGame++;
        if (user.PlayAgain()){
            startGame();
        }
        else{
            printGameStats();
        }
    }
    private void printGameStats() {
        int wins = UserScore;
        int losses = ComputerScore;
        int ties = CountOfGame - UserScore - ComputerScore;
        double percentageWon = (wins + ((double) ties) / 2) / CountOfGame;

// Вивід лінії
        System.out.print("+");
        printDashes(68);
        System.out.println("+");

// Вивід заголовків таблиці
        System.out.printf("| %6s | %6s | %6s | %12s | %14s |\n",
                "WINS", "LOSSES", "TIES", "GAMES PLAYED", "PERCENTAGE WON");

// Вивід лінії
        System.out.print("|");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(16);
        System.out.print("+");
        printDashes(18);
        System.out.println("|");

// Вивід значень
        System.out.printf("| %6d | %6d | %6d | %12d | %13.2f%% |\n",
                wins, losses, ties, CountOfGame, percentageWon * 100);

// Вивід лінії
        System.out.print("+");
        printDashes(68);
        System.out.println("+");
    }
    private void printDashes(int numberOfDashes) {
        for (int i = 0; i < numberOfDashes; i++) {
            System.out.print("-");
        }
    }
}
