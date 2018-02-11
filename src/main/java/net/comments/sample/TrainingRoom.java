package net.comments.sample;

public class TrainingRoom implements Room {

    public void accept(Person somePerson) {

        System.out.println(somePerson.name() + " went into the Training room.");
    }

}
