import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class TruthOrDare {
    private Scanner scanner = new Scanner(System.in);
    String[] names;
    HashMap<String, Integer> skips = new HashMap<>();

    int previousCount = 0;

    private String lastNumber;
    private Object String;

    public TruthOrDare (){
    }

    public void playerSetup(){
        System.out.println("How many players do you have?");
        int playerAmount = scanner.nextInt();
        names = new String[playerAmount];
        System.out.println("Enter the names: ");
        for(int i = 0; i < names.length; i++){
            System.out.println("What is the name of player " + (i + 1));
            names[i] = scanner.next();
        }
        for(String test: names){
            skips.put(test, 0);
        }
        System.out.println("Are you ready?");
        String confirmation = scanner.next();
        if (confirmation.equalsIgnoreCase("yes")){
            fiftyFifty();
        }
    }

    public void fiftyFifty(){
        Random random = new Random();
            int truthOrDare = random.nextInt(2);
            if (truthOrDare == 0){


            }else{

            }
        System.out.println("Are you ready to continue");
            String readyOrNot = scanner.nextLine();
            if (readyOrNot.equalsIgnoreCase("yes")){
                for(int i = 0; i <  names.length; i++){
                    fiftyFifty();
                }
                System.out.println("Are you done playing?");
                String answer = scanner.nextLine();
                if(answer.equalsIgnoreCase("no")) {
                    fiftyFifty();

                }else{
                    System.out.println("Thank you for playing.");
                }
            }
            else if(readyOrNot.equalsIgnoreCase("skip")){

//                skips.get();
            }else if(readyOrNot.equalsIgnoreCase("No")){
                System.out.println("Thanks for playing");
            }


    }
}
