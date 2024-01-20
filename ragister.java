import com.sun.javafx.logging.JFRInputEvent;
import com.sun.xml.internal.ws.message.StringHeader;
import jdk.nashorn.internal.codegen.Compiler;
import sun.misc.JavaLangAccess;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ragister {
    public static void main(String[] args)
    {
        JFrame frame=new JFrame("ragistration form");
        frame.setSize(500,350);
        frame.setLayout(null);
        JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl7;
        JTextArea t1,t2;
        JTextField te1,te2;
        JCheckBox ch1;
        JComboBox day,month,year;
        JRadioButton male,female;
        JCheckBox terms;
        JButton submit;
        Container c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        Font font = new Font("Serif", Font.BOLD+Font.ITALIC, 20);

        frame.setBackground(Color.ORANGE);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        lbl1=new JLabel("name");
        lbl1.setBounds(10,20,100,20);
        lbl1.setFont(font);
        frame.add(lbl1);

        te1=new JTextField();
        te1.setBounds(100,20,150,20);
        frame.add(te1);

        lbl2=new JLabel("mobile");
        lbl2.setBounds(10,50,100,20);
        lbl2.setFont(font);
        frame.add(lbl2);

        te2=new JTextField();
        te2.setBounds(100,50,150,20);
        frame.add(te2);

        lbl3=new JLabel("dob");
        lbl3.setBounds(10,80,100,20);
        lbl3.setFont(font);
        frame.add(lbl3);
        String a[]={"1","2","3"};
        String b[]={"1","2","3"};
        day=new JComboBox(a);
        day.setBounds(100,80,50,20);
        frame.add(day);
        month=new JComboBox(a);
        month.setBounds(160,80,50,20);
        frame.add(month);
        year=new JComboBox(a);
        year.setBounds(220,80,50,20);
        frame.add(year);

        lbl4=new JLabel("address");
        lbl4.setBounds(10,110,100,20);
        lbl4.setFont(font);
        frame.add(lbl4);

        t1=new JTextArea();
        t1.setBounds(100,110,150,50);
        frame.add(t1);

        lbl5=new JLabel("gender");
        lbl5.setBounds(10,170,130,30);
        lbl5.setFont(font);
        frame.add(lbl5);
        male=new JRadioButton("male");
        male.setBounds(100,180,70,20);
        male.setSelected(true);
        frame.add(male);
        female=new JRadioButton("femal");
        female.setBounds(190,180,70,20);
        frame.add(female);
        ButtonGroup gender=new ButtonGroup();
        gender.add(male);
        gender.add(female);
        terms=new JCheckBox("approve terms and condition");
        terms.setBounds(9,210,200,20);
        frame.add(terms);
        submit=new JButton("registration");
        submit.setBounds(50,260,200,20);
        frame.add(submit);
        JLabel lbl6=new JLabel("");
        lbl6.setBounds(10,290,300,20);
        frame.add(lbl6);
        frame.setResizable(false);

        lbl6.setFont(font);

        t2=new JTextArea();
        t2.setBounds(280,20,200,200);
        frame.add(t2);

        submit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(terms.isSelected())
                {
                   String name=te1.getText();
                   String address=t1.getText();
                   String mobile=te2.getText();
                   String dob=day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem();
                    String gender="male";
                    if(male.isSelected())
                    {
                        gender="male";
                    }else
                    {
                        gender="female";
                    }
                    t2.setText("name:"+name+"\n"+"mobile:"+mobile+"\n"+"dob:"+dob+"\n"+"address:"+address+"\n"+"gender:"+gender+"\n");
                        lbl6.setText("registration successfully");
                }
                else {
                    lbl6.setText("please select terms and condition");
                    t2.setText("");

                }

            }
        });

        frame.setVisible(true);
    }
}
