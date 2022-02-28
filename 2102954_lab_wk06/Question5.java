import java.util.*;

public class Question5 {
    public static void swapValues(HashMap<Integer, Integer> map, int indexOne, int indexTwo){
        int element1 = map.get(indexOne);
        int element2 = map.get(indexTwo);
        map.replace(indexOne, element2);
        map.replace(indexTwo, element1);

    }
    public static void main(String[] args){
        LinkedHashMap map = new LinkedHashMap<Integer, Integer>() {{
            put(0, 1);
            put(1, 3);
            put(2, 5);
            put(3, 7);
            put(4, 9);
            put(5, 11);
        }};
        int index1,index2;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter First index value: ");
        index1 = input.nextInt();
        System.out.print("\nEnter Second index value: ");
        index2 = input.nextInt();
        System.out.print("\nHashmap before change: ");
        for(int i = 0;i<map.size();i++){
            System.out.print(" "+map.get(i));
        }
        swapValues(map,index1,index2);
        System.out.print("\nHashmap after change: ");
        for(int i = 0;i<map.size();i++){
            System.out.print(" "+map.get(i));
        }
    }
}
