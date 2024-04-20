package LinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LL ll=new LL();
//  ll.insertFirst(10);
//        ll.insertFirst(20);
//        ll.insertFirst(30);
//        ll.insertFirst(40);
//
//        ll.display();
//
//        ll.insert(35,2);
//        System.out.println();
//        ll.display();
//        System.out.println();
//        System.out.println(ll.deleteFirst());
//        ll.display();
//        System.out.println(ll.deleteLast());
//        ll.display();
//        System.out.println(ll.delete(1));
//        ll.display();
//        ll.insertFirst(10);
//        ll.insertFirst(10);
//        ll.insertFirst(20);
//        ll.insertFirst(30);
//        ll.insertFirst(30);
//        ll.insertFirst(40);
//        ll.display();
//        ll.removeDuplicate();
//        System.out.println();
//        ll.display();

        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);
        LL ans = LL.merge(first, second);
        ans.display();


    }
}
