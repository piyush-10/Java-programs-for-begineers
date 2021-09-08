package piyush;
interface bycycle{
     int a=45;
    void applybreak(int decrement);
    void speedup(int increment);
}
class avon implements bycycle{
    public void applybreak(int decrement){
        System.out.println("applying break by .."+decrement);
    }
    public void speedup(int increment){
        System.out.println("speeding up by"+increment);
    }
}

public class interfaces {
    public static void main(String[] args) {
avon av = new avon();
av.applybreak(4);
av.speedup(6);
        System.out.println(av.a);
//        av.a=34; we cannot modify the properties because they are final.
    }
}
