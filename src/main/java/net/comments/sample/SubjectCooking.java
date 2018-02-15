package net.comments.sample;

public class SubjectCooking implements Subject {
    private final String subjectName = "Bake a Cake";

    public String getSubjectName() {
        return this.subjectName;
    }

    public void learnBy(Student someStudent) {
        System.out.println(someStudent.getName() + " is going to learn about: ");
        System.out.println("1. Recipe 1");
        System.out.println("2. Recipe 2");
        System.out.println("3. Recipe 3");
        System.out.println("4. Recipe 4");
    }

    public void readBy(Teacher someTeacher) {
        System.out.println(someTeacher.getName() + " is going to teach about: ");
        System.out.println("1. Recipe 1");
        System.out.println("2. Recipe 2");
        System.out.println("3. Recipe 3");
        System.out.println("4. Recipe 4");
    }
}
