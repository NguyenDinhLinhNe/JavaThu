import java.util.*;

public class ngay31_1_bthtrang95_b8 {
    public static void main(String[] args) {
        // nhap cac so nguyen va tinh tong , tong > 100 thi dung va in ra
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap n : ");
            n = sc.nextInt();
        } while(n <= 0);
        double sum = 0;
        for(int i = 0;i < n; ++i){
            sum += sc.nextInt();
        }
        System.out.println("Trung binh cong cac so la : " + String.format("%.2f", sum / n));
    }
}
