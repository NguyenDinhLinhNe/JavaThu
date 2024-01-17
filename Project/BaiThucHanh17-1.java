
package dlinh;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;
import java.util.Locale;

public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        if(a == 0&& b == 0){
            System.out.println("Vo so nghiem !\n");
        }
        else if(a == 0 && b != 0){
            System.out.println("Vo nghiem !\n");
        }
        else{
            System.out.printf("x = %.2f\n", -b / a);
        }
    }
}