package net.slipp.collection;

import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

public class SetTest extends TestCase {
	private Set<Student> students;
	
	@Override
	protected void setUp() throws Exception {
		students = new HashSet<Student>();
		students.add(new Student("A", 15));
		students.add(new Student("B", 18));
		students.add(new Student("C", 23));
		students.add(new Student("D", 16));
	}
	
    public void testContains() throws Exception {
        assertTrue(students.contains(new Student("A", 15)));
        assertTrue(students.contains(new Student("B", 18)));
    }

}
