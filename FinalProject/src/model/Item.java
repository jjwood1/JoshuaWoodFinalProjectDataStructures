package model;
public class Item {
	private long id;
	private String name;
	private String company;
	private double price;
	/**
	 * default constructor
	 */

	public Item() {}
	/**
	 * Sets everything in the item
	 * @param long id
	 * @param String name
	 * @param String company
	 * @param double price
	 */

	public Item(long id, String name, String company, double price) {
		this.name = name;
		this.company = company;
		this.price = price;
		this.id = id;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * Returns contents of object as a formatted string
	 * @param none
	 * @return String
	 */

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", company=" + company + ", price=" + price + "]";
	}
	
}
