package Test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class testJobsForEquality {
    Job object1;
    Job object2;

    @Before
    public void twoDifferentObjects() {
        object1 = new Job("Dog Sitter", new Employer("DoggieSpa"), new Location("STL"), new PositionType("Type1"), new CoreCompetency("pro"));
        object2 = new Job("Dog Sitter", new Employer("DoggieSpa"), new Location("STL"), new PositionType("Type1"), new CoreCompetency("pro"));
    }

    @Test
    public void TwoDifferentIds() {
        assertFalse(object1.equals(object2));
    }
//    public void TwoDifferentIds(){
//        assertFalse(object1 == object2);
//    }


}
