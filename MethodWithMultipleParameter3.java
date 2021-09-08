package javaFramework;
//    *******************VARGS METHOD USING OBJECT*******************
public class MethodWithMultipleParameter3 {
    public static void vargsMethod(Object ... obj){
        for(Object o:obj){
            System.out.print("  "+o);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        vargsMethod(1,"hello",4.67);
        vargsMethod(1,2,3,4,5,6,7);
    }
}