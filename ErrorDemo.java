package piyush;

import java.util.Scanner;

public class ErrorDemo {
    public static void main(String[] args) {
        //SYNTAX ERROR
        //int a=0  -->no semicolon
        //b=8;   -->b not declared
        //LOGICAL ERROR
        //write a program to print all prime numbers b/w 1 to 10
        System.out.println(2);
        for (int i=1;i<5;i++){
            System.out.println(2*i+1);
        }
        //RUNTIME ERROR
        int k;
        Scanner sc =  new Scanner(System.in);
        k=sc.nextInt();
        System.out.println("integer part of 1000 divided by k is "+1000/k);
    }
}
