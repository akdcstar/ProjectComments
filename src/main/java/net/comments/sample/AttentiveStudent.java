package net.comments.sample;


public class AttentiveStudent implements Student {
    private final String name;

    public AttentiveStudent(String name){

        this.name = name;
    }

    public void learn(Subject someSubject) {

        System.out.println(this.name + " is learning how to " + someSubject.getSubjectTitle());
    }

    public String name() {

        return this.name;
    }
}