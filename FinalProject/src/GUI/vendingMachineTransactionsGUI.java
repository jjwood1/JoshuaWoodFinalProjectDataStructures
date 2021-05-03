package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import dataStructure.QueueEmptyException;
import dataStructure.QueueFullException;
import dataStructure.queue;

public class vendingMachineTransactionsGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void start(queue vendingMachineTransactions) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vendingMachineTransactionsGUI window = new vendingMachineTransactionsGUI(vendingMachineTransactions);
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
	public vendingMachineTransactionsGUI(queue vendingMachineTransactions) {
		initialize(vendingMachineTransactions);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(queue vendingMachineTransactions)  {
		frame = new JFrame("Vending Machine Transaction");
		JPanel p = new JPanel();
		JLabel l = new JLabel();
		
		JList b = new JList(vendingMachineTransactions.getArr());
		b.setSelectedIndex(2);
		p.add(b);
		frame.getContentPane().add(p);
		frame.setBounds(100, 100, 850, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}

}
