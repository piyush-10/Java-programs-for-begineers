package javaFramework;

public class ParameterizedGeneric {
    public static<T> void swap(T x,T y){
        T t;
        t=x;
        x=y;
        y=t;
        System.out.printf("value of x: %f value of y: %f",x,y);
    }
    public static void main(String[] args) {
        Double a = new Double(78.45);
        Double b = new Double(67.23);
        System.out.println(a +"  "+b);
        swap(a,b);

    }
    // decelaration of vargs method in generic
    //for array= gMethod(T[] t);
    // for ellipsis (three dot)=gMethod(T...t);
    //for object class = gMethod(object[] o);
}
