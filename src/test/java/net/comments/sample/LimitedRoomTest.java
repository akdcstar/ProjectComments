package net.comments.sample;

import org.hamcrest.MatcherAssert;
import org.hamcrest.collection.IsIterableContainingInOrder;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class LimitedRoomTest {

    @Test
    public void testGetPersonInRoom() {
        List<Person> personList = new ArrayList<Person>();
        Person andrey = new AttentiveStudent("andrey");
        Person sasha = new TechTeacher("sasha");
        personList.add(andrey);
        personList.add(sasha);

        MatcherAssert.assertThat(personList, IsIterableContainingInOrder.contains(andrey, sasha));
//        MatcherAssert.assertThat(personList, IsIterableContainingInAnyOrder.containsInAnyOrder(sasha, andrey));
    }
}
