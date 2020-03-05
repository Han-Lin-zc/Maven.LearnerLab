package io.zipcoder.interfaces;

public class Student extends Person implements Learner{


    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {

    }

    @Override
    public Double getTotalStudyTime() {
        return null;
    }
}
