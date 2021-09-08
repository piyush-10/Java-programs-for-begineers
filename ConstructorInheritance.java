package dteaching;
class parent {
    parent() {
        System.out.println("I am constructor of parent class");
    }

    parent(int a) {
        System.out.println(a);
    }
}
class child1 extends parent {
    child1(){
        System.out.println("I am constructor of child1 class");
    }
    child1(int a,int b){
        super(a);
        System.out.println(a+b);
    }
}
class child2 extends child1{
    child2(){
        System.out.println("I am constructor of child2 class");
    }
    child2(int a,int b,int c){
        super(a,b);
        System.out.println(a+b+c);
        }
    }

public class ConstructorInheritance {
    public static void main(String[] args) {
 child2 c1 = new child2(8,9,7);
    }
}
