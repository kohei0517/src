import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Dimension;

class Hello4{
  public static void main(String[] args){
    JFrame f = new JFrame();
    JLabel l = new JLabel("Hello");
    f.setPreferredSize(new Dimension(200,200));
    f.getContentPane().add(1);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.pack();
    f.setVisible(true);
  }
}