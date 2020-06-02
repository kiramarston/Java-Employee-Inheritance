import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Employee("Merlin", "MM95857565", 25000);
    }

    @Test
    public void getEmployeeName(){
        assertEquals("Merlin", employee.getName());
    }

    @Test
    public void getEmployeeNINumber(){
        assertEquals("MM95857565", employee.getNiNumber());
    }

    @Test
    public void getEmployeeSalary(){
        assertEquals(25000, employee.getSalary());
    }

    @Test
    public void giveEmployeeRaiseSuccess(){
        assertEquals(25500, employee.raiseSalary(500), 0.01);
    }

    @Test
    public void giveEmployeeRaiseFailure(){
        assertEquals(25000, employee.raiseSalary(-100), 0.01);
    }

    @Test
    public void getEmployeePayBonus(){
        assertEquals(250, employee.getPayBonus());
    }
}
