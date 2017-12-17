package main;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class SwingApp extends JFrame {
	public SwingApp() {
		setSize(600, 400);
		setTitle("Moja aplikacja Swing");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		SwingApp simple = new SwingApp();

		
		
		Integer[] data = {1, 2, 3, 4, 5};
		
		JList<Integer> list = new JList<Integer> (data); //data has type Object[]
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		list.setVisibleRowCount(-1);
		
		JScrollPane listScroller = new JScrollPane(list);
		simple.add(listScroller);
		
		simple.setVisible(true);
	}
}
