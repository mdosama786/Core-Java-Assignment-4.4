
/** @creating a class manager which will be inherited */
public class Manager {
	/** @create a method which will be called */
	void salary(double b) {
		/** @Manager salary */
		System.out.println("Manager salary before allowance. " + b);
		b = b + (0.15) * b;
		System.out.println("Manager salary after adding allowance. " + b);
	}

	void tsalary(double b) {
		/** @Trainee salary */
		System.out.println("Trainee salary before allowance. " + b);
		b = b + (0.10) * b;
		System.out.println("Trainee salary after adding allowance. " + b);
	}
}