package net.comments.sample;

public class AttentiveStudent implements Student {
    private final String name;

    public AttentiveStudent(String name){
        this.name = name;
    }

    public void learn(Subject subjectName) {
        System.out.println(this.getName() + " is learning how to " + subjectName.getSubjectName());
    }

    public String getName() {
        return this.name;
    }
}


