package net.comments.sample;

import org.hamcrest.MatcherAssert;
import org.hamcrest.collection.IsIterableContainingInOrder;
import org.testng.annotations.Test;

public class UnlimitedRoomTest {

    @Test
    public void testGetPersonInRoom() {
        UnlimitedRoom roomOne = new UnlimitedRoom();
        Person andrey = new AttentiveStudent("andrey");
        roomOne.accept(andrey);
        MatcherAssert.assertThat(roomOne.getPersonInRoom(), IsIterableContainingInOrder.contains(andrey));
    }
}
