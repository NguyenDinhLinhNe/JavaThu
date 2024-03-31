package shapes;

import java.util.*;

public class hinhChuNhat extends hinhHoc{
    protected float dai, rong;

    public hinhChuNhat(){
        ten = "Hinh chu nhat";
    }

    public void xuatTen(){
        super.xuatTen();
    }

    public void nhapChieuDai(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai : ");
        dai = sc.nextFloat();
    }

    public void nhapChieuRong(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu rong : ");
        rong = sc.nextFloat();
    }

    public void tinhChuVi(){
        chuVi = (dai + rong) * 2;
    }

    public void tinhDienTich(){
        dienTich = dai * rong;
    }
}
