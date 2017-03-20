package volume1.chapter05.inheritance.object;

public class TestingGrounds {

	public static void main(String[] args) {
		
		Object obj = new Employee("Harry Hacker", 35000);
		
		Employee e = (Employee) obj;
		
		int number = 5;
		
		obj = number;
		
		System.out.println(obj);
		
		Employee[] staff = new Employee[10];
		obj = staff;       // ok!
		obj = new int[10]; // ok!
		
	}

}
