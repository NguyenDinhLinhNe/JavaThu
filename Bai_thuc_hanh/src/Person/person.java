package Person;

import java.util.*;

public class person {
    protected String name, age, address;
    public person(String name, String age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public person(){
        name = "dinh";
        age = "18";
        address = "Ha noi";
    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        // sc.nextLine();
        System.out.print("Nhap ten : ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi : ");
        age = sc.nextLine();
        System.out.print("Nhap dia chi : ");
        address = sc.nextLine();
    }

    public void inThongTin(){
        System.out.println("---------------------------------");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Address : " + address);
    }

    public static void main(String[] args){
        System.out.println("Nhap thong tin nhan vien part time : ");
        Part_time pt = new Part_time();
        pt.nhap();
        Full_time ft = new Full_time();
        ft.nhap();
        pt.in();
        ft.in();
    }
}
