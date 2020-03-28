package io.zipcoder.interfaces;

public final class Students extends People<Student> {

    private final static Students INSTANCE = new Students();

    private Students() {
        add(new Student(1, "Han"));
        add(new Student(2, "Vuong"));
        add(new Student(3, "Moe"));
        add(new Student(4, "Kevin"));
    }

    public static Students getInstance() {
        return INSTANCE;
    }

    public Student[] getArray() {
        return getPersonList().toArray(new Student[0]);
    }

}
