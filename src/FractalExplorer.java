import java.awt.*;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;




public class FractalExplorer extends JPanel implements MouseListener , KeyListener{
    Palette a = new Palette();
    View x = new View(600,400);
    Complex topLeft = new Complex(-2.0,1.0);
    Complex bottomRight = new Complex(1,-1);

    
    
    public FractalExplorer() {
        addMouseListener(this);
        addKeyListener(this);
        setPreferredSize(new Dimension(600,400));
        setBackground(Color.BLACK);
        a.setColor(2);
        x.setComplexCorners(topLeft, bottomRight);
    }

    public void paintComponent(Graphics g) {
        for (int row = 0; row < 600; row++) {
            for (int col = 0; col < 400; col++) {
                double iteration = (double) Mandelbrot.testPoint(x.translate(row,col))/Mandelbrot.iterationLimit;
                if (iteration < 0){
                    g.setColor(Color.black);
                    g.fillRect(row,col, 1, 1);
                } else {
                    Color q = a.getColor(iteration);
                    g.setColor(q);
                    g.fillRect(row,col, 1, 1);
                }
            }
        }
    }



    @Override
    public void mouseClicked(MouseEvent e) {
        //no op
    }

    @Override
    public void mousePressed(MouseEvent e) {
        topLeft = x.translate(e.getX() - 150, e.getY() - 100);
        bottomRight = x.translate(e.getX() + 150, e.getY() + 100);
        x.setComplexCorners(topLeft, bottomRight);
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //no op
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("hi");
        Mandelbrot.setIterationLimit(Mandelbrot.iterationLimit + 100);
        repaint();
    }


    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'q') {
            Mandelbrot.setIterationLimit(Mandelbrot.iterationLimit + 100);
            System.out.println("hi");
            repaint();
        }
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP){
            System.out.println("hi");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }
}
