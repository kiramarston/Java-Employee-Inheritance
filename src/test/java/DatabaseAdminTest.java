import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

        DatabaseAdmin databaseAdmin;

        @Before
        public void before(){
            databaseAdmin = new DatabaseAdmin("Skye", "SM93837363", 85000);
        }

        @Test
        public void getDeveloperName(){
            assertEquals("Skye", databaseAdmin.getName());
        }

        @Test
        public void getDeveloperNINumber(){
            assertEquals("SM93837363", databaseAdmin.getNiNumber());
        }

        @Test
        public void getDeveloperSalary(){
            assertEquals(85000, databaseAdmin.getSalary());
        }

        @Test
        public void giveDeveloperRaise(){
            assertEquals(95000, databaseAdmin.raiseSalary(10000), 0.01);
        }

        @Test
        public void getDeveloperBonus(){
            assertEquals(850, databaseAdmin.getPayBonus());
        }
}

