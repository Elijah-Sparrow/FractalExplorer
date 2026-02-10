import javax.swing.JFrame;

public class FractalRunner {
    public static void main(String[] args) {
        JFrame f = new JFrame("Put Frame Title Here"); 
        FractalExplorer p = new FractalExplorer();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(p);
        f.pack();
        f.setVisible(true);
  }
}