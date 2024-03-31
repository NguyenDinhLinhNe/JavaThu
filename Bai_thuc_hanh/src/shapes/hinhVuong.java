package shapes;

import java.util.*;

public class hinhVuong extends hinhChuNhat{
    public hinhVuong(){
        ten = "Hinh vuong";
    }

    public void xuatTen(){
        super.xuatTen();
    }

    public void nhapCanh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh : ");
        dai = sc.nextFloat();
        rong = dai;
    }
}
