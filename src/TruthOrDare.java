import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TruthOrDare {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> names = new ArrayList<>();
    private String lastNumber;
    private Object String;

    public TruthOrDare (){
    }

    public void playerSetup(){
        System.out.println("How many players do you have?");
        String playerAmount = scanner.nextLine();
//        System.out.println("What is the name of player " + );
        String player1 = scanner.nextLine();
        names.add(player1);
        System.out.println("Are you ready?");
        String confirmation = scanner.nextLine();
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
