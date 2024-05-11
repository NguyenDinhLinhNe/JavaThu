import java.util.*;

public class linkedlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
    
        // them phan tu
        ll.add(3);
        ll.add(4);
        ll.add(5);

        // them vao dau
        ll.addFirst(12);
        ll.addFirst(56);

        // xoa phan tu o vi tri x
        ll.remove(2);

        // xoa o dau va cuoi
        ll.removeFirst();
        ll.removeLast();

        // lay phan tu cuoi cung va dau tien
        ll.peekLast();
        ll.peekFirst();

        // thay the phan tu tai vi tri duoc chon
        ll.set(2 , 67);

        // lay do dai cua linkedlist
        ll.size();

        // xoa tat ca phan tu
        ll.clear();
    }
}
