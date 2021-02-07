package Test;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;

public class JobTest {
    Job test1;
    Job test2;
//    Job testAll;

    @Before
    public void testSettingJobId() {
        test1 = new Job("Dog Sitter", new Employer("DoggieSpa"), new Location("STL"), new PositionType("Type1"), new CoreCompetency("pro"));
        test2 = new Job("Cat Sitter", new Employer("CatSpa"), new Location("New York"), new PositionType("Type2"), new CoreCompetency("entry"));
    }

    @Test
    public void testCatDogId(){
        assertTrue(test1.getId() == 1);
        assertTrue(test2.getId() == 2);
    }
//
//    @Before
//    public void testSettingJobConstructorSetsAllFields(){
//        testAll = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//    }
//
//    @Test
//    public void JobSetsNameValue() {
//        assertEquals("Product tester", testAll.getName());
//    }
//
//    @Test
//    public void JobSetsEmployerValue() {
//        Employer expected = testAll.getEmployer();
//        assertEquals("ACME", expected.getValue());
//    }
////    @Test
////    public void JobSetsLocationValue() {
////        Location expected = testAll.getLocation();
////        assertEquals("Desert", expected.getValue());
//    }

    }
