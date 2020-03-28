package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class PeopleTest {

    Student han = new Student(1, "Han");
    People<Student> students;

    @Before
    public void setUp() {
        students = Students.getInstance();
    }

    @Test
    public void addTest() {
        Integer expected = 5;
        students.add(han);
        Integer actual = students.count();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        students.add(han);
        Assert.assertTrue(students.contain(han));
        students.remove(han);
        Assert.assertFalse(students.contain(han));
    }

    @Test
    public void FindByIdTest() {
        students.add(han);
        String expectedName = "Han";
        Person expected = students.findById(1L);
        String actualName = expected.getName();
        Assert.assertEquals(expectedName, actualName);
    }
}