package Person;
import java.util.*;
public class Part_time extends Employee{

    private double luongTheoGio, soGioLam, soNgayLam;
    private double luong;

    public Part_time(String name, String age, String address , int id, double luongTheoGio, double soGioLam, double soNgayLam){
        super(name , age , address , id);
        this.luongTheoGio = luongTheoGio;
        this.soNgayLam = soNgayLam;
    }

    public Part_time(){
        super();
        luongTheoGio = 25;
        soGioLam = 10;
        soNgayLam = 20;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap luong theo gio : ");
        this.luongTheoGio = sc.nextDouble();
        System.out.print("Nhap so gio lam moi ngay : ");
        this.soGioLam = sc.nextDouble();
        System.out.print("Nhap so ngay lam trong thang : ");
        this.soNgayLam = sc.nextDouble();
        sc.nextLine();
    }

    public void tinhLuong(){
        luong = this.luongTheoGio * this.soGioLam * this.soNgayLam;
    }

    public void in(){
        super.in();
        tinhLuong();
        System.out.println("Luong nv part time : " + String.format("%.0f", luong));
        System.out.println("---------------------------------");
    }
}
