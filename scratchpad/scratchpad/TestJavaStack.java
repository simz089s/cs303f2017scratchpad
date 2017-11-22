package scratchpad;
import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.Test;

public class TestJavaStack
{
	
	@Test(expected = EmptyStackException.class)
	public void testPopEmpty() throws EmptyStackException
	{
		Stack<String> stack = new Stack<>();
		stack.pop();
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
