import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swingjava{

    public static void main(String[] args) {
        JLabel label2,label1;
        JFrame frame;
        JTextField textField1,textField2;
        JButton btn;
        JCheckBox checkBox1,checkBox2,checkBox3;

        frame=new JFrame("demo frame");

        frame.setSize(400,400);
        frame.setLayout(null);

        label1=new JLabel("food billing");
        label1.setBounds(20,20,100,20);
        frame.add(label1);

       checkBox1=new JCheckBox("pizza 100");
       checkBox1.setBounds(20,60,100,20);
       frame.add(checkBox1);

        checkBox2=new JCheckBox("burger 100");
        checkBox2.setBounds(20,140,100,20);
        frame.add(checkBox2);

        checkBox3=new JCheckBox("tea 50");
        checkBox3.setBounds(20,180,100,20);
        frame.add(checkBox3);

        btn=new JButton("click me");
        btn.setBounds(20,120,100,20);
        btn.setBackground(Color.RED);
        btn.setForeground(Color.white);
        frame.add(btn);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float total=0;
                String msg="";
                if(checkBox1.isSelected())
                {
                    total+=100;
                    msg+="pizza 100\n";
                }
                if(checkBox2.isSelected())
                {
                    total+=100;
                    msg+="burger 100\n";
                }
                if(checkBox3.isSelected())
                {
                    total+=100;
                    msg+="tea 50\n";
                }
                msg+="----------------";
                JOptionPane.showMessageDialog(frame,msg+"total"+total);
            }
        });
        frame.setVisible(true);

    }
}
