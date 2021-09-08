package javaFramework;
class Student2<T extends Number>{
    String name;
    T [] marks;
    Student2 (T[] m){
        this.marks =m;
    }
    double total(){
        double sum = 0.0;
        for (int i =0;i<marks.length;i++){
            sum+=marks[i].doubleValue();
        }
        return sum;
    }
//    boolean compareTotalMarks(Student2<T> other){
//        // for same type of data this compare method works but when we give differnt type of data like int /double
//        //it doesn't work so for proper working we have to use use wildcard of java'?'
//        if(total() == other.total()){
//            return true;
//        }
//        return false;
//    }
    //proper syntex using wildcard

    boolean compareTotalMarks(Student2<?> other){

        if(total()== other.total()){
            return true;
        }
        return false;
    }

}

public class BoundedGeneric2 {
    public static void main(String[] args) {
        Integer intMarks [] = {44,13,12,45,14,9};
        Student2<Integer> obj = new Student2<>(intMarks);
        System.out.println("Total marks:- " + obj.total());
        Integer intMarks2 []= {23,46,78,67,15};
        Student2<Integer> obj2 = new Student2<>(intMarks2);
        System.out.println("Total Marks:- " + obj2.total());
        if (obj.compareTotalMarks(obj2)){
            System.out.println("Same marks");
        }
        else{
            System.out.println("Different Marks");
        }
        Double[] doubleMarks = {34.12,23.1,14.45,8.16};
        Student2<Double> o1 = new Student2<>(doubleMarks);
        System.out.println("TotalMarks:- " + o1.total());

    }
}
