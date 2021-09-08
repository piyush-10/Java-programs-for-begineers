package piyush;
 class phone{
     public phone(){
         System.out.println("i am a costructor of phone class");
     }
     void calling(){
         System.out.println("calling");
     }
public void main(){
    System.out.println("phone");
    }
}
class smartphone extends phone{
     public smartphone(){
         System.out.println("i am constructor of smartphone class");
     }
public void main(){
    System.out.println("smartphone");
    }
 void name(){
     System.out.println("my name is piyush");
 }
}

class dynamic_method_dispatch {
    public static void main(String[] args) {
        phone pn = new smartphone();
//smartphone ch = new smartphone();
pn.main();
pn.calling();

//ch.main();
    }
}
