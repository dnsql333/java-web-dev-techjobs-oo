package Test;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;

public class JobTest {
    Job test1;
    Job test2;

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

}
