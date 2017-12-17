package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.*;

public class SwingApp extends JFrame {
	public SwingApp() {
		setSize(600, 400);
		setTitle("Moja aplikacja Swing");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
	}

	public static void main(String[] args) {
		SwingApp simple = new SwingApp();

		
		
		Integer[] data = {1, 2, 3, 4, 5};

		JComboBox staticList = new JComboBox(data);
		staticList.setSelectedIndex(1);
		simple.add(staticList);

		Integer[] randomData = new Integer[20];

		Random generator = new Random();
		int low = 0;
		int high = 100;

		for (int i = 0; i < 20; i++){
			randomData[i] = generator.nextInt(high - low);
		}

		JComboBox secondList = new JComboBox(randomData);
		staticList.setSelectedIndex(1);
		simple.add(secondList);

		JButton jButton = new JButton("OK");
		simple.add(jButton);

		JLabel label = new JLabel("0");
		simple.add(label);
		
		simple.setVisible(true);
	}
}
