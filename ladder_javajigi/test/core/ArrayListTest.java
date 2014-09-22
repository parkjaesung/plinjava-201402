package core;

import java.util.ArrayList;

import junit.framework.TestCase;

public class ArrayListTest extends TestCase {
	public void testRetainAll() throws Exception {
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(1);
		values.add(2);
		values.add(3);
		
		ArrayList<Integer> values2 = new ArrayList<Integer>();
		values2.add(3);
		values2.add(4);
		
		boolean result = values2.retainAll(values);
		System.out.println(result + " " + values2.size());
	}
	
	public void testRetainAll2() throws Exception {
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(1);
		values.add(2);
		values.add(3);
		
		ArrayList<Integer> values2 = new ArrayList<Integer>();
		values2.add(4);
		
		boolean result = values2.retainAll(values);
		System.out.println(result + " " + values2.size());
	}
}
