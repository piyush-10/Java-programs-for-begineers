package dteaching;

public class nom {
    public static void main(String[] args) {
       int [] hr ={4,7,8,4,3,4,6};
        for (int a:hr) {
            System.out.print(a + "  ");
        }
        System.out.println();
            for(int i=1;i<=100;i++){
                if(i>10){
                    break;
                }
                    System.out.print(i+ "  ");

            }
            System.out.println();
            for(int i=1;i<=100;i++){
                if( i>=5 && i<=10) {
                    continue;
                }
                System.out.print(i + "  ");
            }
    }
}
