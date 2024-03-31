package shapes;

import java.util.*;

public class hinhTru extends hinhTron{
    private float chieuCao;

    public hinhTru(){
        ten = "Hinh tru";
    }

    public void xuatTen(){
        super.xuatTen();
    }

    public void nhapChieuCao(){
        Scanner sc = new Scanner(System.in);
        super.nhapBanKinh();
        System.out.print("Nhap chieu cao : ");
        chieuCao = sc.nextFloat();
    }

    public void tinhTheTich(){
        theTich = PI * banKinh * banKinh * chieuCao;
    }
}
