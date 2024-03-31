package shapes;

import java.util.*;

public class hinhTron extends hinhHoc {
    protected float banKinh;

    public hinhTron(){
        ten = "Hinh tron";
    }

    public void xuatTen(){
        super.xuatTen();
    }

    public void nhapBanKinh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh : ");
        banKinh = sc.nextFloat();
    }
    
    public void tinhChuVi(){
        chuVi = 2 * PI * banKinh;   
    }

    public void tinhDienTich(){
        dienTich = PI * banKinh * banKinh;
    }
}
