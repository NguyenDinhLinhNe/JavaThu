import java.util.*;

public class hashSet2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hash = new HashSet<>();
        hash.add(4);
        hash.add(2);
        hash.add(18);
        hash.add(40);
        hash.add(34);
        System.out.print("Phan tu ban muon xoa : ");
        int num = sc.nextInt();
        System.out.println("HashSet truoc khi xoa : " + hash);
        hash.remove(num);
        System.out.println("HashSet sau khi xoa : " + hash);
    }
}
