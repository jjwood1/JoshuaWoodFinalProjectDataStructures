package GUI;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;

import dataStructure.Stack;
import dataStructure.queue;

import javax.swing.JButton;
import java.awt.BorderLayout;

public class MainMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void start(ArrayList<Stack> vendingMachineContents, queue transactionQueue) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu(vendingMachineContents, transactionQueue);
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
	public MainMenu(ArrayList<Stack> vendingMachineContents, queue transactionQueue) {
		initialize(vendingMachineContents, transactionQueue);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ArrayList<Stack> vendingMachineContents, queue vendingMachineTransactions) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnVendingMachineContents = new JButton("Vending Machine Contents");
		frame.getContentPane().add(btnVendingMachineContents, BorderLayout.CENTER);
		btnVendingMachineContents.addActionListener(e ->{
			
			VendingMachineContentGUI Contents = new VendingMachineContentGUI(vendingMachineContents);
			Contents.start(vendingMachineContents);
		});
		JButton btnTransactions = new JButton("Transactions");
		frame.getContentPane().add(btnTransactions, BorderLayout.WEST);
		btnTransactions.addActionListener(e ->{
			vendingMachineTransactionsGUI transacations = new vendingMachineTransactionsGUI(vendingMachineTransactions);
			transacations.start(vendingMachineTransactions);
		});
		JButton btnSortedTransactions = new JButton("Sorted Transactions");
		frame.getContentPane().add(btnSortedTransactions, BorderLayout.EAST);
		btnSortedTransactions.addActionListener(e ->{
			queue sorted = vendingMachineTransactions;
			sorted.sort();
			vendingMachineTransactionsGUI transacations = new vendingMachineTransactionsGUI(sorted);
			transacations.start(sorted);
		});
	}

}
