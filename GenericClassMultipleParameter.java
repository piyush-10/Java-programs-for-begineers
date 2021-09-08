package javaFramework;

public class GenericClassMultipleParameter<T,V> {
    T obj1;
    V obj2;
    GenericClassMultipleParameter(T obj1,V obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }
    void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
    public static void main(String[] args) {
        GenericClassMultipleParameter<String,Integer> object= new GenericClassMultipleParameter<String,Integer>("Piyush",89);
        object.print();
        System.out.println("*********************");
        GenericClassMultipleParameter<Double,Integer> object2= new GenericClassMultipleParameter<Double,Integer>(56.12,89);
        object2.print();
    }
}
