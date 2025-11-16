import com.tnsif.assignment_packagemodifier.employees.*;
import com.tnsif.assignment_packagemodifier.utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
		EmployeeUtilities e = new EmployeeUtilities();
		
        Manager m = new Manager("Bhuvana", 137, 70000, "TCS", 5);
        Developer d = new Developer("Abi", 770, 60000, "Java", "Software", 3);

        System.out.println("Manager Details: " +e.getManagerInfo(m));
        System.out.println("Developer Details: " + e.getDeveloperInfo(d));

	}

}
