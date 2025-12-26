import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Map;

public class DiceRolling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numDice;
        int numberOfPlayers = (players(scanner)) ;
        scanner.nextLine(); 
        String[] names = (names(scanner, numberOfPlayers));
        System.out.println("players who signed are/is : " + Arrays.toString(names));
        Map<String, Integer> scoresDict = ( diceRolling(random, scanner, numberOfPlayers, names));
        System.out.println(scoresDict);
        
        
        
        //  roll number method
       
        
        

        // check if number of dice is greater than 0
       

       scanner.close(); 
    }
    static int players(Scanner scanner){
        while (true) {
            System.out.println("Enter number of players (1-3)");
            int  numberOfPlayers ;
            if (scanner.hasNextInt()) {
                numberOfPlayers = scanner.nextInt();
                if (numberOfPlayers > 0 && numberOfPlayers <= 3) {
                    return numberOfPlayers;
                }else{
                    System.out.println("The system can only support (1-3) players");
                }
            }else{
                System.out.println("Please input valid number");
                scanner.nextLine(); 

            }
        }
    }
    static String[] names(Scanner scanner , int numberOfPlayers){
        String[] names = new String[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            while (true) {
                System.out.println("Enter name of player " + (i+1) + ":");
                if (scanner.hasNextLine()) {
                   names[i] = scanner.nextLine().trim();
                   if (!names[i].isEmpty()) {
                    break;
                   }else{
                    System.out.println("Name cannot be empty Enter again :");
                   }
                }else{
                    System.out.println("Enter a valid name");
                }
                
            }
        }
        return names;
    }
    static void printDice(int roll){
        String dice1 = """
                ---------
                |       |
                |   o   |
                |       |
                ---------


                """;
        String dice2 = """
                ---------
                | o     |
                |       |
                |     o |
                ---------

                """; 
        String dice3 = """
                ---------
                | o     |
                |   o   |
                |     o |
                ---------

                """; 
        String dice4 = """
                ---------
                | o   o |
                |       |
                | o   o |
                ---------

                """;
        String dice5 = """
                ---------
                | o   o |
                |   o   |
                | o   o |
                ---------

                """;  
        String dice6 = """
                ---------
                | o   o |
                | o   o |
                | o   o |
                ---------

                """;  
         switch (roll) {
            case 1:
                System.out.println(dice1);
                break;
            case 2:
                System.out.println(dice2);
                break;
            case 3:
                System.out.println(dice3);
                break;
            case 4:
                System.out.println(dice4);
                break;
            case 5:
                System.out.println(dice5);
                break;
            case 6:
                System.out.println(dice6);   
                break;      
            default:
                System.out.println("invalid please roll agaain");
                break;
         }                                                      
    }
    // rolling dice method
    static Map<String, Integer> diceRolling( Random random, Scanner scanner,int numberOfPlayers, String[] names){
        int numDice;
        Map<String, Integer> scoreDict = new HashMap<>();
        int[] scores = new int[numberOfPlayers];
        System.out.printf("\n The game is stating with %s\n", names[0]);
        for (int i = 0; i < numberOfPlayers; i++) {
            // validate number of dice to roll
             while (true) {
                System.out.printf(" %s Enter the number of dice you wanna roll : ", names[i]);
                if (scanner.hasNextInt()) {
                numDice = scanner.nextInt(); 
                if ((numDice > 0 && numDice <=3) ) {
                    break;
                }else{
                    System.out.println("You can only roll a maximum of three rolls at a time");
                } 
                }else{
                    System.out.println("invalide input please enter roll number");
                    scanner.next();
                }
            }
        // check
         if (numDice > 0) {
            for (int j = 0; j < numDice; j++) {
                int roll = random.nextInt(1,7);
                System.out.printf("You rolled %d \n" , roll);
                printDice(roll);
                // total +=roll;
                scores[i] += roll;
                System.out.printf("%s's scores is : %d%n",names[i], scores[i]);
            }
         } else{
            System.out.println("Number of dice must be greater than zero");
            }
            scoreDict.put(names[i], scores[i]);
        }
        return scoreDict;
    }
     
}
