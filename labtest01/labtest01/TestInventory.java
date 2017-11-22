package labtest01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestInventory
{
	
	@Test
	public static void TestStockAmount()
	{
		Inventory aInventory = new Inventory("Inventory test");
		Item aItem = Item.getItem("Whatever", 0, 1);
		int beforeAmount = aInventory.available(aItem);
		aInventory.stock(aItem, 1);
		assertEquals(aInventory.available(aItem), beforeAmount+1); 
	}
}
