package dteaching;

import java.util.Scanner;

public class Palindromre {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the value:");
        int n = sc.nextInt();
        int temp = n;
        int digit;
        int rev = 0;
        while(n>0){
            digit = n%10;
            rev = rev*10 +digit;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
