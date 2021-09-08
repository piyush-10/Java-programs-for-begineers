package piyush;

class library{
    String[] books;
    int noofbooks;
    public library(){
        this.books = new String[50];
        this.noofbooks=0;
    }
    void addbooks(String book){
        this.books[noofbooks]= book;
        noofbooks++;
        System.out.println("* " + book +" Has Been Added");
    }
    void showbooks(){
        System.out.println("Available Books are:");
        for (String book:this.books) {
            if(book == null){
                continue;
            }
            System.out.println("->> "+ book);
        }
    }
    void issuebook(String book){
        for (int i =0; i<this.books.length;i++) {
            String b = this.books[i];
            if(b== book){
                System.out.println("Book Has Been Issued");
                this.books[i]= null;
                return;
            }
        }
        System.out.println("This Book Does Not Exist");
    }
    void returnbook(String book){
        addbooks(book);
        System.out.println("Book Returned");
    }
}
public class exer4 {
    public static void main(String[] args) {
library lb = new library();
lb.addbooks("Data structure");
lb.addbooks("Discrete structure");
lb.addbooks("Environment");
lb.addbooks("Digital Electronics");
lb.addbooks("Object Oriented Programing & methodology");
System.out.println();
lb.showbooks();
lb.issuebook("Data structure");
lb.showbooks();
lb.returnbook("Data structure");
lb.showbooks();
    }
}
