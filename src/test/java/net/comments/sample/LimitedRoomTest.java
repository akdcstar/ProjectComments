package net.comments.sample;

import org.hamcrest.MatcherAssert;
import org.hamcrest.collection.IsIterableContainingInOrder;
import org.testng.annotations.Test;

public class LimitedRoomTest {

    @Test
    public void testGetPersonInRoom() {
        LimitedRoom roomOne = new LimitedRoom(2);
        Person andrey = new AttentiveStudent("andrey");
        roomOne.accept(andrey);
        MatcherAssert.assertThat(roomOne.getPersonInRoom(), IsIterableContainingInOrder.contains(andrey));
    }

}

