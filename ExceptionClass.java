package piyush;

import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "I am toString()";
    }
    public String getMessage() {
        return "I am getMessage()";
    }
}
class MaxAgeException extends Exception{
    public String toString(){
        return "Age cannot be greater than 120";
    }
    public String getMessage(){
        return "Make sure that the value of age entered is correct";
    }
}
public class ExceptionClass {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        if (a > 9) {
            try{
                //throw new MyException();
                //throw new MaxAgeException();
                throw new ArithmeticException("THIS IS AN EXCEPTION ");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("FINISHED");
            }
            System.out.println("YES FINISHED");
        }
    }
}
