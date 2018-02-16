package net.comments.sample;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class SubjectGitTest {

    @Test
    public void checkSubjectName() {
        MatcherAssert.assertThat(new SubjectGit().getSubjectName(), Matchers.is("Use Git"));
    }
}
