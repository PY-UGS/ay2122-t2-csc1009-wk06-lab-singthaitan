import java.util.*;

public class Question4 {
    // function to sort hashmap by values
    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list =
                new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    public static HashMap<Integer, Integer> addAndSort(HashMap<Integer,Integer> map, int value){
        map.put(map.size(),value);
        return sortByValue(map);
    }
    public static void main(String[] args){
        HashMap map = new HashMap<Integer, Integer>() {{
            put(0, 1);
            put(1, 3);
            put(2, 5);
            put(3, 7);
            put(4, 9);
            put(5, 11);
        }};

        System.out.println("Hash map before change: ");
        for(int i = 0;i< map.size();i++){
            System.out.print(" "+map.get(i));
        }
        HashMap<Integer, Integer> temp = addAndSort(map,6);
        System.out.println("\nHash map after change: ");
        for (Map.Entry<Integer, Integer> en : temp.entrySet()) {
            System.out.print(" "+ en.getValue());
        }
    }
}
