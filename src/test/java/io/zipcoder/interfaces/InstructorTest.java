package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class InstructorTest {


    Instructor instructor;


    @Before
    public void setUp() {
        instructor = new Instructor(54321, "Kris");
    }

    @Test
    public void implementationTest() {
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void inheritanceTest() {
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void teachTest() {
        Student student = new Student(102193, "Han");

        instructor.teach(student, 8);
        double expected = 8;

        Assert.assertEquals(expected, student.getTotalStudyTime(), 3);
    }

    @Test
    public void lectureTest() {
        Student student1 = new Student(1111, "V");
        Student student2 = new Student(2222, "Vo");
        Student student3 = new Student(3333, "Von");
        Student student4 = new Student(4444, "Vuong");

        Student[] arr = {student1, student2, student3, student4};

        instructor.lecture(arr, 8);
        for (Student student : arr) {
            Assert.assertEquals(2, student.getTotalStudyTime(), 3);
        }

    }
}