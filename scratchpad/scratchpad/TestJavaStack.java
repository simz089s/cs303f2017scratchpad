package scratchpad;
import static org.junit.Assert.*;

import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

public class TestJavaStack
{
	private Stack<Integer> aIntStack;
	private Stack<String> aStack;
	
	@Before
	public void setup()
	{
		aStack = new Stack<String>();
		aStack.push("a string");
		aIntStack = new Stack<Integer>();
		aIntStack.push(0);
	}
	
	@Test
	public void testPeek()
	{
		assertTrue(aStack.peek().equals("a string"));
	}
	
	@Test(expected = EmptyStackException.class)
	public void testPopEmpty() throws EmptyStackException
	{
		aStack.pop();
		aStack.pop();
	}
	
	@Test
	public void testPush()
	{
		aStack.push("test");
		assertEquals(aStack.size(), 2);
		assertTrue(aStack.peek().equals("test"));
	}

}
