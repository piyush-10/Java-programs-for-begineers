package javaFramework;

//***********vargs using array*************
public class MethodWithMultipleParameter {
    static<T> void MethodWithMultipleParameter(T v[]){
        System.out.println("number of args: " + v.length + " Elements");
        for (T x:v) {
            System.out.print(x +"  ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
       Integer[] x ={1,3,5,7,9};
       String y[]= {"hello","master","cat","animal"};
       Double z[]= {89.45,12.56,13.14,1200.2};
        MethodWithMultipleParameter(x);
        MethodWithMultipleParameter(y);
        MethodWithMultipleParameter(z);
    }
}
