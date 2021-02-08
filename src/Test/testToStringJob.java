package Test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import java.util.Objects;

import static org.junit.Assert.*;

public class testToStringJob {
    Job toStringObject;

    @Before
    public void ToStringJobTest() {
        toStringObject = new Job("_____", new Employer("_____"), new Location("_____"), new PositionType("_____"), new CoreCompetency("_____"));
    }


    @Test
    public void returnsToString() {
        String compareStringObject =
                "ID: " + toStringObject.getId() + '\n' +
                        "Name: " + "_____" + '\n' +
                        "Employer: " + "_____" + '\n' +
                        "Location: " + "_____" + '\n' +
                        "Position Type: " + "_____" + '\n' +
                        "Core Competency: " + "_____" + '\n';

        assertEquals(compareStringObject, toStringObject.toString());
    }
}
