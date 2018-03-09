package tests.objects;

public interface CommentsPage {
    void open();

    void newComment();

    CommentsActions commentsActions();

    CommentsTable currentComments();

    void navigateToPage(int page);

    int commentsPagesSize();
}
