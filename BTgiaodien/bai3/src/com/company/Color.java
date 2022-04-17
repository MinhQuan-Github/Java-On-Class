package com.company;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Color extends Frame implements ActionListener {
    Button RED, GREEN, BLUE , Thoat;
    Panel p;
    public Color() {
        RED = new Button("RED");
        GREEN = new Button("GREEN");
        BLUE = new Button("BLUE");
        Thoat = new Button("Thoat");

        RED.addActionListener(this);
        GREEN.addActionListener(this);
        BLUE.addActionListener(this);
        Thoat.addActionListener(this);

        p = new Panel(new FlowLayout());
        p.add(RED);
        p.add(GREEN);
        p.add(BLUE);
        p.add(Thoat);

        add(p,BorderLayout.SOUTH);
        setSize(600,500);
        show();
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == RED) {
            this.setBackground(java.awt.Color.red);
        }
        if (e.getSource() == GREEN) {
            this.setBackground(java.awt.Color.green);
        }
        if (e.getSource() == BLUE) {
            this.setBackground(java.awt.Color.BLUE);
        }
        if (e.getSource() == Thoat) {
            dispose();
        }
    }


}
