import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Mousemotionevent implements MouseMotionListener {
    JFrame f;
    JLabel lbl;
    JTextField txt;
    JTextArea ta;
    JScrollBar scrollBar;
    Mousemotionevent()
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
        JScrollPane scrollingArea = new JScrollPane(ta);
        ta.addMouseMotionListener(this);
        f.add(ta);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    @Override
    public void mouseDragged(MouseEvent e)
    {
        ta.setText(ta.getText()+"\n"+" mouseGragged");

    }

    @Override
    public void mouseMoved(MouseEvent e)
    {
        ta.setText(ta.getText()+"\n"+" mousemoved");
    }
    public static void main(String[] args)
    {
        Mousemotionevent m1=new Mousemotionevent();

    }


}
