package dteaching;
import java.util.Scanner;
public class multiplicationTableOfAnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int n = sc.nextInt();
        int table= 1;
        for (int i =1;i<=10;i++){
            table =i*n;
            System.out.println(n+" * "+i+" = "+table);
        }
    }
}
