package dteaching;
class Animal{
    void walk(){
        System.out.println("it can walk");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}

public class inheritance {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.bark();
        d1.walk();
    }
}
