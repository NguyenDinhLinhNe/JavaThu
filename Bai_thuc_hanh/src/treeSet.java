import java.util.*;

public class treeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> tree = new TreeSet<>();
        tree.add("Linh");
        tree.add("Ly");
        tree.add("An");
        tree.add("Tung");
        tree.add("HP");
        tree.add("Legion");

        SortedSet<String> treeSet = new TreeSet<>();
        treeSet = tree.tailSet("HO");
        System.out.println(treeSet);
        tree.forEach(element ->{
            System.out.println(element);
        });
        tree.forEach(System.out::println);
    }
}
