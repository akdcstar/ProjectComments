package net.comments.sample;


public class BadStudent implements Student {
    private final String name;

    public BadStudent(String name) {

        this.name = name;
    }

    public void learn(Subject someSubject) {

        System.out.println(this.name + " is sleeping and does not learn how to " + someSubject.getSubjectTitle());
    }

    public String name() {
        return this.name;
    }
}