package GUI;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import dataStructure.Stack;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VendingMachineContentGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void start(ArrayList<Stack> vendingMachineContents) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VendingMachineContentGUI window = new VendingMachineContentGUI(vendingMachineContents);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VendingMachineContentGUI(ArrayList<Stack> vendingMachineContents) {
		initialize(vendingMachineContents);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ArrayList<Stack> vendingMachineContents) {
		frame = new JFrame("Vending Machine Contents");
		JPanel p = new JPanel();
		JLabel l = new JLabel();
		
		for(int i = 0; i < vendingMachineContents.size(); i++) {
			JList b = new JList(vendingMachineContents.get(i).getArr());
			System.out.println("in contents");
			b.setSelectedIndex(2);
			p.add(b);
		}
		frame.getContentPane().add(p);
		frame.setBounds(100, 100, 450, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}

}
/*SwingUtilities.invokeLater(new Runnable() {
public void run() {
	JList b;
	JFrame frame = new JFrame("Vending Machine");
	JPanel p = new JPanel();
	JLabel l = new JLabel("Vending machine");
	b = new JList(transQueue.getArr());
	b.setSelectedIndex(2);
	p.add(b);
	frame.add(p);
	frame.setSize(500, 400);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);

}
});*/