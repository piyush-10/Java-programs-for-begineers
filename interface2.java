package piyush;
class cellphone{
    void callnum(int number){
        System.out.println("calling..."+number);
    }
    void pickcall(){
        System.out.println("connecting....");
    }
}
interface camera{
    void takesnap();
    void recordvideo();
    default void record4kvideo(){
        System.out.println("recording in 4k......");
    }

}
interface wifi {
    String[] getnetwork();
    void connecttonetwork(String network);
}
class mysmartphone extends cellphone implements camera, wifi{
    @Override
    public void takesnap() {
        System.out.println("taking snap...");
    }

    @Override
    public void recordvideo() {
        System.out.println("recording video...");
    }

    @Override
    public String[] getnetwork() {
        System.out.println("Getting list of network:");
        String[] networklist = {"harry","marry","ankit",};
        return networklist;
    }

    @Override
    public void connecttonetwork(String network) {
        System.out.println("connecting to network..."+network);
    }
}
public class interface2 {
    public static void main(String[] args) {
    mysmartphone sm = new mysmartphone();
    String[] ar = sm.getnetwork();
        for (String item:ar) {
            System.out.println(item);
        }
    sm.callnum(89796712);
        sm.takesnap();
     sm.record4kvideo();

    }
}
