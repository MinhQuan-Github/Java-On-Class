
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MOUSE_EVENT extends JFrame implements MouseListener {

    public MOUSE_EVENT(String title) throws HeadlessException {
        super(title);
        addMouseListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MOUSE_EVENT("MouseEvent Test");
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("You clicked the mouse at " + e.getXOnScreen() + " " + e.getYOnScreen());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("You press the mouse at "+ e.getXOnScreen()+ " " + e.getYOnScreen());

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("You release the mouse at "+ e.getXOnScreen()+ " " + e.getYOnScreen());

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("You enter the window at "+ e.getXOnScreen()+ " " + e.getYOnScreen());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("You exit  the window at "+ e.getXOnScreen()+ " " + e.getYOnScreen());

    }
}

