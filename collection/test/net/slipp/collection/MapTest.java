package net.slipp.collection;

import java.util.Map;
import java.util.TreeMap;

import junit.framework.TestCase;

public class MapTest extends TestCase {
	private Map<String, Student> students;
	
	@Override
	protected void setUp() throws Exception {
		students = new TreeMap<String, Student>();
		students.put("A",new Student("A", 15));
		students.put("B",new Student("B", 18));
		students.put("C",new Student("C", 23));
		students.put("D",new Student("D", 16));
	}
	
	public void testFindByName() throws Exception {
		// B 이름을 가지는 학생을 찾는다.
	}
}
