package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mayTinhCaNhan extends Frame implements ActionListener {
    TextField screen;
    Button _0, _1, _2, _3, _4, _5, _6, _7, _8, _9, _chia, _nhan, _cong, _tru, _dot, _C, _equal;
    Panel pnTop , pnTrail, pnButton, pnView;
    String sc = "";

    void GUI() {
        screen = new TextField();
        screen.setEditable(false);

        _0 = new Button("0");
        _1 = new Button("1");
        _2 = new Button("2");
        _3 = new Button("3");
        _4 = new Button("4");
        _5 = new Button("5");
        _6 = new Button("6");
        _7 = new Button("7");
        _8 = new Button("8");
        _9 = new Button("9");
        _chia = new Button("/");
        _nhan = new Button("*");
        _cong = new Button("+");
        _tru = new Button("-");
        _dot = new Button(".");
        _C = new Button("C");
        _equal = new Button("=");

        _0.addActionListener(this);
        _1.addActionListener(this);
        _2.addActionListener(this);
        _3.addActionListener(this);
        _4.addActionListener(this);
        _5.addActionListener(this);
        _6.addActionListener(this);
        _7.addActionListener(this);
        _8.addActionListener(this);
        _9.addActionListener(this);
        _chia.addActionListener(this);
        _nhan.addActionListener(this);
        _cong.addActionListener(this);
        _tru.addActionListener(this);
        _dot.addActionListener(this);
        _C.addActionListener(this);
        _equal.addActionListener(this);
        _equal.setPreferredSize(new Dimension(60,120));

        pnTop = new Panel(new GridLayout(1,1));
        pnButton = new Panel(new GridLayout(4,4));
        pnTrail = new Panel(new FlowLayout());
        pnView = new Panel();
        pnView.setLayout(new BoxLayout(pnView,BoxLayout.Y_AXIS));


        pnTop.add(screen);

        pnButton.add(_7);
        pnButton.add(_8);
        pnButton.add(_9);
        pnButton.add(_chia);
        pnButton.add(_4);
        pnButton.add(_5);
        pnButton.add(_6);
        pnButton.add(_nhan);
        pnButton.add(_1);
        pnButton.add(_2);
        pnButton.add(_3);
        pnButton.add(_tru);
        pnButton.add(_0);
        pnButton.add(_dot);
        pnButton.add(_C);
        pnButton.add(_cong);

        pnTrail.add(pnButton);
        pnTrail.add(_equal,BorderLayout.EAST);

        pnView.add(pnTop);
        pnView.add(pnTrail);

        add(pnView);
        setSize(400,220);
        show();
    }

    public void actionPerformed(ActionEvent e) {
        String sender = e.getActionCommand();
        if (sender.equals("C") && sc.length() > 0) {
            sc = sc.substring(0,sc.length()-1);
        } else {
            sc += sender;
        }
        screen.setText(sc);
    }

    public mayTinhCaNhan() {
        GUI();
    }
}
