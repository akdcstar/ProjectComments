package net.comments.sample;


public class TeacherOne implements Teacher {
    private final String name;

    public TeacherOne (String name){
        this.name = name;
    }

    public void teach() {
        System.out.println(this.name + " is a teacher and he is teaching students.");
    }

    public String name() {
        return this.name;
    }
}
