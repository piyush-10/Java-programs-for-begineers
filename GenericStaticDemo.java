package javaFramework;

public class GenericStaticDemo {
    static<T> void gPrint(T t){
        System.out.println(t);
    }
    public static void main(String[] args) {
        gPrint("String");
        gPrint(56.12);
        gPrint(45);
    }
}
