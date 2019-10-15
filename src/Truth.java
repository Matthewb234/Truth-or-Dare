import java.util.HashMap;
import java.util.Random;

public class Truth {
    HashMap<Integer, String> truths = new HashMap<>();
    private void setTruths(){
        truths.put(1, null);
    }
    public String getTruth(){
        setTruths();
        Random rand = new Random();
        int getValue = rand.nextInt(truths.size());
        return truths.get(getValue);
    }
}
