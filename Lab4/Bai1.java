package Lab4;

import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("So phan tu ban muon nhap : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; ++i){
            int num = sc.nextInt();
            arr.add(num);
        }
        int maxV = -1;
        for(int value : arr)
            maxV = Math.max(maxV , value);
        System.out.println("Gia tri lon nhat la : " + maxV);

        ArrayList<Integer> tmp = new ArrayList<>();
        System.out.print("Gia tri muon xoa : ");
        int num = sc.nextInt();
        tmp.add(num);
        arr.removeAll(tmp);

        Collections.sort(arr);
        System.out.println(arr);
    }
}
