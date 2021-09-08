package piyush;

abstract class parent{
    public parent(){
        System.out.println("base class consturctor");
    }
    public void sayhello(){
        System.out.println("hello");
    }
    abstract public void greet();
}
class child extends parent{
    @Override
    public void greet(){
        System.out.println("good evening ");
    }
}
class child2 extends child{
    void th(){
        System.out.println("i am good");
    }
}
public class abstract_class {
    public static void main(String[] args) {
        child2 p = new child2();
        p.greet();
        p.th();
        p.sayhello();
    }
}
