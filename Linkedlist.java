package piyush;

import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist{
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<String>();
        LinkedList<String> list2 = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for list 1: ");
        for(int i =0; i<5;i++){
            String m = sc.next();
            list1.add(m);
        }
        System.out.println("list 1:-"+list1);
        System.out.println("Enter elements for List2: ");
        for(int i =0;i<3;i++){
            String n = sc.next();
            list2.add(n);
        }
        System.out.println("list 2:-"+list2);
        list1.addAll(3,list2);
        System.out.println("list after addAll function:-"+list1);
        list1.remove(2);
        System.out.println("list after removing:-"+list1);
        System.out.println("Return the last index of given element:");
        System.out.println(list1.lastIndexOf(45));
        System.out.println(list1.poll());
        System.out.println(list1);
        System.out.println(list1.pollLast());
        System.out.println(list1);
    }
}
