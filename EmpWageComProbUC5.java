public class EmpWageComProbUC5 {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;

	public static void main(String[] args) {

	int emphrs = 0;
	int empwage = 0;
	int totalempwage = 0;
	for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
	int empcheck = (int) Math.floor(Math.random() * 10) % 3;

	switch (empcheck) {
		case IS_PART_TIME:
	 		emphrs = 8;
		case IS_FULL_TIME:
			emphrs = 12;
			break;
		default:
			emphrs = 0;
		}
	empwage = emphrs * EMP_RATE_PER_HOUR;
	totalempwage += empwage;
	System.out.println("Emp Wage: " + empwage);
	}
	System.out.println("Total Emp wage: " + totalempwage);
	}
}
