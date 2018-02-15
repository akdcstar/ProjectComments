package net.comments.sample;

public interface Subject {
    String getSubjectName();

    void learnBy(Student someStudent);

    void readBy(Teacher someTeacher);
}
