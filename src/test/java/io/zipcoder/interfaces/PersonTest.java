package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class PersonTest {

    @Test
    public void constructorTest() {
        Person person = new Person(123456, "Han");
        long expectedId = 123456;
        String expectedName = "Han";
        Assert.assertEquals(expectedId, person.getId());
        Assert.assertEquals(expectedName, person.getName());
    }

    @Test
    public void setNameTest() {
        Person person = new Person(12323, "han");
        person.setName("Jungkook");
        String expected = "Jungkook";
        Assert.assertEquals(expected, person.getName());
    }
}
