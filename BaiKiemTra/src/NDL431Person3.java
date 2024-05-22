import java.util.*;

class Person{
    private String name;
    private int id;
    private double mark;
    public Scanner sc = new Scanner(System.in);
    public LinkedList<Person> ll = new LinkedList<>();

    public void Nhap(){
        sc.nextLine();
        System.out.print("Nhap ten : ");
        name = sc.nextLine();
        System.out.print("Nhap id : ");
        id = sc.nextInt();
        System.out.print("Nhap diem : ");
        mark = sc.nextDouble();
    }

    public void Xuat(){
        System.out.println("Ten : " + name);
        System.out.println("ID : " + id);
        System.out.println("Diem : " + mark);
    }

    public void themMoi(Person p){
        ll.add(p);
    }

    public void sua(Person p){
        String choice;
        System.out.print("Ban co muon sua ten khong : (yes / no) ");
        choice = sc.next();
        while(!choice.equals("yes") || !choice.equals("no")){
            System.out.println("Moi ban nhap lai !");
            System.out.print("Ban co muon sua ten khong : (yes / no) ");
        }
        if(choice.equals("yes")){
            System.out.print("Sua ten thanh : ");
            name = sc.nextLine();
        }
        System.out.print("Ban co muon sua id khong : (yes / no) ");
        choice = sc.next();
        while(!choice.equals("yes") || !choice.equals("no")){
            System.out.println("Moi ban nhap lai !");
            System.out.print("Ban co muon sua id khong : (yes / no) ");
        }
        if(choice.equals("yes")){
            System.out.print("Sua id thanh : ");
            id = sc.nextInt();
        }
        System.out.print("Ban co muon sua diem khong : (yes / no) ");
        choice = sc.next();
        while(!choice.equals("yes") || !choice.equals("no")){
            System.out.println("Moi ban nhap lai !");
            System.out.print("Ban co muon sua diem khong : (yes / no) ");
        }
        if(choice.equals("yes")){
            System.out.print("Sua diem thanh : ");
            mark = sc.nextDouble();
        }
    }

    public void xoa(){
        int pos;
        do{
            System.out.print("Nhap vi tri ban muon xoa : ");
            pos = sc.nextInt();
        } while(pos < 0 || pos > ll.size());
        ll.remove(pos);
    }

    public void hienThiTatCa(){
        for(Person ps : ll){
            ps.Xuat();
        }
    }
}

public class NDL431Person3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("So nguoi ban muon nhap : ");
        int n = sc.nextInt();

        Person ps = new Person();
        for(int i = 0;i < n; ++i){
            ps = new Person();
            ps.Nhap();
            ps.themMoi(ps);
        }
        ps.hienThiTatCa();
    }
}
