import javax.swing.*;
import java.awt.*;

public class ITEM_EVENT extends JFrame  {
    ButtonGroup group;
    JRadioButton male , female;
    JComboBox hdh;
    JList animal;
    Label notify;
    Panel pn1 , pn2 , pn;

    public void GUI() {
        String[] hedieuhanh = {"window" , "MS DOS" , "MAC OS" , "UBUNTU"};
        String[] animals = {"dog" , "cat" , "pig" , "cow" , "Elephant", "Tiger", "Lion"};

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        group = new ButtonGroup();

        hdh = new JComboBox(hedieuhanh);

        animal = new JList(animals);
        notify = new Label("The event displayed here ");

        group.add(male);
        group.add(female);

        hdh.setPreferredSize(new Dimension(100,20));
        notify.setPreferredSize(new Dimension(400,20));
        notify.setAlignment(Label.CENTER);
        notify.setFont(new Font(Font.DIALOG, Font.BOLD, 18));

        JScrollPane pane = new JScrollPane();
        pane.getViewport().add(animal);
        pane.setPreferredSize(new Dimension(120,60));


        male.addItemListener(e -> notify.setText("You pressed male radiobutton"));
        female.addItemListener(e -> notify.setText("You pressed female radiobutton"));
        hdh.addItemListener(e -> notify.setText("You choose " + hdh.getSelectedItem() + " in your combo list"));
        animal.addListSelectionListener(e -> notify.setText("You choose " + animal.getSelectedValue() + " in your list"));

        pn1 = new Panel(new FlowLayout());
        pn2 = new Panel(new FlowLayout());
        pn = new Panel(new GridLayout(2,1));

        pn1.add(male);
        pn1.add(female);
        pn1.add(hdh);
        pn1.add(pane);

        pn2.add(notify);

        pn.add(pn1);
        pn.add(pn2);

        add(pn);
        setSize(600,400);
        show();
    }

    public ITEM_EVENT() {
        GUI();
    }

    public static void main(String [] args) {
        ITEM_EVENT A = new ITEM_EVENT();
    }
}
