package net.comments.sample;

public class SubjectName implements Subject {

    private final String name;

    public SubjectName(String name) {
        this.name = name;
    }

    public String getSubjectTitle() {
        return this.name;
    }
}

