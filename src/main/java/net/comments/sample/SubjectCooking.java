package net.comments.sample;

public class SubjectCooking implements Subject {
    private final String subjectName = "Bake a Cake";

    public String getSubjectName() {
        return this.subjectName;
    }

    public void learnBy(Student someStudent) {
        System.out.println(someStudent.getName() + " is going to learn about: ");
        System.out.println("1. Lesson 1");
        System.out.println("2. Lesson 2");
        System.out.println("3. Lesson 3");
        System.out.println("4. Lesson 4");
    }

    public void readBy(Teacher someTeacher) {
        System.out.println(someTeacher.getName() + " is going to teach about: ");
        System.out.println("1. Lesson 1");
        System.out.println("2. Lesson 2");
        System.out.println("3. Lesson 3");
        System.out.println("4. Lesson 4");
    }
}
