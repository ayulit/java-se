package volume1.chapter05.inheritance.object;

public class HashCodeTest{

	public static void main(String[] args) {

		String s = "Hello";
		System.out.println(s.hashCode());

		Object obj = new Object();
		
		System.out.println(obj.hashCode());
		System.out.println(obj);
		
		System.out.println("Hash code of equal objects");		
		Employee e1 = new Employee("Tim Cook", 1000000, 1998, 03, 01);
		Employee e2 = new Employee("Tim Cook", 1000000, 1998, 03, 01);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
	}

}

