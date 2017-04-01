
/** @Manager class inherited in Trainee */
public class Trainee extends Manager {
	/** @Method */
	void output() {
		/** @Output */
		System.out.println(" salaries are ");
	}

	public static void main(String[] args) {
		/** @Object creation */
		Manager o = new Manager();
		/** @Passing value to object */
		o.salary(2000);
		o.tsalary(5000);
	}
}