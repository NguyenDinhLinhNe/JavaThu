package Lab4;

import java.util.*;

class sinhvien{
    private String id, name, classs;
    public Scanner sc = new Scanner(System.in);

    public sinhvien(){

    }

    public String getName(){
        return name;
    }

    public String getID(){
        return id;
    }

    public String getClasss(){
        return classs;
    }

    public void Nhap(){
        System.out.print("Nhap ma sinh vien : ");
        id = sc.nextLine();
        System.out.print("Nhap ten sinh vien : ");
        name = sc.nextLine();
        System.out.print("Nhap lop sinh vien : ");
        classs = sc.nextLine();
    }

    public void In(){
        System.out.println("Id : " + id);
        System.out.println("Name :" + name);
        System.out.println("Class : " + classs);
    }
}

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("So sinh vien ban muon nhap la : ");
        ArrayList<sinhvien> arr = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i < n; ++i){
            sinhvien sv = new sinhvien();
            sv.Nhap();
            arr.add(sv);
        }

        System.out.print("Ten lop ban muon nhap : ");
        String tenLop = sc.nextLine();
        System.out.println("Nhung sinh vien thuoc lop " + tenLop + " la : ");
        for(sinhvien sv : arr){
            if(sv.getClasss().equals(tenLop))
                System.out.println(sv.getName());
        }

        System.out.print("Ma sinh vien ban muon nhap : ");
        String maSv = sc.nextLine();
        System.out.print("Ten va lop cua sinh vien voi ma sinh vien " + maSv + " la : ");
        for(sinhvien sv : arr){
            if(sv.getID().equals(maSv))
                System.out.println(sv.getName() + ", " + sv.getClasss());
        }
        sc.close();
    }
}
