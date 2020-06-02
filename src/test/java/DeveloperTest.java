import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Freya", "FM94847464", 75000);
    }

    @Test
    public void getDeveloperName(){
        assertEquals("Freya", developer.getName());
    }

    @Test
    public void getDeveloperNINumber(){
        assertEquals("FM94847464", developer.getNiNumber());
    }

    @Test
    public void getDeveloperSalary(){
        assertEquals(75000, developer.getSalary());
    }

    @Test
    public void giveDeveloperRaise(){
        assertEquals(80000, developer.raiseSalary(5000), 0.01);
    }

    @Test
    public void getDeveloperBonus(){
        assertEquals(750, developer.getPayBonus());
    }
}
