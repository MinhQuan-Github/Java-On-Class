import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ACTION_EVENT extends JFrame implements ActionListener {
    Button OK;
    TextField txt;
    JList animal;
    Label notify;
    Panel pn1 , pn2 , pn;

    public void GUI() {
        String[] item = {"dog" , "cat" , "pig" , "cow" , "Elephant", "Tiger", "Lion"};

        OK = new Button("OK");
        txt = new TextField();
        animal = new JList(item);
        notify = new Label("The event displayed here ");

        txt.setPreferredSize(new Dimension(100,20));
        notify.setPreferredSize(new Dimension(300,20));
        notify.setAlignment(Label.CENTER);
        notify.setFont(new Font(Font.DIALOG, Font.BOLD, 18));

        JScrollPane pane = new JScrollPane();
        pane.getViewport().add(animal);
        pane.setPreferredSize(new Dimension(120,60));

        OK.addActionListener(this);
        txt.addActionListener(this);
        animal.addListSelectionListener(e -> notify.setText("You choose " + animal.getSelectedValue() + " in your list"));

        pn1 = new Panel(new FlowLayout());
        pn2 = new Panel(new FlowLayout());
        pn = new Panel(new GridLayout(2,1));

        pn1.add(OK);
        pn1.add(txt);
        pn1.add(pane);

        pn2.add(notify);

        pn.add(pn1);
        pn.add(pn2);

        add(pn);
        setSize(600,400);
        show();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == OK) {
            notify.setText("You pressed OK button");
        }
        if (e.getSource() == txt) {
            notify.setText("You entered " + txt.getText() + " in your textfield");
        }
    }

    public ACTION_EVENT() {
        GUI();
    }

    public static void main(String [] args) {
        ACTION_EVENT A = new ACTION_EVENT();
    }
}
