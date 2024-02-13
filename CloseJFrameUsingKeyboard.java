import javax.swing.*;

import java.awt.event.KeyListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;

public class CloseJFrameUsingKeyboard implements KeyListener
{
    JFrame f;
    JTextArea ta;
    JLabel lbl;

    public CloseJFrameUsingKeyboard() {
        f=new JFrame();
        f.setLayout(null);
        f.setSize(500,500);

        lbl=new JLabel("usernamre");
        lbl.setBounds(10,20,100,20);
        f.add(lbl);
        /*ta=new JTextArea();
        ta.setBounds(130,20,300,500);
        f.add(ta);*/
        f.addKeyListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[]args)
    {
        CloseJFrameUsingKeyboard c1=new CloseJFrameUsingKeyboard();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ESCAPE)
        {
            System.exit(0);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}