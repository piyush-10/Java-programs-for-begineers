package piyush;

public class TryCatch {
    public static void main(String[] args) {
        int a = 6000;
        int b=0;
//        without try:
//        int c = a/b;
//        System.out.println("the result is "+c);
        //With try:
        try{
            int c= a/b;
            System.out.println("The result is "+c);
        }
        catch(Exception e){
            System.out.println("We failed to divide ,Reason: ");
            System.out.println(e);
        }
        System.out.println("End of program");
    }

}
