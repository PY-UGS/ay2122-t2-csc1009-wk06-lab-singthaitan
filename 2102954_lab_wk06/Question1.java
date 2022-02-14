import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Question1 {
    public static void addAndSort(LinkedList<Integer> list, int value){
        list.add(value);
        Collections.sort(list);

    }
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));

        System.out.println("Linked list before change: ");
        for(int i = 0;i<linkedList.size();i++){
            System.out.print(" "+linkedList.get(i));
        }
        addAndSort(linkedList,6);
        System.out.println("\nLinked list after change: ");
        for(int i = 0;i<linkedList.size();i++){
            System.out.print(" "+linkedList.get(i));
        }
    }
}
