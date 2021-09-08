package dteaching;
class Cylinder{
    int radius;
    int height;
    Cylinder(int radius,int height){
        this.radius = radius;
        this.height = height;
    }
    int getRadius(){
        return radius;
    }
    int getHeight(){
        return height;
    }

//    int radius;
//    int height;
//    public int getHeight() {
//        return height;
//    }
//    public void setHeight(int height) {
//        this.height = height;
//    }
//    public int getRadius() {
//        return radius;
//    }
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
}
public class GetterSetter {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(34,55);
        System.out.println(c1.getHeight());
        System.out.println(c1.getRadius());
    }
}
