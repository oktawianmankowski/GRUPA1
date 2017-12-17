package main;

import javax.swing.JFrame;

public class SwingApp extends JFrame {
	public SwingApp() {
		setSize(600, 400);
		setTitle("Moja aplikacja Swing");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		SwingApp simple = new SwingApp();

		simple.setVisible(true);
	}
}
