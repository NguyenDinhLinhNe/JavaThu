import java.util.*;

public class hashSet1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(6);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(1);
        System.out.print("Cac phan tu trong hashSet la : ");
        System.out.println(hashSet);
        System.out.print("Nhap so muon kiem tra : ");
        int num = sc.nextInt();
        if(hashSet.contains(num))
            System.out.println("Da tim thay trong HashSet");
        else
            System.out.println("Khong tim thay trong HashSet");
    }
}
