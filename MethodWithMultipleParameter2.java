package javaFramework;
//********************VARGS METHOD USING ELLIPSIS********************
public class MethodWithMultipleParameter2 {
     static <T>void vargsMethod(T ... v){
         System.out.println("Number of argument:"+ v.length);
         for(T i: v){
             System.out.print(i+"   ");
         }
         System.out.println();
     }
    public static void main(String[] args) {
        vargsMethod(5,6,2,3,9);
        vargsMethod(2.0,"hello",23,23,53.12,56,72.0);

    }
}
