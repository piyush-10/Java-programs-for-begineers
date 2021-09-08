package piyush;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class tutorialvideoawt {
    public tutorialvideoawt(){
        Frame frame = new Frame("hello");
        TextField textField = new TextField();
        textField.setBounds(20,120,150,30);
        Label label= new Label("hello");
        label.setBounds(20,40,80,30);
        Button button = new Button("click me");
        button.setBounds(20,60,60,60);
        frame.add(textField);
        frame.add(label);
        frame.add(button);

        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void Windowclosing(WindowEvent e){
                frame.dispose();
            }});

    }
   public static void main(String[] args) {
tutorialvideoawt t1 = new tutorialvideoawt();


   }
}