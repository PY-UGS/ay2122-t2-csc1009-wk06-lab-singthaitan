import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Question3 {
    public static int findValue (LinkedList<Integer> list, int searchVal){
        if(list.contains(searchVal)==true) {
            return list.indexOf(searchVal);
        }
        else
        {
            return -1;
        }
    }
    public static void main(String[] args){

        LinkedList<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));
        Random random = new Random();
        for(int i = 0; i<500;i++)
        {
            linkedList.add(random.nextInt(1000,10000));
        }
        int randnumber = random.nextInt(1000,10000);
        int position = findValue(linkedList,randnumber);
        System.out.println("Position of random number "+randnumber+" is at index: "+ position);

    }
}
