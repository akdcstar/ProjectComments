package net.comments.sample;

public class TrainingRoom implements Room {
    private final int roomSize;
    private int roomCapacity = 0;

    public TrainingRoom(int roomSize) {
        this.roomSize = roomSize;
    }

    public void accept(Person somePerson) {
        this.roomCapacity = this.roomCapacity + 1;
        if (this.roomCapacity <= roomSize) {
            System.out.println(somePerson.name() + " went into the Training room.");
        } else {
            System.out.println(somePerson.name() + " can't access to the room, because there is no free space.");
        }

    }

}
