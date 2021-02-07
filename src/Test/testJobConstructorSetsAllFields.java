package Test;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;

public class testJobConstructorSetsAllFields {
    Job testAll;


    @Before
    public void testSettingJobConstructorSetsAllFields(){
        testAll = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void JobSetsNameValue() {
        assertEquals("Product tester", testAll.getName());
    }

    @Test
    public void JobSetsEmployerValue() {
        Employer expected = testAll.getEmployer();
        assertEquals("ACME", expected.getValue());
    }
    @Test
    public void JobSetsLocationValue() {
        Location expected = testAll.getLocation();
        assertEquals("Desert", expected.getValue());
    }

    @Test
    public void JobSetsPositionTypeValue() {
        PositionType expected = testAll.getPositionType();
        assertEquals("Quality control", expected.getValue());
    }

    @Test
    public void JobSetsCoreCompetencyValue() {
        CoreCompetency expected = testAll.getCoreCompetency();
        assertEquals("Persistence", expected.getValue());
    }

    @Test
    public void CheckClassOfTestAll() {
        assertTrue(testAll instanceof Job);
    }
}
