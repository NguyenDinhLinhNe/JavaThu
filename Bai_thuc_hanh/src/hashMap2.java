import java.util.*;

public class hashMap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer , String> hash = new HashMap<>();
        hash.put(1, "Apple");
        hash.put(2, "Banana");
        hash.put(3, "Cherry");
        hash.put(4, "Date");
        hash.put(5, "Elderberry");

        System.out.println("Cac key va value trong hashMap : ");
        hash.entrySet().stream()
        .forEach(entry ->{
            System.out.println(entry.getKey() + " " + entry.getValue());
        });

        System.out.println("1 : " + hash.get(1));
        System.out.println("5 : " + hash.get(5));

        if(hash.containsKey(4))
            System.out.println("Da xuat hien key nay trong map");
        
        if(!hash.containsValue("Mango"))
            System.out.println("Khong tim thay value nay trong map");
    }
}
