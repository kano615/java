import javax.swing.*;
import java.awt.event.*;
public class MenuExample implements ActionListener{
    JMenuBar mb;
    JFrame f;
    JMenu file,edit,help;
    JMenuItem cut,copy,paste,selectAll;
    JMenuItem nw,open;
    JTextArea ta;
    MenuExample(){
        f=new JFrame();
        cut=new JMenuItem("cut");
        copy=new JMenuItem("copy");
        paste=new JMenuItem("paste");
        nw=new JMenuItem("nw");
        open=new JMenuItem("open");
        selectAll=new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        nw.addActionListener(this);
        open.addActionListener(this);
        mb=new JMenuBar();
        file=new JMenu("File");
        edit=new JMenu("Edit");
        help=new JMenu("Help");
        edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);
        mb.add(file);mb.add(edit);mb.add(help);
        file.add(nw);
        file.add(open);
        ta=new JTextArea();
        ta.setBounds(5,5,360,320);
        f.add(mb);f.add(ta);
        f.setJMenuBar(mb);
        f.setLayout(null);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cut)
            ta.cut();
        if(e.getSource()==paste)
            ta.paste();
        if(e.getSource()==copy)
            ta.copy();
        if(e.getSource()==selectAll)
            ta.selectAll();
        if(e.getSource()==nw)
            ta.setText("file is new");
        if(e.getSource()==open)
            ta.setText("file is open mode");
    }
    public static void main(String[] args) {
        new MenuExample();
    }
}    