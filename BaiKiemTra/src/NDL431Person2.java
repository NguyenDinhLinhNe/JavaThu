
import java.util.*;

class Person{
    private String name;
    private int id;
    private double mark;
    public Scanner sc = new Scanner(System.in);

    public void Nhap(){
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
}

public class NDL431Person2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
}
