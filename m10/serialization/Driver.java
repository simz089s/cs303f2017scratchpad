package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;

/**
 * Utility class with a driver program and some 
 * sample items and inventories.
 */
public final class Driver implements Serializable
{
	private static final int MAX_STOCK = 50;
	private static final Item ITEM_CEREAL = new Item("Cereal", 1, 200);
	private static final Item ITEM_JAM = new Item("Jam", 2, 400);
	private static final Item ITEM_BUTTER = new Item("Butter", 3, 250);
	
	private static final Item[] ITEMS = { ITEM_CEREAL, ITEM_JAM, ITEM_BUTTER };
	
	private Driver() {}
	
	/**
	 * @param pArgs Not used
	 */
	public static void main(String[] pArgs)
	{
		Random random = new Random();
		Inventory inventory1 = new Inventory("IGA Location 1");
		Inventory inventory2 = new Inventory("IGA Location 2");
		Inventory inventory3 = new Inventory("IGA Location 3");
		for( Item item : ITEMS )
		{
			inventory1.stock(item, random.nextInt(MAX_STOCK));
			inventory2.stock(item, random.nextInt(MAX_STOCK));
			inventory3.stock(item, random.nextInt(MAX_STOCK));
		}
		Corporation iga = new Corporation();
		iga.addInventory(inventory1);
		iga.addInventory(inventory2);
		iga.addInventory(inventory3);
		
		try
		{
			write(iga);
			Corporation igaRead = read();
			System.out.println(igaRead.toString());
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void write(Corporation pCorporation) throws IOException
	{
		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("Corporation.dat")))
		{
			objOut.writeObject(pCorporation);
		}
	}
	
	public static Corporation read() throws IOException, ClassNotFoundException
	{
		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("Corporation.dat")))
		{
			return (Corporation) objIn.readObject();
		}
	}
}
