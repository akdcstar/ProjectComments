package net.comments.sample;

import java.util.ArrayList;
import java.util.List;

public class UnlimitedRoom implements Room {

    private List<Person> personList = new ArrayList<Person>();

    public void accept(Person somePerson) {
        System.out.println(somePerson.getName() + " went into the room.");
        personList.add(somePerson);
    }

    public List<Person> getPersonInRoom() {
        return this.personList;
    }
}
