import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class awtexample extends Frame {
    public awtexample()
    {
        Label l1=new Label("user name");
        l1.setBounds(50,40,200,30);
        add(l1);
        TextField t1=new TextField();
        t1.setBounds(50,70,200,20);
        add(t1);
        Label l2=new Label("password");
        l2.setBounds(50,90,200,30);
        add(l2);
        TextField t2=new TextField();
        t2.setBounds(50,120,200,20);
        add(t2);
        Button b = new Button("Click Here");
        // set the position for the button in frame
        b.setBounds(91,150,80,30);
        // add button to the frame
        b.setBackground(Color.RED);
        b.setForeground(Color.white);
        add(b);
        TextArea area = new TextArea("Welcome to javatpoint");
// setting location of text area in frame
        area.setBounds(50, 300, 300, 100);
        area.setBackground(Color.CYAN);
// adding text area to frame
        add(area);
        Button b1 = new Button("Click Here");
        // set the position for the button in frame
        b1.setBounds(200,150,80,30);
        // add button to the frame
        b1.setBackground(Color.RED);
        b1.setForeground(Color.white);
        add(b1);
        Label l3=new Label("password");
        l3.setBounds(50,200,200,30);
        add(l3);

        setVisible(true);
        setLayout(null);
        setSize(500,500);

        addWindowListener (new WindowAdapter() {
            public void windowClosing (WindowEvent e) {
                dispose();
            }
        });

    }
    public static void main(String[] args) {
        awtexample awt=new awtexample();

       }
}
