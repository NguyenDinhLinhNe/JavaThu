import java.util.*;

public class linkedlishHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Integer> hash = new LinkedHashSet<>();
        hash.add(6);
        hash.add(3);
        hash.add(19);
        hash.add(14);
        hash.add(48);
        hash.add(35);
        System.out.print("Phan tu ban muon xoa : ");
        int num = sc.nextInt();
        System.out.println("HashSet truoc khi xoa : " + hash);
        if(hash.contains(num)){
            hash.remove(num);
            System.out.println("HashSet sau khi xoa : " + hash);
        }
        else
            System.out.println("Khong co phan tu trong hashSet");
    }
}
