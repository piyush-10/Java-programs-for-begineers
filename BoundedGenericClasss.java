package javaFramework;

public class BoundedGenericClasss<T extends Number> {
    T[] array;
    BoundedGenericClasss(T [] t){
        array = t;
    }
    double average(){
        double sum =0.0;
        for (int i=0;i<array.length;i++){
            sum += array[i].doubleValue();
        }
        return sum/array.length;
    }

    public static void main(String[] args) {
        Integer arr[] = {1,3,5,7,9,8};
        BoundedGenericClasss<Integer> obj1 = new BoundedGenericClasss<>(arr);
        System.out.println(obj1.average());
        Double arr1[] = {90.1,56.4,4.45,5.3,23.12};
        BoundedGenericClasss<Double> obj2 = new BoundedGenericClasss<>(arr1);
        System.out.println(obj2.average());
    }
}
