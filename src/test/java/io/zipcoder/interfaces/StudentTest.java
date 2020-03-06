package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class StudentTest {

    @Test
    public void implementationTest() {
        Student student = new Student(102193, "Han");
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void inheritanceTest() {
        Student student = new Student(102193, "Han");
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void learnTest() {
        Student student = new Student(102193, "Han");
        student.learn(24);
        double expected = 24;
        Assert.assertEquals(expected, student.getTotalStudyTime(), 2);
    }

}