package shapes;

import java.util.*;

class hinhHoc{
    protected final float PI = 3.14f;
    public String ten;
    public float chuVi, dienTich, theTich;

    public hinhHoc(){
        ten = "Hinh gi";
    }

    public void xuatTen(){
        System.out.println("Day la : " + ten);
    }

    public void inChuVi(){
        System.out.println("Chu vi : " + String.format("%.2f", chuVi));
    }

    public void inDienTich(){
        System.out.println("Dien tich : " + String.format("%.2f", dienTich));
    }

    public void inTheTich(){
        System.out.println("The tich : " + String.format("%.2f", theTich));
    }
}