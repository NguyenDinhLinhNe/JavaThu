package Lab4;

import java.util.*;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
        System.out.print("So phan tu ban muon nhap : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; ++i){
            int num = sc.nextInt();
            ll.add(num);
        }
        int avg = 0;
        int ssc = 0;
        for(int value : ll){
            if(value % 2 == 0){
                ++ssc;
                avg += value;
            }
        }
        System.out.println("Trung binh cong cua cac so chan la : " + String.format("%.2f", (double)avg / ssc));
    }
}
