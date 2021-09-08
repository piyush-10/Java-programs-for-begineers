package piyush;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 37;
        marks[2] = 45;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("Enter the value of index");
            int ind =sc.nextInt();
            try{
                System.out.println();
                try{
                    System.out.println(marks[ind]);
                    flag = false;
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("sorry this index does not exist");
                    System.out.println("Exception in level 2");
                }
            }
            catch(Exception e){
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Ending of the Program");
    }
}
