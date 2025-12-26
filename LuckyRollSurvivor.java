import java.util.Arrays;
import java.util.Scanner;

public class LuckyRollSurvivor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int numberOfPlayers= (registerPlayers(input));
       int[] lives = new int[numberOfPlayers];
       System.out.println(numberOfPlayers);
       String[] namesOfPlayers = (namesOfPlayers(numberOfPlayers, input));
       System.out.println(Arrays.toString(namesOfPlayers));
       participant(lives, input, numberOfPlayers, namesOfPlayers);
       diceRolling(lives, input, numberOfPlayers, namesOfPlayers);
       input.close();

    }
    static int registerPlayers(Scanner input){
        int numberOfPlayers;
        System.out.print("Enter number of players : ");
        while (true) {
            if (input.hasNextInt()) {
                numberOfPlayers = input.nextInt();
                if (numberOfPlayers > 1) {
                    input.nextLine();
                    return numberOfPlayers;
                }else{
                    System.out.println("Number of players must be more than 1");
                }
            }else{
                System.out.println("Enter valid number : ");
                input.nextLine();
            }
        }

        
    }
    static String[] namesOfPlayers(int numberOfPlayers, Scanner input){
        String[] namesOfPlayers= new String[numberOfPlayers];
        while (true) {
           for (int i = 0; i < numberOfPlayers; i++) {
            System.out.printf("Enter name of the participant %d: ", i+1);
                 if (input.hasNextLine()) {
                namesOfPlayers[i] = input.nextLine();
                }else{
                    System.out.println("Enter valid name");
                }
           }
           return namesOfPlayers;
        }
    }
    static void participant(int[] lives, Scanner input, int players, String[]names){
        System.out.print("\n 🎲 Game has started each player has 3 lives\n");
        for (int i = 0; i < players; i++) {
            lives[i] = 3;
            System.out.printf("Hey %d) : %s! you are in the game with %d lives  Lets see how lucky you are!\n", 1+i, names[i], lives[i]);
        }
        
    static void diceRolling(int[] lives, Scanner input, int player, String[]names){
        boolean[] isAlive = new boolean[player];
        boolean[] iseliminated = new boolean[player];
        int alivePlayers = 1;
        while (alivePlayers > 1) {
            for(boolean value : iseliminated){
            if (value) {
                alivePlayers++;
            }
        }
        }
    }



    }
}
