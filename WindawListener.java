import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindawListener implements WindowListener {
    JFrame f;
    JLabel lbl;
    JTextField txt;
    JTextArea ta;
    JScrollBar scrollBar;
    WindawListener()
    {
        f=new JFrame();
        f.setLayout(null);
        f.setSize(500,500);
        txt=new JTextField();
        txt.setBounds(10,20,100,20);

        f.add(txt);
        ta=new JTextArea();
        ta.setBounds(130,20,200,100);
        f.add(ta);


        f.add(ta);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        WindawListener m1=new WindawListener();

    }


    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
