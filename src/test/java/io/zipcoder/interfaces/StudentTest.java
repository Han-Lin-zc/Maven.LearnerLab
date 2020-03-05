package io.zipcoder.interfaces;

import org.junit.Assert;


public class StudentTest {

    public void implementationTest() {
        Student student = new Student(102193, "Han");
        Assert.assertTrue(student instanceof Learner);
    }

    public void inheritanceTest() {
        Student student = new Student(102193, "Han");
        Assert.assertTrue(student instanceof Person);
    }

    public void learnTest() {

    }
}