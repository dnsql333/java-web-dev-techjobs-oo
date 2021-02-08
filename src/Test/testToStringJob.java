package Test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import java.util.Objects;

import static org.junit.Assert.*;

public class testToStringJob {
    Job toStringObject;
    Job toStringObject2;

    @Before
    public void ToStringJobTest() {
        toStringObject = new Job("_____", new Employer("_____"), new Location("_____"), new PositionType("_____"), new CoreCompetency("_____"));
        toStringObject2 = new Job("_____", new Employer("_____"), new Location("_____"), new PositionType("_____"), new CoreCompetency("_____"));
    }

    public String compareStringObject =
            "ID: " + "1" + '\n' +
                    "Name: " + "_____" + '\n' +
                    "Employer: " + "_____" + '\n' +
                    "Location: " + "_____" + '\n' +
                    "Position Type: " + "_____" + '\n' +
                    "Core Competency: " + "_____" + '\n';

    @Override
    public boolean equals(Object compareStringObject) {
        if (this == compareStringObject) return true;
        if (compareStringObject == null || getClass() != compareStringObject.getClass()) return false;
        testToStringJob that = (testToStringJob) compareStringObject;
        return Objects.equals(toStringObject, that.compareStringObject);
//                && Objects.equals(toStringObject2, that.toStringObject2);
    }
}
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(toStringObject, compareStringObject);
//    }
//}

//    @Test
//    public void returnsToString() {
//        assertEquals(compareStringObject, toStringObject2);
//    }
//}

