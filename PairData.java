package javaFramework;

public class PairData <T,V> {
    private T x;
    private V y;
    public PairData(T a,V b){
        this.x=a;
        this.y=b;
    }

    public T getX() {
        return x;
    }
    public V getY() {
        return y;
    }
    public void printdata(){
        System.out.println(getX()+" "+getY());
    }

    public static void main(String[] args) {
        PairData <String,String> a = new PairData<String,String>("Piyush","Upadhyay");
        a.printdata();
        System.out.println("*******");
        PairData <String,Double> b = new PairData<String,Double>("Adarsh",45.02);
        b.printdata();
        System.out.println("*******");
        PairData<Integer,Float> c = new PairData<>(456788999,12.23f);
        c.printdata();
        PairData<Long, Float> d = new PairData<>((long)669906966,67.89f);
    }
}
