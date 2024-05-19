package Lab4;

import java.util.*;

class SinhVien{
    private String name;
    private double mark;
    public Scanner sc = new Scanner(System.in);

    public SinhVien(){
        this.name = "Dinh Linh";
        this.mark = 5.4;
    }

    public SinhVien(String name, double mark){
        this.name = name;
        this.mark = mark;
    }

    public String getName(){
        return name;
    }

    public double getMark(){
        return mark;
    }

    public boolean thiLai(){
        return this.mark <= 5;
    }

    public void In(){
        System.out.println("\nName : " + name);
        System.out.println("Mark : " + mark);
    }
}

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<SinhVien> ll = new LinkedList<>();
        while(true){
            System.out.print("Nhap ten sinh vien : ");
            String name = sc.nextLine();
            if(name.equals(""))
                break;
            System.out.print("Nhap diem sinh vien : ");
            double mark = sc.nextDouble();
            SinhVien sv = new SinhVien(name , mark);
            ll.add(sv);
            sc.nextLine();
        }

        System.out.print("Danh sach sinh vien thi lai : ");
        boolean check = true;
        for(SinhVien sv : ll){
            if(sv.thiLai()){
                check = false;
                sv.In();
            }
        }
        if(check)
            System.out.println("0");

        double highestMark = -1;
        for(SinhVien sv : ll)
            highestMark = Math.max(highestMark , sv.getMark());

        System.out.print("Danh sach sinh vien co diem cao nhat : ");
        for(SinhVien sv : ll)
            if(sv.getMark() == highestMark)
                sv.In();
        System.out.print("Nhap ten sinh vien ban muon tim : ");
        String tenMuonTim = sc.nextLine();
        SinhVien sinhVien = new SinhVien();
        check = true;
        for(SinhVien sv : ll){
            if(sv.getName().equals(tenMuonTim)){
                sinhVien = new SinhVien(sv.getName(), sv.getMark());
                check = false;
            }
        }
        if(check)
            System.out.println("Khong co sinh vien ten nhu vay");
        else{
            System.out.println("Thong tin sinh vien ban muon tim la : ");
            sinhVien.In();
        }
    }
}
