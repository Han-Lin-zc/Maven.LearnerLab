package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {

    private final static Instructors INSTANCE = new Instructors();

    private Instructors() {
        add(new Instructor(1, "Nobles"));
        add(new Instructor(2, "Roberto"));
        add(new Instructor(3, "Dolio"));
        add(new Instructor(4, "Froilan"));
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

    public Instructor[] getArray() {
        return getPersonList().toArray(new Instructor[0]);
    }
}
