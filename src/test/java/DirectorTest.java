import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Kira", "KM99887766", 100000, "Trip Hazards", 1000000);
    }

    @Test
    public void getDirectorName(){
        assertEquals("Kira", director.getName());
    }

    @Test
    public void getDirectorNINumber(){
        assertEquals("KM99887766", director.getNiNumber());
    }

    @Test
    public void getDirectorSalary(){
        assertEquals(100000, director.getSalary());
    }

    @Test
    public void getDirectorDepartment(){
        assertEquals("Trip Hazards", director.getDeptName());
    }

    @Test
    public void getDirectorBudget(){
        assertEquals(1000000, director.getBudget(), 0.01);
    }

    @Test
    public void giveDirectorRaise(){
        assertEquals(200000, director.raiseSalary(100000), 0.01);
    }

    @Test
    public void getDirectorBonus(){
        assertEquals(2000, director.getPayBonus());
    }


}
