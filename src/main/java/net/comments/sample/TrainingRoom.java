package net.comments.sample;

public class TrainingRoom implements Room {
    private final int roomSize;
    private final String name;

    public TrainingRoom(int roomSize, String name) {
        this.roomSize = roomSize;
        this.name = name;
    }

    public void accept(Person somePerson) {
            System.out.println(somePerson.name() + " went into the Training room.");
    }

    public int getRoomSize() {
        return roomSize;
    }

    public String name() {
        return this.name;
    }
}
