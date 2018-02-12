package net.comments.sample;

public class SubjectName implements Subject {

    private final String name;

    public SubjectName(String name) {
        this.name = name;
    }

    public String getSubjectTitle() {
        return this.name;
    }

    public void learnBy(Student someStudent, Subject someSubject) {
        System.out.println(someStudent.name() + " is learning " + someSubject.getSubjectTitle());

    }

    public void readBy(Teacher someTeacher, Subject someSubject) {
        System.out.println(someTeacher.name() + " is reading " + someSubject.getSubjectTitle());
    }


}

