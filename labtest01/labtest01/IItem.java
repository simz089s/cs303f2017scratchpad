package labtest01;

public interface IItem
{

	/**
	 * @return The name of the item
	 */
	String getName();

	/**
	 * @return The ID of the item.
	 */
	int getId();

	/**
	 * @return The price of the item in cents
	 */
	int getPrice();

	boolean equals(Object pItem);

	int compareTo(IItem pItem);

}