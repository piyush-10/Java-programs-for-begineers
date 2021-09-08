package javaFramework;

public class generics {
    <T> void GenericPrint(T t){// remember the here T needs to be object type
        System.out.println(t);
    }
    public static void main(String[] args) {
        generics obj = new generics();
        obj.GenericPrint(101);
        obj.GenericPrint("hello world");
        obj.GenericPrint(3.456);
    }
}
