package mainPackage;
import java.util.ArrayList;
import model.*;
import GUI.*;
import dataStructure.*;
/**************************************************************
* Name        : Vending Machine Project
* Author      : Joshua Wood
* Created     : 05/02/2021
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : Basic vending machine interface that uses stacks and queues to assist with the storage of various objects.
*               Input:  None
*               Output: outputs a GUI with data of a vending machine
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/


public class Main {
	public static ArrayList<Stack> stockVendingMachine() throws StackFullException, StackEmptyException{
		ArrayList<Stack> vendingMachineContents = new ArrayList<Stack>();
		Stack stack = new Stack();
		Stack stack1 = new Stack();
		Stack stack2 = new Stack();
		Stack stack3 = new Stack();	
		Item Doritos1 = new Item(10, "Nacho Cheese Doritos", "Pepsi-Co", 1.99);
		Item Doritos2 = new Item(11, "Nacho Cheese Doritos", "Pepsi-Co", 1.99);
		Item Doritos3 = new Item(12, "Nacho Cheese Doritos", "Pepsi-Co", 1.99);
		Item Doritos4 = new Item(13, "Nacho Cheese Doritos", "Pepsi-Co", 1.99);
		Item Doritos5 = new Item(14, "Nacho Cheese Doritos", "Pepsi-Co", 1.99);
		stack.push(Doritos1);
		stack.push(Doritos2);
		stack.push(Doritos3);
		stack.push(Doritos4);
		stack.push(Doritos5);
		vendingMachineContents.add(stack);	
		Item RedBull1 = new Item(11107, "Red Bull", "Red Bull GmbH", 4.99);
		Item RedBull2 = new Item(11108, "Red Bull", "Red Bull GmbH", 4.99);
		Item RedBull3 = new Item(11109, "Red Bull", "Red Bull GmbH", 4.99);
		Item RedBull4 = new Item(11110, "Red Bull", "Red Bull GmbH", 4.99);
		Item RedBull5 = new Item(11111, "Red Bull", "Red Bull GmbH", 4.99);
		stack1.push(RedBull1);
		stack1.push(RedBull2);
		stack1.push(RedBull3);
		stack1.push(RedBull4);
		stack1.push(RedBull5);
		vendingMachineContents.add(stack1);
		Item MountainDew1 = new Item(222221, "Mountain Dew", "Pepsi-Co", 3.99);
		Item MountainDew2 = new Item(222222, "Mountain Dew", "Pepsi-Co", 3.99);
		Item MountainDew3 = new Item(222223, "Mountain Dew", "Pepsi-Co", 3.99);
		Item MountainDew4 = new Item(222224, "Mountain Dew", "Pepsi-Co", 3.99);
		Item MountainDew5 = new Item(222225, "Mountain Dew", "Pepsi-Co", 3.99);
		stack2.push(MountainDew1);
		stack2.push(MountainDew2);
		stack2.push(MountainDew3);
		stack2.push(MountainDew4);
		stack2.push(MountainDew5);
		vendingMachineContents.add(stack2);	
		Item MrPibb1 = new Item(3333331, "MrPibb", "Coca-Cola", 2.99);
		Item MrPibb2 = new Item(3333332, "MrPibb", "Coca-Cola", 2.99);
		Item MrPibb3 = new Item(3333333, "MrPibb", "Coca-Cola", 2.99);
		Item MrPibb4 = new Item(3333334, "MrPibb", "Coca-Cola", 2.99);
		Item MrPibb5 = new Item(3333335, "MrPibb", "Coca-Cola", 2.99);
		stack3.push(MrPibb1);
		stack3.push(MrPibb2);
		stack3.push(MrPibb3);			
		stack3.push(MrPibb4);
		stack3.push(MrPibb5);
		vendingMachineContents.add(stack3);
		return vendingMachineContents;
	}
	public static queue makeTransactions() throws QueueFullException, QueueEmptyException{
		Item RedBull = new Item(11106, "Red Bull", "Red Bull GmbH", 4.99);
		Item Doritos = new Item(0, "Nacho Cheese Doritos", "Pepsi-Co", 1.99);
		Item MountainDew = new Item(222220, "Mountain Dew", "Pepsi-Co", 3.99);
		Item MrPibb = new Item(3333330, "MrPibb", "Coca-Cola", 2.99);
		Transaction transaction = new Transaction(4444440, 3.99, MountainDew);
		Transaction transaction1 = new Transaction(4444441, 4.99, RedBull);
		Transaction transaction2 = new Transaction(4444442, 1.99, Doritos);
		Transaction transaction3 = new Transaction(4444444, 2.99, MrPibb);
		queue transQueue = new queue();
		queue test = transQueue;
		transQueue.enqueue(transaction);
		transQueue.enqueue(transaction1);
		transQueue.enqueue(transaction2);
		transQueue.enqueue(transaction3);
		return transQueue;
}
	public static void main(String[] args)throws QueueFullException, QueueEmptyException, StackFullException, StackEmptyException {
		ArrayList<Stack> vendingMachineContents = new ArrayList<Stack>();
		vendingMachineContents = stockVendingMachine();
		queue transactionQueue = makeTransactions();
		MainMenu menu = new MainMenu(vendingMachineContents, transactionQueue);
		MainMenu.start(vendingMachineContents, transactionQueue);

	}

}
