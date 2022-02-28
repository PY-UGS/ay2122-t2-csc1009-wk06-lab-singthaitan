import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Question6 {
    public static int findValue (HashMap<Integer, Integer> map, int searchVal){
        int key = -1;
        if(map.containsValue(searchVal)) {

            for(Map.Entry<Integer, Integer> entry: map.entrySet()) {

                //if give value is equal to value from entry
                // print the corresponding key
                if(entry.getValue() == searchVal) {
                    key = entry.getKey();
                }
            }
        }
        return key;
    }
    public static void main(String[] args){
        HashMap<Integer, Integer> map = new HashMap<>();
        Random random = new Random();
        for(int i = 0; i<500;i++)
        {
            map.put(i, random.nextInt(1000,10000));
        }
        int randnumber = random.nextInt(1000,10000);
        int position = findValue(map,randnumber);
        System.out.println("Position of random number "+randnumber+" is at index: "+ position);

    }
}
