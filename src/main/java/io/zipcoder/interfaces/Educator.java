package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    NOBLES("Nobles", 1),
    ROBERTO("Roberto", 2),
    DOLIO("Dolio", 3),
    FROILAN("Froilan", 4);



    final Instructor instructor;
    double timeWorked;

    Educator(String name, long id) {
        instructor = new Instructor(id, name);
        Instructors.getInstance().add(instructor);
        this.timeWorked = 0.0;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }
}
