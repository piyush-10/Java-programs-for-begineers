package dteaching;
class parent1{
   void greet(){
       System.out.println("good morning");
   }
}
class child extends parent1{
    void greet(){
        System.out.println("good afternoon");
    }
}

public class ConstructorOveriding {
    public static void main(String[] args){
        child c1 = new child();
        c1.greet();
        parent1 p1 = new parent1();
        p1.greet();

    }
}
