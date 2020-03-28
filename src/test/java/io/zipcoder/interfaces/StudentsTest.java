package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void studentSingletonTest() {
        Students instance = Students.getInstance();
        int i = 1;
        for (Student s : instance.getArray()) {
            Assert.assertNotNull(s);
            Assert.assertEquals(s.getId(), i);
            i++;
        }
    }
}