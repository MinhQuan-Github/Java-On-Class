import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KEY_EVENT extends JFrame{
    Label x;

    public void GUI() {
        x = new Label("Key event");
        x.setFont(new Font(Font.DIALOG , Font.BOLD , 18));
        x.setAlignment(Label.CENTER);

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                x.setText(String.valueOf(e.getKeyChar()));
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        add(x,BorderLayout.CENTER);
        setSize(200,200);
        setVisible(true);
    }

    public KEY_EVENT() {
        GUI();
    }

    public static void main(String []args) {
        new KEY_EVENT();
    }
}
