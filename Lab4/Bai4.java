package Lab4;

import java.util.*;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> hash = new HashSet<>();
        System.out.print("So trai cay ban muon nhap : ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i < n; ++i){
            System.out.print("Loai trai cay thu " + (i + 1) + " : ");
            String tenTraiCay = sc.nextLine();
            hash.add(tenTraiCay);
        }
        System.out.println("Tong so trai cay vua nhap : " + hash.size());

        System.out.print("Ten trai cay ban muon kiem tra : ");
        String tenMuonKiemTra = sc.nextLine();
        boolean check = true;
        for(String traiCay : hash){
            if(traiCay.equals(tenMuonKiemTra)){
                check = false;
                break;
            }
        }
        if(check)
            System.out.println("Khong tim thay loai trai cay nay");
        else
            System.out.println("Da tim thay loai trai cay nay");
        Random random = new Random();
        int randomNumber = random.nextInt((hash.size() - 1));
        int cnt = 0;
        for(String ten : hash){
            if(cnt == randomNumber)
                hash.remove(ten);
            ++cnt;
        }
        System.out.print("Danh sach cac loai trai cay : ");
        for(String ten : hash)
            System.out.print(ten + " ");

        List<String> list = new ArrayList<>(hash);
        for(String ten : list){
            hash.add(ten);
        }
        Iterator<String> iterator = hash.iterator();
        System.out.print("Cac loai trai cay la : ");
        while(iterator.hasNext())
            System.out.print(iterator.next() + " ");
        hash.removeAll(list);
        for(String ten : hash)
            System.out.print(ten + " ");
    }
}
