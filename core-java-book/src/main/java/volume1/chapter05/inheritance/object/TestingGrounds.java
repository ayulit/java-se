package volume1.chapter05.inheritance.object;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestingGrounds {

	public static void main(String[] args) {
		
		Object obj = new Employee("Harry Hacker", 35000);
		
		Employee em = (Employee) obj;
		
		int number = 5;
		
		obj = number;
		
		System.out.println(obj);
		
		Employee[] staff = new Employee[10];
		obj = staff;       // ok!
		obj = new int[10]; // ok!
		
		obj.equals(null);
//		null.equals(obj); Forbidden!  
		
		System.out.println(obj.equals(null));

		System.out.println("\ninstanceof");
		System.out.println("hello" instanceof Object);    // true
//		System.out.println(number instanceof Object);  Incompared!
		System.out.println(null instanceof Object); // true!	
		
		String glossyCube = "Buagaga";
		System.out.println(glossyCube instanceof String); // true
		
		Employee e = new Employee("Tim Cook", 1000000, 1998, 03, 01);
		Manager  m = new  Manager("Tim Cook", 1000000, 1998, 03, 01);
		
		System.out.println("\nGeneral Contract");
		System.out.println(e.equals(m));
//		System.out.println(m.equals(e));
		
		System.out.println("\nAbstractSet.equals()");
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2));
		Set<Integer> set2 = new TreeSet<Integer>(Arrays.asList(1, 2));

		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set1.equals(set2)); // true
		System.out.println(set2.equals(set1)); // true
		
		
	}

}
