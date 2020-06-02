import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Willow", "WM91817161", 35000, "Hairballs");
    }

    @Test
    public void getManagerName(){
        assertEquals("Willow", manager.getName());
    }

    @Test
    public void getManagerNINumber(){
        assertEquals("WM91817161", manager.getNiNumber());
    }

    @Test
    public void getManagerSalary(){
        assertEquals(35000, manager.getSalary());
    }

    @Test
    public void getManagerDepartment(){
        assertEquals("Hairballs", manager.getDeptName());
    }

    @Test
    public void giveManagerRaise(){
        assertEquals(36000, manager.raiseSalary(1000), 0.01);
    }

    @Test
    public void getManagerPayBonus(){
        assertEquals(350, manager.getPayBonus());
    }
}
