package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;



public class PeopleTest {

    Person person = new Person(1L, "Han");
    People people = new People();

    @Test
    public void addTest() {
        Integer expected = 1;
        people.add(person);
        Integer actual = people.count();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        people.add(person);
        Assert.assertTrue(people.contain(person));
        people.remove(person);
        Assert.assertFalse(people.contain(person));
    }

    @Test
    public void FindByIdTest() {
        people.add(person);
        String expectedName = "Han";
        Person expected = people.findById(1L);
        String actualName = expected.getName();
        Assert.assertEquals(expectedName, actualName);
    }
}