import java.util.*;

public class treeMap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String , String> tree = new TreeMap<>();
        tree.put("USA", "Washington, D.C.");
        tree.put("France", "Paris");
        tree.put("Germany", "Berlin");
        tree.put("Japan", "Tokyo");
        tree.put("Canada", "Ottawa");
        tree.put("Brazil", "Brasilia");
        tree.put("India", "New Delhi");
        tree.put("Australia", "Canberra");

        tree.replace("France" , "VietNam");

        tree.replace("India" , "New Delhi" , "Dinh Linh");
        System.out.println(tree);

        tree.entrySet().stream()
        .forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }
}
