package dteaching;
class Vehicle {
    int wheel;

    Vehicle(int wheel) {
        this.wheel = wheel;
    }

    Vehicle(){
        System.out.println("Hello");
    }
    Vehicle(int a,int b){
        System.out.println(a+b);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(4);
        System.out.println(car.wheel);
        Vehicle car2 = new Vehicle();
        Vehicle car3 = new Vehicle(2,6);
    }
}
