package net.comments.sample;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class TechTeacherTest {

    @Test
    public void checkName() {
        MatcherAssert.assertThat(new TechTeacher("Egor").getName(), Matchers.is("Egor"));
    }
}