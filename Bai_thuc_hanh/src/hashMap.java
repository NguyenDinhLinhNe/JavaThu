import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer , Integer> hash = new HashMap<>();
        hash.put(1, 2);
        hash.put(3 , 6);
        hash.put(6 , 9);
        hash.put(5 , 10);
        hash.entrySet().stream()
        .forEach(entry ->{
            System.out.println(entry.getKey() + " " + entry.getValue());
        });

        for(Map.Entry<Integer , Integer> entry : hash.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());

        Iterator<Map.Entry<Integer , Integer>> iterator = hash.entrySet().iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next() + " ");
        
        hash.forEach((key , value) -> {
            System.out.println(key + " " + value);
        });
    }
}
