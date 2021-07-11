package com.vorg.calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {

	public static void main(String[] args) {

		Calculator c = new Calculator();

//		c.done();
	}

	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bM, bS, bE, bD, bA, bC;
	JTextField t1;
	String n1 = "", o = "", n2 = "";

	private void done() {
		n1 = n2 = o = "";

	}

	public Calculator() {

		t1 = new JTextField(20);
		t1.setBounds(10, 10, 345, 40);
		add(t1);

		b7 = new JButton("7");
		b7.setFont(new Font("osward", Font.BOLD, 15));
		b7.setBounds(10, 70, 70, 40);
		add(b7);
		b8 = new JButton("8");
		b8.setFont(new Font("osward", Font.BOLD, 15));
		b8.setBounds(100, 70, 70, 40);
		add(b8);
		b9 = new JButton("9");
		b9.setFont(new Font("osward", Font.BOLD, 15));
		b9.setBounds(190, 70, 70, 40);
		add(b9);
		bE = new JButton("=");
		bE.setFont(new Font("osward", Font.BOLD, 15));
		bE.setBounds(280, 70, 70, 40);
		add(bE);

		b4 = new JButton("4");
		b4.setFont(new Font("osward", Font.BOLD, 15));
		b4.setBounds(10, 120, 70, 40);
		add(b4);
		b5 = new JButton("5");
		b5.setFont(new Font("osward", Font.BOLD, 15));
		b5.setBounds(100, 120, 70, 40);
		add(b5);
		b6 = new JButton("6");
		b6.setFont(new Font("osward", Font.BOLD, 15));
		b6.setBounds(190, 120, 70, 40);
		add(b6);
		bA = new JButton("+");
		bA.setFont(new Font("osward", Font.BOLD, 15));
		bA.setBounds(280, 120, 70, 40);
		add(bA);

		b1 = new JButton("1");
		b1.setFont(new Font("osward", Font.BOLD, 15));
		b1.setBounds(10, 170, 70, 40);
		add(b1);
		b2 = new JButton("2");
		b2.setFont(new Font("osward", Font.BOLD, 15));
		b2.setBounds(100, 170, 70, 40);
		add(b2);
		b3 = new JButton("3");
		b3.setFont(new Font("osward", Font.BOLD, 15));
		b3.setBounds(190, 170, 70, 40);
		add(b3);
		bS = new JButton("-");
		bS.setFont(new Font("osward", Font.BOLD, 15));
		bS.setBounds(280, 170, 70, 40);
		add(bS);

		bM = new JButton("*");
		bM.setFont(new Font("osward", Font.BOLD, 15));
		bM.setBounds(10, 220, 70, 40);
		add(bM);
		b0 = new JButton("0");
		b0.setFont(new Font("osward", Font.BOLD, 15));
		b0.setBounds(100, 220, 70, 40);
		add(b0);
		bD = new JButton("/");
		bD.setFont(new Font("osward", Font.BOLD, 15));
		bD.setBounds(190, 220, 70, 40);
		add(bD);
		bC = new JButton("C");
		bC.setFont(new Font("osward", Font.BOLD, 15));
		bC.setBounds(280, 220, 70, 40);
		add(bC);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		bM.addActionListener(this);
		bC.addActionListener(this);
		bA.addActionListener(this);
		bD.addActionListener(this);
		bS.addActionListener(this);
		bE.addActionListener(this);

		setLayout(null);
		setVisible(true);
		setSize(380, 320);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(600, 300);
		setResizable(false);
		getContentPane().setBackground(Color.white);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String s = e.getActionCommand();

		if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
			if (o.equals("")) {

				n1 = n1 + s;
			} else {
				n2 = n2 + s;
			}

			t1.setText(n1 + o + n2);

		} else if (s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")) {
			o = s;
			t1.setText(n1 + o + n2);
		}

		else if (s.equals("=")) {
			double t;
			if (o.equals("+")) {
				t = Double.parseDouble(n1) + Double.parseDouble(n2);
			} else if (o.equals("-")) {
				t = Double.parseDouble(n1) - Double.parseDouble(n2);
			} else if (o.equals("*")) {
				t = Double.parseDouble(n1) * Double.parseDouble(n2);
			} else {
				t = Double.parseDouble(n1) / Double.parseDouble(n2);
			}

			t1.setText(n1 + o + n2 + "=" + t);
			n1 = String.valueOf(t);
			n2 = o = "";

		} else if (s.equals("C")) {
			n1 = n2 = o = "";
			t1.setText(n1 + o + n2);

		}

//		if (o.equals("+")) {
//			double t;
//			t = Double.parseDouble(n1) + Double.parseDouble(n2);
//			t1.setText(n1 + o + n2 + "=" + t);
//		} else if (o.equals("-")) {
//			t = Double.parseDouble(n1) - Double.parseDouble(n2);
//			t1.setText(n1 + o + n2 + "=" + t);
//		} else if (o.equals("*")) {
//			t = Double.parseDouble(n1) * Double.parseDouble(n2);
//			t1.setText(n1 + o + n2 + "=" + t);
//		} else if (o.equals("/")) {
//			t = Double.parseDouble(n1) / Double.parseDouble(n2);
//			t1.setText(n1 + o + n2 + "=" + t);
//
//		}

	}
}