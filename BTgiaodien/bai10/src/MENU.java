
import javax.swing.*;
import java.awt.*;

class MENU extends JFrame {
    JMenuBar menuBar;
    JMenu fileMenu, editMenu;

    public MENU(String title) {
        super(title);
        GUI();
    }

    private void GUI() {

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem saveAs = new JMenuItem("Save as");
        fileMenu.add(open);
        fileMenu.add(save);
        fileMenu.add(saveAs);

        JMenuItem copy, cut, paste, protectedM, first, second, third;

        copy = new JMenuItem("Copy");
        cut = new JMenuItem("Cut");
        paste = new JMenuItem("Paste");
        protectedM = new JMenuItem("Protected");
        JMenu option=new JMenu("Option");
        first = new JMenuItem("First");
        second = new JMenuItem("Second");
        third = new JMenuItem("Third");
        option.add(first);
        option.add(second);
        option.add(third);

        editMenu.add(copy);
        editMenu.add(cut);
        editMenu.add(paste);
        editMenu.add(option);
        editMenu.add(protectedM);


        setLayout(new FlowLayout());
        setJMenuBar(menuBar);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MENU("Minh họa tạo Menu");
    }
}