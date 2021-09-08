package javaFramework;
class GenericArray<T>{
    T a[];
    GenericArray(T[] x){
        a=x;
    }
    T getData(int i){
        return a[i];
    }
//    void printData(T b){
//        for(int i=0;i<b.length;i++){
//            System.out.println(b.getData(i)+" ");
//        }
//        System.out.println();
//    }
}

public class GenericArrayClass {
    public static void main(String[] args) {

    }
}
