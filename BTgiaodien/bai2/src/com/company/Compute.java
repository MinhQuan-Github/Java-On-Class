package com.company;

import java.awt.*;
import java.awt.event.*;

public class Compute extends Frame implements ActionListener  {
    Label title , Number1 , Number2 , result;
    TextField txt1 , txt2 , txtKQ;
    Button Addition, Subtraction, Multiplication, Division, reset, exit;
    Panel pn , pn1 , pn2 , pn3 , pn4;

    @SuppressWarnings("deprecation")
    public void GUI() {
        title = new Label("Basic Arithmetic Operations");
        Number1 = new Label("Number 1");
        Number2 = new Label("Number 2");
        result = new Label("Result");

        txt1 = new TextField(7);
        txt2 = new TextField(7);
        txtKQ = new TextField(7);

        Addition = new Button("Addition");
        Subtraction = new Button("Subtraction");
        Multiplication = new Button("Multiplication");
        Division = new Button("Division");

        reset = new Button("reset");
        exit = new Button("exit");

        Addition.addActionListener(this);
        Subtraction.addActionListener(this);
        Multiplication.addActionListener(this);
        Division.addActionListener(this);
        reset.addActionListener(this);
        exit.addActionListener(this);

        pn = new Panel(new GridLayout(4,1));
        pn1 = new Panel(new FlowLayout());
        pn2 = new Panel(new GridLayout(3,2));
        pn3 = new Panel(new FlowLayout());
        pn4 = new Panel(new FlowLayout());

        pn1.add(title);

        pn2.add(Number1); pn2.add(txt1);
        pn2.add(Number2); pn2.add(txt2);
        pn2.add(result);  pn2.add(txtKQ);

        pn3.add(Addition);
        pn3.add(Subtraction);
        pn3.add(Multiplication);
        pn3.add(Division);

        pn4.add(reset);
        pn4.add(exit);

        pn.add(pn1);
        pn.add(pn2);
        pn.add(pn3);
        pn.add(pn4);

        add(pn);
        setSize(600 , 400);
        show();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Addition) {
            int a = Integer.parseInt(txt1.getText());
            int b = Integer.parseInt(txt2.getText());
            txtKQ.setText(Integer.toString(a + b));
        }
        if (e.getSource() == Subtraction){
            int a = Integer.parseInt(txt1.getText());
            int b = Integer.parseInt(txt2.getText());
            txtKQ.setText(Integer.toString(a - b));
        }
        if (e.getSource() == Multiplication) {
            int a = Integer.parseInt(txt1.getText());
            int b = Integer.parseInt(txt2.getText());
            txtKQ.setText(Integer.toString(a * b));
        }
        if (e.getSource() == Division) {
            int a = Integer.parseInt(txt1.getText());
            int b = Integer.parseInt(txt2.getText());
            if (b == 0) {
                txtKQ.setText("Error");
            } else {
                txtKQ.setText(Float.toString((float)a/b));
            }
        }
        if (e.getSource() == reset) {
            txt1.setText("");
            txt2.setText("");
            txtKQ.setText("");
        }
        if (e.getSource() == exit) {
            dispose();
        }
    }
    public Compute(){
        GUI();
    }


}
