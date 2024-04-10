package main;
import java.util.*;

import Person.Full_time_linh;
import Person.Full_time_sep;
import Person.Part_time;
import shapes.hinhChuNhat;
import shapes.hinhTron;
import shapes.hinhTru;
import shapes.hinhVuong;

public class mainClass {
    public static void main(String[] args) {
        Full_time_sep fts = new Full_time_sep("Nguyen Dinh Linh");
        Full_time_linh ftl1 = new Full_time_linh("Nguyen Van A", 3);
        Full_time_linh ftl2 = new Full_time_linh("Nguyen Van B");
        Part_time pt = new Part_time("Nguyen Van C", 12);

        fts.calculateSalary();
        ftl1.calculateSalary();
        ftl2.calculateSalary();
        pt.calculateSalary();

        fts.in();
        ftl1.in();
        ftl2.in();
        pt.in();
    }
}
