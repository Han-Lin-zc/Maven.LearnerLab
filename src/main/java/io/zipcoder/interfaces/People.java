package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class People {

    private List<Person> personList;

    public People() {
        this.personList = new ArrayList<>();
    }

    public void add(Person person) {
        this.personList.add(person);
    }

    public Person findById(Long id) {
        for(Person p : personList) {
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public Boolean contain(Person person) {
        return personList.contains(person);
    }

    public void remove(Person person) {
        this.personList.remove(person);
    }

    public void remove(Long id) {
        this.personList.remove(findById(id));
    }

    public void removeAll() {
        this.personList.clear();
    }

    public Integer count() {
        return this.personList.size();
    }

    public Person[] toArray() {
        return (Person[]) this.personList.toArray();
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
