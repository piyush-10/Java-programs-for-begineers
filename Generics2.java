package javaFramework;

public class Generics2 {
    static <T>  void genericPrint(T t){
        System.out.println(t.getClass().getName()+ ":"+t);
    }
    public static void main(String[] args) {
        genericPrint(45);
        genericPrint("hello");
        genericPrint(6.789);
    }
}
