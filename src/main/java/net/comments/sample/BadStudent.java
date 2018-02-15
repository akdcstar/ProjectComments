package net.comments.sample;

public class BadStudent implements Student {
    private final String name;

    public BadStudent(String name) {
        this.name = name;
    }

    public void learn(Subject subjectName) {
        System.out.println(this.getName() + " is sleeping and does not learn " + subjectName.getSubjectName());
    }

    public String getName() {
        return this.name;
    }
}
