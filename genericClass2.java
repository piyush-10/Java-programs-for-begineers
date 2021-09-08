package javaFramework;
class Student{

}

class Generic<T>{
    T obj;
    Generic(T obj){
        this.obj = obj;
    }
    T getObj(){
        return this.obj;
    }
}
public class genericClass2 {
    public static void main(String[] args) {
        Generic<Integer> n3=new Generic<Integer>(56);
        System.out.println(n3.getObj());
        Generic<String> n5 =new Generic<String>("Piyush");
        System.out.println(n5.getObj());
        Student Piyush = new Student();
        Generic<Student> obj2 = new Generic<Student>(Piyush);
        System.out.println(obj2.getObj().getClass());
    }
}
