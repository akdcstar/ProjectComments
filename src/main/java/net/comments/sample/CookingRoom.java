package net.comments.sample;

public class CookingRoom implements Room {

    public void accept(Person somePerson) {

        System.out.println(somePerson.name() + " went into the Cooking room.");
    }

    public int getRoomSize() {
        return 555;
    }

}
