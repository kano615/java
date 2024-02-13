import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class simplecals {

    public static void main(String[] args) {
        JFrame frame=new JFrame("simple calculator");
        frame.setSize(300,200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lbl1,lbl2,answer;
        JTextField t1,t2;
        JButton add,sub,mul,div;
        lbl1=new JLabel("first number");
        lbl1.setBounds(10,20,100,20);
        frame.add(lbl1);
        t1=new JTextField();
        t1.setBounds(110,20,150,20);
        frame.add(t1);
        lbl2=new JLabel("second number");
        lbl2.setBounds(10,50,100,20);
        frame.add(lbl2);
        t2=new JTextField();
        t2.setBounds(110,50,150,20);
        frame.add(t2);

        add=new JButton("+");
        add.setBounds(10,90,50,20);
        add.setForeground(Color.white);
        add.setBackground(Color.red);
        frame.add(add);
        sub=new JButton("-");
        sub.setBounds(70,90,50,20);
        sub.setForeground(Color.white);
        sub.setBackground(Color.red);
        frame.add(sub);
        mul=new JButton("*");
        mul.setBounds(130,90,50,20);
        mul.setForeground(Color.white);
        mul.setBackground(Color.red);
        frame.add(mul);
        div=new JButton("/");
        div.setBounds(190,90,50,20);
        div.setForeground(Color.white);
        div.setBackground(Color.red);
        frame.add(div);
        answer=new JLabel("answer:");
        answer.setBounds(10,120,300,20);
        frame.add(answer);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    int a, b, c;
                    a = Integer.parseInt(t1.getText());
                    b = Integer.parseInt(t2.getText());
                    c = a + b;
                    String s = String.valueOf(c);
                    answer.setText("answer:" + s);
                } catch (NumberFormatException e2 ) {
                    answer.setText("input only integer");
                }
                catch (ArithmeticException e3) {
                    answer.setText("number not devide by 0)");
                }
            }
        });
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    int a, b, c;
                    a = Integer.parseInt(t1.getText());
                    b = Integer.parseInt(t2.getText());
                    c = a - b;
                    String s = String.valueOf(c);
                    answer.setText("answer:" + s);
                } catch (NumberFormatException e2 ) {
                    answer.setText("input only integer");
                }
                catch (ArithmeticException e3) {
                    answer.setText("number not devide by 0)");
                }
            }
        });
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    int a, b, c;
                    a = Integer.parseInt(t1.getText());
                    b = Integer.parseInt(t2.getText());
                    c = a * b;
                    String s = String.valueOf(c);
                    answer.setText("answer:" + s);
                } catch (NumberFormatException e2 ) {
                    answer.setText("input only integer");
                }
                catch (ArithmeticException e3) {
                    answer.setText("number not devide by 0)");
                }
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    int a, b, c;
                    a = Integer.parseInt(t1.getText());
                    b = Integer.parseInt(t2.getText());
                    c = a / b;
                    String s = String.valueOf(c);
                    answer.setText("answer:" + s);
                } catch (NumberFormatException e2 ) {
                    answer.setText("input only integer");
                }
                catch (ArithmeticException e3) {
                    answer.setText("number not devide by 0)");
                }
            }
        });




        frame.setVisible(true);
    }

}
