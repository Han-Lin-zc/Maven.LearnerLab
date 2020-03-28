package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    ZipCodeWilmington zcw;
    Students students;
    Instructor instructor;

    @Before
    public void setUp() {
        zcw = ZipCodeWilmington.getInstance();
        students = Students.getInstance();
        instructor = new Instructor(1, "Nobles");
    }

    @Test
    public void hostLectureWithTeacherTest() {
        Double expected = 5.0;
        zcw.hostLecture(instructor, 10);
        Double actual = zcw.getStudyMap().get(students.findById(1L));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hostLectureWithIdTest() {
        Double expected = 2.5;
        zcw.hostLecture(1L, 10);
        Double actual = zcw.getStudyMap().get(students.findById(2L));
        Assert.assertEquals(expected, actual);
    }
}