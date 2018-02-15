package net.comments.sample;

public class UnlimitedRoom implements Room {

    public void accept(Person somePerson) {
        System.out.println(somePerson.getName() + " went into the room.");
    }
}
