package dteaching;

import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int al[] = new int[256];
        int bl[] = new int[256];
        boolean isAnagram =true;
        for (char c :a.toCharArray()){
            int index = (int) c;
            al[index]++;
        }
        for(char c: b.toCharArray()){
            int index = (int) c;
            bl[index]++;
        }
        for(int i=0;i<256;i++) {
            if (al[i] != bl[i]) {
                isAnagram = false;
                break;
            }
        }
            if(isAnagram){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }

    }
}
