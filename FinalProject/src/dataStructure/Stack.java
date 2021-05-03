package dataStructure;
import model.Item;
import java.util.Arrays;
/**
 * Class makes a stack
 * @author Joshua Wood
 * @version
 */

public class Stack {
	// Members
	private int top;  
	private int maxSize;  
	private Item stackItems[]; 

/**
 * Sets top and maxSize to their default values
 */

	public Stack() {
		this.maxSize = 20; 
		this.top = -1; 
		this.stackItems = new Item[maxSize];
	}
	
	/**
	 * @param maxSize - sets maximum size of the stack 
	 */
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.top = -1; 
		this.stackItems = new Item[maxSize];
	}
	/**
	 * Returns array
	 * @param none
	 * @return Item[] stackItems
	 */

	public Item[] getArr() {
		return stackItems;
	}
	
	/**
	 * returns true if empty
	 * @param none
	 * @return boolean
	 */

	public boolean isFull() {
		
		return top == maxSize -1; // checks to see if the top is equal to the max stack size.
	}
	
	/**
	 * returns true if stack is empty
	 * @param none
	 * @return boolean
	 */

	public boolean isEmpty() {
		if(top > 0)
		{
			return false;
		}
		else
		return true;  
	}
   
	/**
	 * Returns the size of the stack
	 * @param none
	 * @return int top
	 */

	public int size() {

		int j = stackItems.length;
		return top;
		//return stackItems.length;  

	}
	
	/**returns the top of the stack
	 * @return Item
	 * @throws StackEmptyException 
	 */
	public Item peek() throws StackEmptyException{
		if (! this.isEmpty()) //this if statement checks to see if the stack is empty so it does not return an unwanted surprise
			//an exception is thrown if the stack is empty
			return stackItems[top];
		throw new StackEmptyException(); 
	}
	
	/**
	 * returns an item from the top of the stack. throw exceptions of stack is empty
	 * @param paramName
	 * @return
	 */

	public Item pop() throws StackEmptyException{
		Item item = null; 
		if(this.isEmpty())
		{
			throw new StackEmptyException();
		}
		else
		{
			item = stackItems[top];
			top--;
			return item;
		}
		
	}	
	
	/**
	 * 
	 */
	//if the top is greater than or equal to the top, it throws an exception.
	//adds to the data one above the current top and increments the value of top by one
	
	public void push(Item item) throws StackFullException {
		if(top >= maxSize)
		{
			System.out.println("Stack full");
			throw new StackFullException();
			
		}
		else
			
			stackItems[++top] = item;
	
	}
	/**
	 * Prints the stack
	 * @param paramName
	 * @return
	 */

	public String printStackUp() throws StackEmptyException {
		String stackString = new String(); 
		if(this.isEmpty())
		{
			
			throw new StackEmptyException();
		}
		int j = top;
		for(int i = -1; i < top; i++)
		{
			stackString += stackItems[j--] + ", ";
			
		}
		//stackString = Arrays.toString(stackItems);
		return stackString; // Possibly you will remove this line, this is for running Unit Tests before writing code
	}
}
