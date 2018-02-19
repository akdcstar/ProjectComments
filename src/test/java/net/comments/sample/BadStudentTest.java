package net.comments.sample;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class BadStudentTest {

    @Test
    public void checkName() {
        MatcherAssert.assertThat(new BadStudent("Ivan").getName(), Matchers.is("Ivan"));
    }


}
