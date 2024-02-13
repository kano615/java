import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jcombobox {
        public static void main(String[] args) {
            JFrame frame=new JFrame("radio btn");
            frame.setSize(200,200);
            frame.setLayout(null);
            JLabel lbl=new JLabel("Answer is:");
            lbl.setBounds(10,90,100,20);

            String [] arr={"a","b","c"};
            JComboBox mycombobox=new JComboBox(arr);
            mycombobox.setBounds(10,10,100,20);
            JButton btn=new JButton("click me");
            btn.setBounds(10,50,100,30);
            btn.setBackground(Color.RED);
            btn.setForeground(Color.white);
            frame.add(lbl);
            frame.add(mycombobox);
            frame.add(btn);
            mycombobox.addItem("d");
            mycombobox.addItem("e");
            mycombobox.removeItem("d");
            mycombobox.removeItem("e");

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int item=0;

                    lbl.setText(mycombobox.getSelectedItem().toString());

                }
            });
            frame.setVisible(true);
        }
}
