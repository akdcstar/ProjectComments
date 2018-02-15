package net.comments.sample;

import java.util.ArrayList;
import java.util.List;

public class LimitedRoom implements Room {
    private final int roomSize;
    List<Person> personList = new ArrayList<Person>();

    public LimitedRoom(int roomSize) {
        this.roomSize = roomSize;
    }

    public void accept(Person somePerson) {
        if (personList.size() < this.roomSize) {
            personList.add(somePerson);
            System.out.println(somePerson.getName() + " went into the room.");
        } else {
            System.out.println(somePerson.getName() + " can't access the room, because there is no free places");
        }
    }
}
