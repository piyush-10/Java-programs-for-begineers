package dteaching;

public class array {
    public static void main(String[] args) {
        int[] marks = {123, 34, 45, 67};
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }
        System.out.println();
        System.out.println("******#######******");
        int[] dp = new int[4];
        dp[0] = 34;
        dp[1] = 67;
        dp[2] = 45;
        dp[3] = 23;
        for (int p:dp){
            System.out.println(p);
        }
        int [][] py ={{1,3,5,6},{2,4,7,9}};

            System.out.println(py[0][3]);
        for (int[] ints : py) {
            for (int j = 0; j < ints.length; j++) {
                System.out.println(ints[j]);
            }
        }
    }
}