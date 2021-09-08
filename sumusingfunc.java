package dteaching;



public class sumusingfunc {
    float sum(int []arr){
        int i;
        float total = 0;
        float average=1f;
        for(i=0;i<arr.length;i++){
            total = total+arr[i];
        }
         average = ((total/arr.length));
        return average;
    }
    public static void main(String[] args) {
        sumusingfunc fn =new sumusingfunc();
        int [] arr= {2,5,6,8,8};
        System.out.println( fn.sum(arr));
    }


}
