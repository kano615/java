import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Focuslistener implements FocusListener, KeyListener {
    JFrame f;
    JTextField ta;
    JTextArea te;

    Focuslistener()
    {
        f=new JFrame();
        f.setLayout(null);
        f.setSize(500,500);
        ta=new JTextField();
        ta.setBounds(10,20,200,20);
        f.add(ta);
        te=new JTextArea();
        te.setBounds(40,30,300,200);
        te.addFocusListener(this);
        f.add(te);
        f.addKeyListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public void focusGained(FocusEvent e)
    {
        System.out.println("focus");
    }

    @Override
    public void focusLost(FocusEvent e) {


    }
    public static void main(String[] args)
    {
        Focuslistener m1=new Focuslistener();

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        if (e.getKeyCode()==27)
        {
            System.exit(0);
        }else
        {
            System.out.println("fail");

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
