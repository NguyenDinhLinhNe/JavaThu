import java.util.*;

public class treeMap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer , String> hash = new TreeMap<>();
        hash.put(1, "Dog");
        hash.put(2, "Cat");
        hash.put(3, "Bird");
        hash.put(4, "Fish");
        hash.put(5, "Horse");
        hash.put(6, "Lion");
        hash.put(7, "Tiger");
        hash.put(8, "Elephant");

        hash.forEach((key , value) ->{
            System.out.println(key + " " + value);
        });

        for(int key : hash.keySet())
            System.out.println(key + " " + hash.get(key));
    }
}
