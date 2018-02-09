package net.comments.sample;


public class App {
    public static void main(String[] args) {
        Student andrey = new AttentiveStudent("Andrey");
        Student nastya = new AttentiveStudent("Nastya");
        Student dima = new BadStudent("Dima");

        Teacher vasya = new TeacherOne("Vasya");

        Room roomOne = new TrainingRoom();

        go(andrey);
        go(nastya);
        go(dima);

        go(vasya);

        roomOne.accept(andrey);

    }

    private static void go(Student someone) {
        System.out.println(String.format("There is %s in the room!", someone.name()));
        someone.learn();
    }
    private static void go(Teacher someone) {
        System.out.println(String.format("There is %s in the room also.", someone.name()));
        someone.teach();


    }

}
