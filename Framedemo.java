import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.awt.Cursor.HAND_CURSOR;

public class Framedemo implements KeyListener {
    JFrame frame;

    JLabel lbl1;
    JTextField ta;
    int lenghth=0;

    Framedemo()
    {
        frame =new JFrame("demo Frame");
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Cursor cursor=new Cursor(HAND_CURSOR);
         ta=new JTextField();
        ta.setBounds(20,20,150,20);
        ta.addKeyListener(this);
        frame.add(ta);

        frame.setVisible(true);

    }
    public static void main(String[] args)
    {
        Framedemo d1=new Framedemo();
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
        char c=e.getKeyChar();
        if (!Character.isDigit(c))
        {
            e.consume();
        }

        String l=ta.getText();
        int lgn=l.length();
        if(lgn<10)
        {

        }
        else {
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
