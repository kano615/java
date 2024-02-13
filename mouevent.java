import javax.swing.*;
import java.awt.*;
import java.awt.event.*;import java.awt.event.KeyListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.sql.SQLOutput;


public class mouevent implements MouseListener,KeyListener
{
        JFrame f;
        JTextArea ta;
        JLabel lbl;
    KeyListener kl;

        mouevent()
        {
            f=new JFrame();
            f.setLayout(null);
            f.setSize(500,500);

            lbl=new JLabel("usernamre");
            lbl.setBounds(10,20,100,20);
            lbl.addMouseListener(this);
            f.add(lbl);
            ta=new JTextArea();
            ta.setBounds(130,20,300,500);
            f.add(ta);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setResizable(false);
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        }
    @Override
    public void mouseClicked(MouseEvent e) {
            ta.setText(ta.getText()+"\n"+"mouseClicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"mousepressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"mousereleased");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"mouseentered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"mouseexit");
    }

    public static void main(String[] args)
    {
        mouevent m1=new mouevent();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ESCAPE)
        {
            System.out.println("keypressed");
            System.exit(3);
        }else {
            System.out.println("noy");
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
