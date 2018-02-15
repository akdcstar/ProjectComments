package net.comments.sample;

public class TechTeacher implements Teacher {
    private final String name;

    public TechTeacher(String name) {
        this.name = name;
    }

    public void teach(Subject subjectName) {
        System.out.println(this.name + " is a teacher and he is teaching students how to " + subjectName.getSubjectName());
    }

    public String getName() {
        return this.name;
    }
}
