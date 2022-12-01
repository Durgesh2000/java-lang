import javax.swing.*;
import java.awt.event.*;

class Caluculator extends WindowAdapter {
    public JFrame mainframe;
    public JButton b1, b2, b3, b4;
    public JTextField t1, t2;
    public JLabel lobj;
    Integer no1, no2;

    public Caluculator(int width, int height, String title) {
        mainframe = new JFrame(title);
        mainframe.setSize(width, height);

        mainframe.addWindowListener(this);

        b1 = new JButton("Add");
        b2 = new JButton("Sub");
        b3 = new JButton("Mult");
        b4 = new JButton("Div");

        t1 = new JTextField();
        t2 = new JTextField();

        b1.setBounds(1, 280, 80, 40);
        b2.setBounds(100, 280, 80, 40);
        b3.setBounds(190, 280, 80, 40);
        b4.setBounds(290, 280, 80, 40);

        t1.setBounds(70, 100, 100, 40);
        t2.setBounds(220, 100, 100, 30);

        mainframe.add(b1);
        mainframe.add(b2);
        mainframe.add(b3);
        mainframe.add(b4);

        mainframe.add(t1);
        mainframe.add(t2);

        lobj = new JLabel();
        lobj.setBounds(150, 25, 200, 100);

        mainframe.add(lobj);

        mainframe.setLayout(null);
        mainframe.setVisible(true);
    }

    public void windowClosing(WindowEvent obj) {
        System.exit(0);
    }

    public void actionPerformed(ActionEvent obj) {
        try {
            no1 = Integer.parseInt(t1.getText());
            no2 = Integer.parseInt(t2.getText());

            if (obj.getSource() == b1) {
                    System.out.println();
            }

        } catch (Exception eobj) {

        }
    }
}

class MarvellousCalcultor {
    public static void main(String[] args) {
        Caluculator cobj = new Caluculator(400, 400, "Marvellous Calculator");
    }
}