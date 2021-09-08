package piyush;
class cellphone2{
    void callnum(int number){
        System.out.println("calling..."+number);
    }
    void pickcall(){
        System.out.println("connecting....");
    }
}
interface camera2{
    void takesnap();
    void recordvideo();
    default void record4kvideo(){
        System.out.println("recording in 4k......");
    }

}
interface wifi2 {
    String[] getnetwork();

    void connecttonetwork(String network);
}
class mysmartphone2 extends cellphone2 implements camera2,wifi2{
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
        System.out.println("Geting list of network:");
        String[] networklist = {"harry","marry","ankit"};
        return networklist;
    }

    @Override
    public void connecttonetwork(String network) {
        System.out.println("connecting to network..."+network);
    }
}
public class polymorphism {
    public static void main(String[] args) {
        //here this smartphone work as camera
camera2 cam = new mysmartphone2();
cam.record4kvideo();
cam.recordvideo();
cam.takesnap();
        // here this smartphone work as wifi
wifi2 wf =new mysmartphone2();
wf.connecttonetwork("harry");
        String[] as= wf.getnetwork();
        for (String item:as) {
            System.out.println(item);}
    }
}