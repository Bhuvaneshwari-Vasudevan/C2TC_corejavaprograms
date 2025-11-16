package com.tnsif.assignment_packagemodifier.utilities;

import com.tnsif.assignment_packagemodifier.employees.*;

public class EmployeeUtilities {
	public String getEmployeeInfo(Employee e) {
        return e.toString();
    }
    public String getManagerInfo(Manager m) {
        return m.toString();
    }
    public String getDeveloperInfo(Developer d) {
        return d.toString();
    }
		
}
