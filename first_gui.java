import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloDemo extends  JFrame {
    private JPanel mypanel;
    private JLabel txtName;
    private JTextField textNane;
    private JButton button;
public HelloDemo() {
    textNane.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(button,txtName.getText()+" Hello");
        }
    });
}

    public static void main(String[] args) {
         HelloDemo h=new HelloDemo();
         h.setContentPane(h.mypanel);
         h.setTitle("Hello..");
         h.setSize(300,400);
         h.setVisible(true);
         h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
