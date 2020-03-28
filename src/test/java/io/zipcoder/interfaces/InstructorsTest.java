package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class InstructorsTest {

    @Test
    public void instructorSingletonTest() {
        Integer expected = 4;
        People instructors = Students.getInstance();

        Integer actual = instructors.count();

        Assert.assertEquals(expected, actual);
    }

}