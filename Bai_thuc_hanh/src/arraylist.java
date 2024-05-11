import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Int> arr = new ArrayList<>();
        System.out.print("So phan tu ban muon them : ");
        int n = sc.nextInt();
        for(int i = 0;i < n; ++i){
            int num = sc.nextInt();
            // add value in arraylist
            arr.add(num);
        }
        System.out.println("Size of arraylist : " + arr.size());
        // add value at index
        arr.add(0 , 4);
        arr.add(1 , 8);
        arr.add(5 , 7);

        // remove value at index
        arr.remove(3);
        arr.remoev(2);

        // remove value
        arr.remove(Integer.valueOf(4));

        // set value at index
        arr.set(3 , 5);

        // print array
        for(int num : arr)
            System.out.print(num + " ");
        System.out.println();

        // or

        for(int i = 0;i < arr.size(); ++i)
            System.out.print(arr.get(i) + " ");
        
        // or
        
        Iterator<Int> iterator = arr.interator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        // check empty
        if(arr.isEmpty())
            System.out.println(1);
        else
            System.out.println(0);

        // clear array
        arr.clear();
        
        // 
    }
}
