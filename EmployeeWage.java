package employeewage;
import java.util.Random;
public class EmployeeWage {
public static void main(String[] args) {
	System.out.println("Welocome to Employee Wage Computation Problem");
	Random random = new Random();
	int empPerHr=20;
	int empHr = 0;
	int month = 20;
	int empWage = 0;
	for (int i = 0; i < month; i++) {
		int Ran = random.nextInt(3);
		switch (Ran) {
		case 2:
			System.out.println("Employee is Full Present");
			empHr=8;
			break;
		case 1:
			System.out.println("Employee is Part-time Present");
			empHr=4;
			break;
		case 0:
			System.out.println("Employee is Absent");
		}
		int Salary=empPerHr*empHr;
		empWage=empWage+Salary;
	}
	System.out.println("Employee Salary for month is "+empWage);
}
}
