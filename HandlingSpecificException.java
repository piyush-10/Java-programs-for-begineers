package piyush;

//try{
//    //code
//        }
//catch(To Exception e){
//    //handle one type of exception-->like IO exception
//        }
//catch(Exception e){
//    //handle 2nd type of exception -->like Arithmetic exception
//        }
//catch(Exception e){
//    //handle 3rd type of Exception
//        }

import java.util.Scanner;

public class HandlingSpecificException {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 34;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index ");
        int ind =sc.nextInt();
        System.out.println("enter the number you want to divide with");
        int number = sc.nextInt();
        try{
            System.out.println("the value at array index entered is "+marks[ind]);
            System.out.println("The value of array-value/number is :" + marks[ind]/number);
        }
        catch(ArithmeticException e){
            System.out.println("AeithmeticException occured!");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("some other Exception occured ");
            System.out.println(e);
        }

    }
}
