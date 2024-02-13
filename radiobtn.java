import javax.swing.*;

public class radiobtn {
    public static void main(String[] args) {
        JFrame frame=new JFrame("radio btn");
        frame.setSize(500,500);
        frame.setLayout(null);

        JRadioButton btn1=new JRadioButton("male");
        btn1.setBounds(100,100,100,30);

        JRadioButton btn2=new JRadioButton("female");
        btn2.setBounds(100,200,100,30);

        frame.add(btn1);
        frame.add(btn2);
        ButtonGroup gender=new ButtonGroup();
        gender.add(btn1);
        gender.add(btn2);

        JRadioButton obc=new JRadioButton("obc");
        obc.setBounds(200,200,100,20);
        JRadioButton sc=new JRadioButton("sc");
        sc.setBounds(300,200,100,20);
        JRadioButton st=new JRadioButton("st");
        st.setBounds(400,200,100,20);

        frame.add(obc);
        frame.add(sc);
        frame.add(st);

        ButtonGroup cast=new ButtonGroup();
        cast.add(obc);
        cast.add(sc);
        cast.add(st);




        frame.setVisible(true);
    }
}
