package net.comments.sample;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class SubjectCookingTest {

    @Test
    public void checkSubjectName() {
        MatcherAssert.assertThat(new SubjectCooking().getSubjectName(), Matchers.is("Bake a Cake"));
    }
}