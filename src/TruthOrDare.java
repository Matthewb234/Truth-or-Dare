import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TruthOrDare {
    private Scanner scanner = new Scanner(System.in);

    public TruthOrDare (){
    }

    public void playerSetup(){
        System.out.println("How many players do you have?");
        int playerAmount = scanner.nextInt();
        System.out.println("Enter the names: ");
        String[] names = new String[playerAmount];
        for(int i = 0; i < names.length; i++){
            System.out.println("What is the name of player " + (i + 1));
            names[i] = scanner.next();
        }
        for(String test: names){
            System.out.println(test);
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
    }
}
