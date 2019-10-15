import java.util.HashMap;
import java.util.Random;

public class Dare {
    HashMap<Integer, String> dares = new HashMap<>();
    private void setDares(){
        dares.put(1, "Look through someone's phone (nothing can be hidden)");
        dares.put(2, "Slap the person to your right in the face");
        dares.put(3, "Eat a lipton packet");
        dares.put(4, "Sleep in your underwear");
        dares.put(5, "Prank call someone in your family");
        dares.put(null , null);
    }
    private String getDare(){
        setDares();
        Random rand = new Random();
        int getValue = rand.nextInt(dares.size());
        return dares.get(getValue);
    }
}
