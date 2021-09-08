package javaFramework;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        ArrayList<Integer> l3 = new ArrayList<Integer>();
        l3.add(1);
        l3.add(2);
        l3.add(3);
        l3.add(4);
        l3.add(5);
        l3.add(6);
        l3.add(7);
        l3.add(8);
        l3.add(9);
        l3.add(10);
        System.out.println(l3);
        System.out.println("Enter elements for List 1: ");
        for(int i=0;i<5;i++){
            int n = sc.nextInt();
            l1.add(n);
        }
        System.out.println("Enter elements for List 2: ");
        for(int i=0;i<3;i++){
            int m = sc.nextInt();
            l2.add(m);
        }
        System.out.println("***List 1 before addition of list 2***");
        for (int i:l1) {
            System.out.println(i);
        }
        l1.addAll(3,l2);
//      l1.add(56.67);
//      l1.add(45.09);
//      l1.add(47.89);
//      l1.add(91.56);
//      l1.add(60.78);
//      l2.add(9.89);
//      l2.add(78.67);
//      l2.add(45.56);
//      l1.add(3,4.0);
//      l1.addAll(4,l2);
//      l1.set(0,34.12);
//        System.out.println(l1.contains(91.56));
        System.out.println("***List 1 after additon of list 2***");
        for (int i:l1) {
            System.out.println(i);
        }
        System.out.println("***Now printing the list***");
        //printing list normally
        System.out.println(l1);
        // now some function for list
        //->size()= gives the size of the list
        System.out.println("Size of list 1");
        System.out.println(l1.size());
        //->clear()= delete all the elements from the list
        l2.clear();
        System.out.println("cleared list l2");
        System.out.println(l2);
        //->contains(Object o)=it returns true when the list contains the particular element
        System.out.println("result of contains method ");
        System.out.println(l1.contains(34));
        //->get(int index)= it gives the value at the particular index
        System.out.println("Here the value is printed by get method ");
        System.out.println(l1.get(4));
        //->indexOf(Object o)=this function tells the first index of the particular value,
        // means that if there is one value coming 2 or more than 2 times then
        // this function only gives the index of the first occurring value
        System.out.println("here it prints the index of the given value");
        System.out.println(l1.indexOf(34));
        //->isEmpty()=this function returns true or false if the list is empty or not
        System.out.println("result of isEmpty function");
        System.out.println(l2.isEmpty());
        //->lastIndexOf(Object o)= it gives the last index of particular value
        System.out.println("result of lastIndexOf function");
        System.out.println(l1.lastIndexOf(34));
        //->remove(int index)=removes the value at particular index
        //->remove(Object o)=removes the value
        //->removeAll(Collection c)= remove a list
        //-> removeRange(startIndex,lastIndex)= removes the elements from the particular range
        //->removeIf(condition)= remove all elements of the collection if the given condition satisfy
        System.out.println("result of remove function by using index argument ");
        l1.remove(3);
        System.out.println("list 1 after removing 3rd index");
        System.out.println(l1);
        //->replaceAll()=it replaces the list by applying some operations
        System.out.println("list after replaceAll method");
        l1.replaceAll(e->e*3);
        //->set(int index, value)= it sets the value to that index
        // i m not giving example of this function bcoz it genuine
        //->sort(comparator)= it sorts the list according to the given comparator
        //comparator = naturalOrder(),reverseOrder()
        // we can also use another way to sort the list by using Collecton.sort(list) for natural(ascending) order
        // for reverse order Collection.sort(list,Collection.reverseOrder())
        System.out.println("list before sorting :"+l1);
        l1.sort(Comparator.naturalOrder());
        System.out.println("List after sorting "+l1);
        //->subList(from index, to index)=it returns a view of portion of this list b/w the specified indexes
        System.out.println("result of subList function");
        System.out.println(l1.subList(2,5));
        //->toArray()= returns the array of the given list
        System.out.println(l3.toArray());
        //-> retainAll(Collection c)= it  gives the common elements  b/w two lists
        System.out.println("result of retainAll function(it gives common elements of the two lists) ");
        System.out.println(l1.retainAll(l3));
        //->clone()= returns a copy of arrayList instance
    }
}
