package dataStructure;
import model.Transaction;

/**************************************************************
* Name        : QueueWood
* Author      : Joshua Wood
* Created     : 2/216/2021
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This program overall description here
*               Input:  list and describe
*               Output: list and describe
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/



public class queue {
// Members
	private int head; //  the top or front of the queue
	private int tail; //  the bottom or back of the queue
	private int size; //  the current size of the queue
	private int maxSize; 
	private Transaction queueItems[];
	/**
	 * Sets default values for maxSize, size, head, and tail.
	 */

	public queue() {
		this.maxSize = 5;
		this.size = 0;
		this.head = -1;
		this.tail = -1;
		this.queueItems = new Transaction[maxSize];
	}

	/**
	 * @param maxSize - sets maximum size of the queue
	 */
	public queue(int maxSize) {
		this.maxSize = maxSize;
		this.size = 0;
		this.head = -1;
		this.tail = -1;
		this.queueItems = new Transaction[maxSize];
	}
	/**
	 * Returns the internal array of the queue.
	 * @param none
	 * @return queueItems
	 */

	public Transaction[] getArr() {
		return queueItems;
	}
	/**
	 * Uses Selection sort to sort the array by cost.
	 * @param none
	 * @return void
	 */

	public void sort() {
		int n = size;
		for(int i = 0; i < n-1; i++) {
			System.out.println("fewfws");
			int min_idx = i;
			for(int j = i+1; j<n; j++) {
				if(queueItems[j].getAmount() > queueItems[min_idx].getAmount()) {
					min_idx = j;
				}
			
				double temp = queueItems[min_idx].getAmount();
				queueItems[min_idx].setAmount(queueItems[i].getAmount());
				queueItems[i].setAmount(temp);
			}
		}
		
	}

	/**
	 * @return If queue is full
	 */
	public boolean isFull() {

		if(size == maxSize)
		{
			return true;
		}
		else {
		return false;
		}

	}

	/**
	 * @return If queue is empty
	 */
	//When the array is printed empty all places are null
	public boolean isEmpty() {

		return this.size == 0;
		}
	

	/**
	 * @return Returns number of elements in the queue
	 */
	public int size() {

		return size; 
	}

	/**
	 * @return Returns element at head of queue
	 * @throws StackEmptyException
	 */
	public Transaction peek() throws QueueEmptyException {
		Transaction item = null;
		if(!this.isEmpty())
		{
		
			item = this.queueItems[this.head + 1];
			return item;
		}

		throw new QueueEmptyException();
	}

	/**
	 * @return Removes and returns element at head of queue
	 * @throws QueueEmptyException
	 */
	//an if statement to test if the queue is empty
	//The QueueEmptyException is needed
	//It is set to head + 1 and the remainder of of head + 1 / maxSize using the modulus operator 
	public Transaction dequeue() throws QueueEmptyException {
		Transaction item = null;
		if(!isEmpty())
		{	
			item = this.queueItems[this.head + 1];
			System.out.println(item);
			this.head = (this.head + 1) % this.maxSize;
			this.size = this.size - 1;
			return item;
		}
		throw new QueueEmptyException();

	}

	/**
	 * Adds item to tail of the queue
	 * 
	 * @param item
	 * @throws QueueFullException
	 */
	//An if statement is needed to see if the queue is full.
	//If the queue is full, an exception is thrown.
	//The head remains unchanged.
	//Size is increased by one
	//Wrapping is done by incrementing the tail through the queue in a circular direction. 
	public void enqueue(Transaction item) throws QueueFullException {
		if(isFull())
		{
			throw new QueueFullException();
		}
		this.tail = (this.tail + 1) % this.maxSize;
		this.queueItems[this.tail] = item;
		this.size = this.size + 1;
	}

	/**
	 * @return Returns list of queue items from head to tail one per line (eg Item1
	 *         Item2 Item3 ...) if queue is empty returns "Queue is Empty"
	 */
	public String printQueue() throws QueueEmptyException  {
		if(this.isEmpty())
		{
			System.out.println("This is empty");
			throw new QueueEmptyException();
		}
		String queueString = new String();
		
		for(int i = 0; i < size; i++)
		{
			
			queueString += "Transaction " + (i + 1) + ": " + this.queueItems[i].getAmount() + ". ";
			
		}
		
		
		
		return queueString; 
	}
}