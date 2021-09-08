package javaFramework;
class GENERIC<T>{
    T obj;
    void print(T obj){
        System.out.println(obj);
    }
}
public class GenericStaticDemo2 {
    public static void main(String[] args) {
        GENERIC <Integer> a = new GENERIC<Integer>();
        GENERIC <Double> b = new GENERIC<Double>();
        GENERIC<String> c = new GENERIC<String>();
a.print(90);
b.print(23.12);
c.print("Piyush Upadhyay");

    }
}
