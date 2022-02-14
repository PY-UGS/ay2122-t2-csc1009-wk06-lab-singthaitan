import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Question2 {
    public static void swapValues(LinkedList<Integer> list, int indexOne,int indexTwo){
        int element1 = list.get(indexOne);
        int element2 = list.get(indexTwo);
        list.set(indexOne, element2);
        list.set(indexTwo, element1);

    }
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));
        int index1,index2;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter First index value: ");
        index1 = input.nextInt();
        System.out.print("\nEnter Second index value: ");
        index2 = input.nextInt();
        System.out.print("\nLinked list before change: ");
        for(int i = 0;i<linkedList.size();i++){
            System.out.print(" "+linkedList.get(i));
        }
        swapValues(linkedList,index1,index2);
        System.out.print("\nLinked list after change: ");
        for(int i = 0;i<linkedList.size();i++){
            System.out.print(" "+linkedList.get(i));
        }
    }
}
