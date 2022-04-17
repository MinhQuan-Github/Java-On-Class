package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class XuLiChuoi extends Frame implements ActionListener {
    Label EnterAString, ToUpperCase, ToLowerCase, ToLowerUpper, NumberOfWord;
    TextField txt1,txt2,txt3,txt4,txt5;
    Button OK, Reset, Exit;
    Panel pn , pn1 , pn2 , pn3, pn4, pn5, pn6, pnView;

    public void GUI() {
        EnterAString = new Label("Enter a string");
        ToUpperCase = new Label("To UpperCase");
        ToLowerCase = new Label("To LowerCase");
        ToLowerUpper = new Label("To LowerUpper");
        NumberOfWord = new Label("Number Of Word");


        txt1 = new TextField();
        txt2 = new TextField();
        txt3 = new TextField();
        txt4 = new TextField();
        txt5 = new TextField();


        txt2.setEditable(false);
        txt3.setEditable(false);
        txt4.setEditable(false);
        txt5.setEditable(false);

        OK = new Button("OK");
        Reset = new Button("Reset");
        Exit = new Button("Exit");

        OK.addActionListener(this);
        Reset.addActionListener(this);
        Exit.addActionListener(this);

        pn1 = new Panel(new GridLayout(1,2));
        pn2 = new Panel(new GridLayout(1,2));
        pn3 = new Panel(new GridLayout(1,2));
        pn4 = new Panel(new GridLayout(1,2));
        pn5 = new Panel(new GridLayout(1,2));
        pn6 = new Panel(new FlowLayout());
        pnView = new Panel(new GridLayout(5,2));
        pn  = new Panel(new GridLayout(2,1));

        pn1.add(EnterAString);
        pn1.add(txt1);

        pn2.add(ToUpperCase);
        //pn2.add(Box.createRigidArea(new Dimension(30,0)));
        pn2.add(txt2);

        pn3.add(ToLowerCase);
        pn3.add(txt3);

        pn4.add(ToLowerUpper);
        pn4.add(txt4);

        pn5.add(NumberOfWord);
        pn5.add(txt5);

        pn6.add(OK);
        pn6.add(Reset);
        pn6.add(Exit);

        pnView.add(pn1);
        pnView.add(pn2);
        pnView.add(pn3);
        pnView.add(pn4);
        pnView.add(pn5);

        pn.add(pnView);
        pn.add(pn6);

        add(pn);
        setSize(500,230);
        show();
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == OK) {
            if (!txt1.getText().equals("")) {
                int count = 0;
                char[] charArray = txt1.getText().toUpperCase().toCharArray();
                boolean foundSpace = true;
                for (int i = 0 ; i < charArray.length; i++) {
                    if (Character.isLetter(charArray[i])) {
                        if (foundSpace) {
                            count++;
                            charArray[i] = Character.toLowerCase(charArray[i]);
                            foundSpace = false;
                        }
                    } else {
                        foundSpace = true;
                    }
                }
                txt2.setText(txt1.getText().toUpperCase());
                txt3.setText(txt1.getText().toLowerCase());
                txt4.setText(String.valueOf(charArray));
                txt5.setText(Integer.toString(count));
            }
        }
        if (e.getSource() == Reset) {
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            txt4.setText("");
            txt5.setText("");
        }
        if (e.getSource() == Exit) {
            dispose();
        }
    }
    public XuLiChuoi() {
        GUI();
    }
}
