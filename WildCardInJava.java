package javaFramework;
import javaFramework.Student2;
public class WildCardInJava {
    public static void main(String[] args) {
        Double[] doubleMarks = {34.12,23.1,14.45,8.16};
        Student2<Double> o1 = new Student2<>(doubleMarks);
        System.out.println("TotalMarks:- " + o1.total());
        Integer intMarks [] = {44,13,12,45,14,9};
        Student2<Integer> o2 = new Student2<>(intMarks);
        System.out.println("TotalMarks:- " + o2.total());

        if (o1.compareTotalMarks(o2)){
            System.out.println("Same Marks");
        }
        else{
            System.out.println("Different Marks");
        }
    }
}
