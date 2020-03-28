package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {

    @Test
    public void implementationTest() {
        Educator educator = Educator.NOBLES;
        Assert.assertTrue(educator instanceof Teacher);
    }

    @Test
    public void teachTest() {
        Educator educator = Educator.ROBERTO;
        Student student = new Student(102193, "Han");

        educator.teach(student, 8);
        double expected = 8;

        Assert.assertEquals(expected, student.getTotalStudyTime(), 3);
    }

    @Test
    public void lectureTest() {
        Educator educator = Educator.DOLIO;
        Student student1 = new Student(1111, "V");
        Student student2 = new Student(2222, "Vo");
        Student student3 = new Student(3333, "Von");
        Student student4 = new Student(4444, "Vuong");

        Student[] arr = {student1, student2, student3, student4};

        educator.lecture(arr, 8);
        for (Student student : arr) {
            Assert.assertEquals(2, student.getTotalStudyTime(), 3);
        }
    }

}