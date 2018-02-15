package net.comments.sample;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class AttentiveStudentTest {

    @Test
    public void checkName() {
        MatcherAssert.assertThat(new AttentiveStudent("Oleg").getName(), Matchers.is("Oleg"));
    }

}