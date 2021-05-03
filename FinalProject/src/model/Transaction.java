/**
 * Transactions class
 * @author Joshua Wood
 * @version
 */

package model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Transaction {
	private long id;
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");
	private LocalDate date;
	private double amount;
	private Item item;
	/**
	 * Describe default sets the time of transaction to when the purchase is made
	 */

	public Transaction() {
		date = LocalDate.now();
	}
	/**
	 * Sets all possible variables of the transaction.
	 * @param long id
	 * @param double amount
	 * @param Item item
	 */

	public Transaction(long id, double amount, Item item) {
		this.id = id;
		this.amount = amount;
		this.item = item;
		date = LocalDate.now();
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	/**
	 * @return the item
	 */
	public Item getItem() {
		return item;
	}
	/**
	 * @param item the item to set
	 */
	public void setItem(Item item) {
		this.item = item;
	}
	/**
	 * returns everything about the transactions as a formated string.
	 * @param None
	 * @return String
	 */

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", date=" + date + ", amount=" + amount + ", item=" + item + "]";
	}
	
}
