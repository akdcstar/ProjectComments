package net.comments.sample;

public interface Subject {

    String getSubjectTitle();

    void learnBy(Student someStudent);

    void readBy(Teacher someTeacher);
}
