class Person{
	void Nationality() {
		System.out.println("Ghanaian");
	}
	void place() {
		System.out.println("Reside in Accra");
	}
}

class Employee extends Person{
	void Organization() {
		System.out.println("Person is an Employee that works with Organzation");
	}
	void place() {
		System.out.println("Organization is Situated in Takoradi,Ghana");
	
	}
	
}

class Manager extends Employee{
	void Subordinate() {
		System.out.println("A Person is an Employee who can be a Manager or a Subordinate");
	}
	void place() {
		System.out.println("Manager works in an Organization that is Situated in Takoradi,Ghana");
	}
}


public class Q3 {

	public static void main(String[] args) {
		
		Manager poff = new Manager();
		poff.Nationality();
		
		poff.Organization();
		
		poff.Subordinate();
		
		poff.place();
		

	}

}
