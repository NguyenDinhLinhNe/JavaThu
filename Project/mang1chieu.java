import java.util.Scanner;
// import java.util.List;
// import java.util.Map;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.Set;
// import java.util.StringTokenizer;
// import java.util.HashSet;
// import java.util.LinkedHashMap;
// import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collections;
import java.util.Comparator;;

public class mang1chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String result = "";
        for(int i = 0;i < n; ++i){
            String s = sc.next();
            result += s + " ";
        }
        String[] t = result.split(" ");
        Arrays.sort(t , new Comparator<String>() {
            public int compare(String a,String b){
                return b.compareTo(a);
            }
        });
        for(String value : t)
            System.out.print(value);
        sc.close();
    }
}
