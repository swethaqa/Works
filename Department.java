package interfaceExp;

public class Department implements Employee{

	public static void main(String[] args) {
		
		Employee e = new Department();
		e.salary();
		e.hrPolicy();
	}

	@Override
	public void salary() {
		
		System.out.println("Salary granted for this month");
	}

	@Override
	public void hrPolicy() {
		
		System.out.println("HR polocies applied");
	}

}
