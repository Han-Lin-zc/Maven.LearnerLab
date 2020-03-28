package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public abstract class People<E extends  Person> {

    private List<E> personList;

    public People() {
        this.personList = new ArrayList<>();
    }

    public void add(E person) {
        this.personList.add(person);
    }

    public E findById(Long id) {
        for(E p : personList) {
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public Boolean contain(E person) {
        return personList.contains(person);
    }

    public void remove(E person) {
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

    public List<E> getPersonList() {
        return personList;
    }
}
