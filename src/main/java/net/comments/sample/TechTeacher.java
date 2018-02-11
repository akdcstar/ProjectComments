package net.comments.sample;

public class TechTeacher implements Teacher {
    private final String name;

    public TechTeacher(String name) {
        this.name = name;
    }

    public void teach(Subject someSubject) {

        System.out.println(this.name + " is a teacher and he is teaching students how to " + someSubject.getSubjectTitle());
    }

    public String name() {

        return this.name;
    }
}
